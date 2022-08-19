package com.chainsys.vehicleservice.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.chainsys.vehicleservice.dto.UserDetailsBookServiceDTO;
import com.chainsys.vehicleservice.dto.UserDetailsVehicleTypeDTO;
import com.chainsys.vehicleservice.model.UserDetails;
import com.chainsys.vehicleservice.service.UserDetailsService;

@Controller
@RequestMapping("/vehicleuserdetails")
public class UserDetailsController {
	@Autowired
	private UserDetailsService userDetailsService;

	@GetMapping("/getuserbyid")
	public String getUserId(@RequestParam("id") int id, Model model) {
		UserDetails userDetails = userDetailsService.findUserDetailsbyId(id);
		model.addAttribute("userdetails", userDetails);
		return "find-userdetails-form";
	}

	@GetMapping("/adduserdetails")
	public String showAddForm(Model model) {
		UserDetails userDetails = new UserDetails();
		model.addAttribute("adduserdetails", userDetails);
		return "add-userdetails-form";
	}

	@PostMapping("/adduser")
	public String addUserDetail(@Valid @ModelAttribute("adduserdetails") UserDetails userDetails, Errors errors) {
		if (errors.hasErrors()) {
			return "add-userdetails-form";
		} else
			userDetailsService.addUserDetails(userDetails);
		return "redirect:/vehicleuserdetails/userlogin";
	}

	@GetMapping("/updateuserdetails")
	public String showUpdateForm(@RequestParam("userid") int id, Model model) {
		UserDetails userDetails = userDetailsService.findUserDetailsbyId(id);
		model.addAttribute("updateuserdetails", userDetails);
		return "update-userdetails-form";
	}

	@PostMapping("/updateuser")
	public String updateUserDetail(@ModelAttribute("updateuserdetails") UserDetails userDetails) {
		userDetailsService.addUserDetails(userDetails);
		return "redirect:/vehicleuserdetails/userlist";
	}

	@GetMapping("/deleteuser")
	public String deleteUserDetails(@RequestParam("userid") int id) {
		userDetailsService.deleteUserDetailsbyId(id);
		return "redirect:/vehicleuserdetails/userlist";
	}

	@GetMapping("/userlist")
	public String getAllUserDetails(Model model) {
		List<UserDetails> userDetails = userDetailsService.getUserDetails();
		model.addAttribute("alluserdetails", userDetails);
		return "list-userdetails";
	}

	@GetMapping("/getuserdetailvehicletype")
	public String getUserDetailVehicleType(@RequestParam("user_id") int id, Model model) {
		UserDetailsVehicleTypeDTO dto = userDetailsService.getUserDetailsVehicleType(id);
		model.addAttribute("getuserdetails", dto.getUserDetails());
		model.addAttribute("vehicletypedetails", dto.getVehicleTypeList());
		return "userdetails-vehicletype";
	}

	@GetMapping("/getuserdetailbookservice")
	public String getUserDetailBookService(@RequestParam("user_id") int id, Model model) {
		UserDetailsBookServiceDTO dto = userDetailsService.getUserDetailsBookService(id);
		model.addAttribute("getuserdetail", dto.getUserDetails());
		model.addAttribute("bookservicedetails", dto.getBookService());
		return "userdetails-bookservice";
	}

	@GetMapping("/userlogin")
	public String loginUserDetailsform(Model model) {
		UserDetails userDetails = new UserDetails();
		model.addAttribute("user", userDetails);
		return "user-login-form";
	}

	@PostMapping("/checkuserlogin")
	public String checkingLoginAccess(@ModelAttribute("user") UserDetails userdetails, Model model) {
		UserDetails userDetails = userDetailsService.getUserDetailsByNameAndPassword(userdetails.getUserEmail(),
				userdetails.getUserPassword());
		if (userDetails != null) {
			model.addAttribute("userId", userDetails.getUserId());
			return "vehicletype";
		} else
			return "invalid-userlogin-error";
	}
}

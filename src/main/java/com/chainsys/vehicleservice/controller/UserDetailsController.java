package com.chainsys.vehicleservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.vehicleservice.pojo.UserDetails;
import com.chainsys.vehicleservice.service.UserDetailsService;

@Controller
@RequestMapping("/vehicleservice")
public class UserDetailsController {
	@Autowired
	private UserDetailsService userdetailsservice;

	@GetMapping("/getuserbyid")
	public String getUserId(@RequestParam("id") int id, Model model) {
		UserDetails userDetails = userdetailsservice.findUserDetailsbyId(id);
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
	public String addUserDetail(@ModelAttribute("adduserdetails") UserDetails userDetails) {
		userdetailsservice.addUserDetails(userDetails);
		return "redirect:/vehicleservice/userlist";
	}

	@GetMapping("/updateuserdetails")
	public String showUpdateForm(@RequestParam("userid") int id, Model model) {
		UserDetails userDetails = userdetailsservice.findUserDetailsbyId(id);
		model.addAttribute("updateuserdetails", userDetails);
		return "update-userdetails-form";
	}

	@PostMapping("/updateuser")
	public String updateUserDetail(@ModelAttribute("updateuserdetails") UserDetails userDetails) {
		userdetailsservice.addUserDetails(userDetails);
		return "redirect:/vehicleservice/userlist";
	}

	@GetMapping("/deleteuser")
	public String deleteUserDetails(@RequestParam("userid") int id) {
		userdetailsservice.deleteUserDetailsbyId(id);
		return "redirect:/vehicleservice/userlist";
	}

	@GetMapping("/userlist")
	public String getAllUserDetails(Model model) {
		List<UserDetails> userDetails = userdetailsservice.getUserDetails();
		model.addAttribute("alluserdetails", userDetails);
		return "list-userdetails";
	}
}

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
import com.chainsys.vehicleservice.dto.BookServiceServiceDetailsDTO;
import com.chainsys.vehicleservice.model.BookService;
import com.chainsys.vehicleservice.model.VehicleType;
import com.chainsys.vehicleservice.service.ServiceOfBookService;
import com.chainsys.vehicleservice.service.ServiceOfServiceCentre;
import com.chainsys.vehicleservice.service.VehicleTypeService;

@Controller
@RequestMapping("/vehiclebookservice")
public class BookServiceController {
	@Autowired
	private ServiceOfBookService bookServiceService;
	@Autowired
	private ServiceOfServiceCentre serviceOfServiceCentre;
	@Autowired
	private VehicleTypeService vehicleTypeService;
	
	@GetMapping("/getbookservicebyid")
	public String getBookServiceId(@RequestParam("id") int id, Model model) {
		BookService bookService = bookServiceService.findBookServicebyId(id);
		model.addAttribute("bookservice", bookService);
		return "find-bookservice-form";
	}

	@GetMapping("/addbookservice")
	public String showServiceForm(@RequestParam("userId")int id,Model model) {
		BookService bookService = new BookService();
		List<VehicleType> vehicleTypeList=vehicleTypeService.getVehicleTypeByUserid(id);
		model.addAttribute("vehicleTypeList", vehicleTypeList);
		bookService.setUserId(id);
		model.addAttribute("addbookservice", bookService);
		model.addAttribute("centrelocation", serviceOfServiceCentre.getServiceCentre());
		return "add-bookservice-form";
	}

	@PostMapping("/addservice")
	public String addBookService(@ModelAttribute("addbookservice") BookService bookService,Model model) {
		bookServiceService.addBookService(bookService);
		model.addAttribute("bookId", bookService.getBookingId());
		return "add-bookservice-form";
	}

	@GetMapping("/updatebookservice")
	public String showUpdateForm(@RequestParam("id") int id, Model model) {
		BookService bookService = bookServiceService.findBookServicebyId(id);
		model.addAttribute("updatebookservice", bookService);
		return "update-bookservice-form";
	}

	@PostMapping("/updateservice")
	public String updateBookService(@ModelAttribute("updatebookservice") BookService bookService) {
		bookServiceService.addBookService(bookService);
		return "redirect:/vehiclebookservice/bookservicelist";
	}

	@GetMapping("/deletebookservice")
	public String deleteBookService(@RequestParam("serviceid") int id) {
		bookServiceService.deleteBookServicebyId(id);
		return "redirect:/vehiclebookservice/bookservicelist";
	}

	@GetMapping("/bookservicelist")
	public String getAllBookService(Model model) {
		List<BookService> bookService = bookServiceService.getBookService();
		model.addAttribute("allbookservice", bookService);
		return "list-bookservice";
	}

	@GetMapping("/getbookserviceservicedetails")
	public String getBookServicesServicedetails(@RequestParam("user_id") int id, Model model) {
		BookServiceServiceDetailsDTO dto = bookServiceService.getBookServiceServiceDetails(id);
		model.addAttribute("getbookservice", dto.getBookService());
		model.addAttribute("servicedetailslist", dto.getServiceDetails());
		return "bookservice-servicedetails";
	}
}
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

import com.chainsys.vehicleservice.model.BookService;
import com.chainsys.vehicleservice.service.BookServiceService;

@Controller
@RequestMapping("/vehiclebookservice")
public class BookServiceController {
	@Autowired
	private BookServiceService bookserviceservice;

	@GetMapping("/getbookservicebyid")
	public String getBookServiceId(@RequestParam("id") int id, Model model) {
		BookService bookService = bookserviceservice.findBookServicebyId(id);
		model.addAttribute("bookservice", bookService);
		return "find-bookservice-form";
	}

	@GetMapping("/addbookservice")
	public String showServiceForm(Model model) {
		BookService bookService = new BookService();
		model.addAttribute("addbookservice", bookService);
		return "add-bookservice-form";
	}

	@PostMapping("/addservice")
	public String addBookService(@ModelAttribute("addbookservice") BookService bookService) {
		bookserviceservice.addBookService(bookService);
		return "redirect:/vehiclebookservice/bookservicelist";
	}

	@GetMapping("/updatebookservice")
	public String showUpdateForm(@RequestParam("id") int id, Model model) {
		BookService bookService = bookserviceservice.findBookServicebyId(id);
		model.addAttribute("updatebookservice", bookService);
		return "update-bookservice-form";
	}

	@PostMapping("/updateservice")
	public String updateBookService(@ModelAttribute("updatebookservice") BookService bookService) {
		bookserviceservice.addBookService(bookService);
		return "redirect:/vehiclebookservice/bookservicelist";
	}

	@GetMapping("/deletebookservice")
	public String deleteBookService(@RequestParam("serviceid") int id) {
		bookserviceservice.deleteBookServicebyId(id);
		return "redirect:/vehiclebookservice/bookservicelist";
	}

	@GetMapping("/bookservicelist")
	public String getAllBookService(Model model) {
		List<BookService> bookService = bookserviceservice.getBookService();
		model.addAttribute("allbookservice", bookService);
		return "list-bookservice";
	}
}
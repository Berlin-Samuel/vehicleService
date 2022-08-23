package com.chainsys.vehicleservice.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.chainsys.vehicleservice.model.Admin;
import com.chainsys.vehicleservice.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	private static final String ADMINCONTROL="admin-login-form";
	
	@Autowired
	private AdminService adminService;

	@GetMapping("/login")
	public String loginAccessform(Model model) {
		Admin theAdm = new Admin();
		model.addAttribute("admin", theAdm);
		return ADMINCONTROL;
	}

	@PostMapping("/checkadminlogin")
	public String checkingAccess(@Valid @ModelAttribute("admin") Admin theAdm, Model model) {
		Admin admin = adminService.getAdminDetailsByNameAndPassword(theAdm.getAdminEmail(), theAdm.getAdminPassword());
		if (admin != null) {
			return "admin-page";
		} else
			model.addAttribute("result","Invalid AdminName or Password!!");
			return ADMINCONTROL;
	}

	@GetMapping("/adminpage")
	public String adminpage(Model model) {
		Admin theAdm = new Admin();
		model.addAttribute("admin", theAdm);
		return "admin-page";
	}

}

package br.com.senac.littlehand.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profile")
public class EditProfileController {

	@GetMapping("/edit")
	public String edit() {
		
		return "editProfile";
	}
}

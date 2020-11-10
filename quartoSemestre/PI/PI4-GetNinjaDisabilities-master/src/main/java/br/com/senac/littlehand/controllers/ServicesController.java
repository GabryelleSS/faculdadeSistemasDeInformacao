package br.com.senac.littlehand.controllers;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.littlehand.model.enuns.DaysOfTheWeek;

@Controller
@RequestMapping("/services")
public class ServicesController {

	@GetMapping
	public ModelAndView services() {
		
		ModelAndView modelAndView = new ModelAndView("service/services");
		modelAndView.addObject("daysOfTheWeek", DaysOfTheWeek.values());
		modelAndView.addObject("services", Arrays.asList(1,2,3,4,5,6));
		
		return modelAndView;
	}
	
	@GetMapping("/details")
	public ModelAndView serviceDetails() {
		
		ModelAndView modelAndView = new ModelAndView("service/serviceDetails");
		
		return modelAndView;
	}
}

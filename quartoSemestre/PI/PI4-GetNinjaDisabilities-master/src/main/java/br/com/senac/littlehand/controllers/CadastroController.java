package br.com.senac.littlehand.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.senac.littlehand.model.entities.Consumer;
import br.com.senac.littlehand.model.entities.Provider;
import br.com.senac.littlehand.services.CadastroService;

@Controller
@RequestMapping("/registrations")
public class CadastroController {

	private final CadastroService cadastroService;

	public CadastroController(CadastroService cadastroService) {
		this.cadastroService = cadastroService;
	}

	@GetMapping("/newConsumer")
	public String loadConsumer(@ModelAttribute Consumer consumer) {
		return "cadastroConsumer";
	}

	@GetMapping("/newProvider")
	public String loadProvider(@ModelAttribute Provider provider) {
		return "cadastroProvider";
	}

	@PostMapping("/newConsumer")
	public String newConsumer(@ModelAttribute Consumer consumer) {
		cadastroService.save(consumer);
		return "login";
	}

	@PostMapping("/newProvider")
	public String newProvider(@ModelAttribute Provider provider, RedirectAttributes attributes) {
		cadastroService.save(provider);
		attributes.addFlashAttribute(provider);
		return "redirect:/registrations/newProvider/continue";
	}

	@GetMapping("/newProvider/continue")
	public String completeProvider(@ModelAttribute Provider provider) {
		return "cadastroPrestadorContinuacao";
	}

	@PostMapping("/newProvider/continue")
	public String saveProvider(@ModelAttribute Provider provider) {
		return "cadastroPrestadorContinuacao";
	}

	@ModelAttribute(value = "consumer")
	public Consumer consumer()
	{
		return new Consumer();
	}

	@ModelAttribute(value = "provider")
	public Provider provider()
	{
		return new Provider();
	}
}

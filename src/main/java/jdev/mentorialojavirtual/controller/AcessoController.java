package jdev.mentorialojavirtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import jdev.mentorialojavirtual.model.Acesso;
import jdev.mentorialojavirtual.services.AcessoService;

@Controller
public class AcessoController {

	@Autowired
	private AcessoService acessoService;
	
	@PostMapping("/salvarAcesso")
	public Acesso SalvarAcesso ( Acesso acesso) {
		return acessoService.save(acesso);
	}
}

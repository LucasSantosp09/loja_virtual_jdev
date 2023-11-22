package jdev.mentorialojavirtual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jdev.mentorialojavirtual.controller.AcessoController;
import jdev.mentorialojavirtual.model.Acesso;
import jdev.mentorialojavirtual.repository.AcessoRepository;
import jdev.mentorialojavirtual.services.AcessoService;

@SpringBootTest (classes = LojaVirtualJdevApplication.class)
class LojaVirtualJdevApplicationTests {
	
	@Autowired
	private AcessoService acessoService;
	
	
	@Autowired
	private AcessoController acessoController;

	
	@Autowired
	private AcessoRepository acessoRepository;
	
	
	@Test
	public void testeCadastraAcesso() {
		Acesso acesso = new Acesso();
		
		acesso.setDescricao("ADMIN");
		
		acessoController.SalvarAcesso(acesso);
		
	}

}

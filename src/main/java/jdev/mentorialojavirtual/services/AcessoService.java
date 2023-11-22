package jdev.mentorialojavirtual.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jdev.mentorialojavirtual.model.Acesso;
import jdev.mentorialojavirtual.repository.AcessoRepository;

@Service
public class AcessoService {
	
	@Autowired
	private AcessoRepository acessoRepository;
	
	public Acesso save ( Acesso acesso) {
		return acessoRepository.save(acesso);
	}
}

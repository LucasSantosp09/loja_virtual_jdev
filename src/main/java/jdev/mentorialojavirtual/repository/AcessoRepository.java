package jdev.mentorialojavirtual.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jdev.mentorialojavirtual.model.Acesso;


@Repository
@Transactional
public interface AcessoRepository extends JpaRepository<Acesso, Long>{

}

package br.com.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.teste.model.PessoaEntity;

@Repository
public interface PessoaRepositoty extends JpaRepository<PessoaEntity, Long> {

}

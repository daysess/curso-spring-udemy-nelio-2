package br.com.daysesoares.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.daysesoares.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}

package br.com.daysesoares.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.daysesoares.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}

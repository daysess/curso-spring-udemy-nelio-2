package br.com.daysesoares.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.daysesoares.domain.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, Integer>{

}

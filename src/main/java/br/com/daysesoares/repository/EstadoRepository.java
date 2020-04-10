package br.com.daysesoares.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.daysesoares.domain.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}

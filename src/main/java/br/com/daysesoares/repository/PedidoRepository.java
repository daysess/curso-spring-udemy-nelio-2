package br.com.daysesoares.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import br.com.daysesoares.domain.Pedido;

public interface PedidoRepository extends JpaRepositoryImplementation<Pedido, Integer>{

}

package br.com.daysesoares.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.transaction.annotation.Transactional;

import br.com.daysesoares.domain.Cliente;
import br.com.daysesoares.domain.Pedido;

public interface PedidoRepository extends JpaRepositoryImplementation<Pedido, Integer>{
	
	@Transactional(readOnly = true)
	Page<Pedido> findByCliente(Cliente cliente, Pageable pageRequest);

}

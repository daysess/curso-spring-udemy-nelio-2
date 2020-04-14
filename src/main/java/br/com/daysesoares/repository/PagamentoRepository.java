package br.com.daysesoares.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import br.com.daysesoares.domain.Pagamento;

public interface PagamentoRepository extends JpaRepositoryImplementation<Pagamento, Integer>{

}

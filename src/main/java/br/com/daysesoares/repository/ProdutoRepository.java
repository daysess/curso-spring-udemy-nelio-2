package br.com.daysesoares.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.daysesoares.domain.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepository<Produto, Integer>{

}

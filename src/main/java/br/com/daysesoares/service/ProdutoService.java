package br.com.daysesoares.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.daysesoares.domain.Produto;
import br.com.daysesoares.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	public Produto buscar(Integer id) {
		Optional<Produto> obj = produtoRepository.findById(id);
		return obj.orElse(null);
	}
}

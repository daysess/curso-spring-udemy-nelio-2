package br.com.daysesoares.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.daysesoares.domain.Estado;
import br.com.daysesoares.repository.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository estadoRepository;
		
	public List<Estado> findAll(){
		return estadoRepository.findAllByOrderByNome();
	}

}

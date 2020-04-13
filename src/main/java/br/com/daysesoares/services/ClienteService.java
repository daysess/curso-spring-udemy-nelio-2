package br.com.daysesoares.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.daysesoares.domain.Cliente;
import br.com.daysesoares.repository.ClienteRepository;
import br.com.daysesoares.service.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente buscar(Integer id) {
		
		Optional<Cliente> obj = clienteRepository.findById(id);
		return  obj.orElseThrow(() -> new ObjectNotFoundException(
											"Objeto não encontrado! Id: " + id + ", Tipo: "+ Cliente.class.getName()));
	}

}

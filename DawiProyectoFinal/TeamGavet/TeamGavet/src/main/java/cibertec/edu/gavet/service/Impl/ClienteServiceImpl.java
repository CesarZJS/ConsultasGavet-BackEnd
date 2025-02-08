package cibertec.edu.gavet.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.edu.gavet.model.Cliente;
import cibertec.edu.gavet.repository.ClienteRepository;
import cibertec.edu.gavet.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository repoCliente;
	
	@Override
	public Cliente insertarCliente(Cliente objCliente) {
		// TODO Auto-generated method stub
		return repoCliente.save(objCliente);
	}

	@Override
	public List<Cliente> listarCliente() {
		// TODO Auto-generated method stub
		return repoCliente.findAll();
	}

	@Override
	public Cliente obtenerCliente(int codigo_cliente) {
		// TODO Auto-generated method stub
		return repoCliente.findById(codigo_cliente).orElse(null);
	}

	@Override
	public Cliente actualizarCliente(Cliente objCliente) {
		// TODO Auto-generated method stub
		return repoCliente.save(objCliente);
	}

	@Override
	public void eliminarCliente(Cliente objCliente) {
		// TODO Auto-generated method stub
		repoCliente.delete(objCliente);
	}

}

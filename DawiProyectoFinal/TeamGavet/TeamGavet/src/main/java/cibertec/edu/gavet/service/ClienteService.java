package cibertec.edu.gavet.service;

import java.util.List;

 
import cibertec.edu.gavet.model.Cliente;
 

public interface ClienteService {

	public Cliente insertarCliente(Cliente objCliente);
	public List<Cliente>listarCliente();
	public Cliente obtenerCliente(int codigo_cliente);	
	public Cliente actualizarCliente(Cliente objCliente);
	public void eliminarCliente(Cliente objCliente);
	
}

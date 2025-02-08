package cibertec.edu.gavet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cibertec.edu.gavet.model.Cliente;
import cibertec.edu.gavet.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService servicioCliente;
	
	@GetMapping
	public List<Cliente>listarCliente(){
		return servicioCliente.listarCliente();
	}
	
	@PostMapping("/ingresar")
	@ResponseBody
	public Cliente ingresarCliente(@RequestBody Cliente objCliente) { 
		return servicioCliente.insertarCliente(objCliente);
	}
	
	@PutMapping("/actualizar")
	@ResponseBody
	public Cliente actualizarCliente(@RequestBody Cliente objCliente) {
		
		Cliente tmpCliente=servicioCliente.obtenerCliente(objCliente.getCodigo_cliente());
		tmpCliente.setNombre_cliente(objCliente.getNombre_cliente());
		tmpCliente.setDomicilio_cliente(objCliente.getDomicilio_cliente());
		tmpCliente.setTelefono_cliente(objCliente.getTelefono_cliente());
		tmpCliente.setEdad_cliente(objCliente.getEdad_cliente());
		tmpCliente.setDni_cliente(objCliente.getDni_cliente());
		 
		return servicioCliente.actualizarCliente(tmpCliente);
	}
	
	@GetMapping("obtener/{codigo_cliente}")
	public Cliente obtenerCliente(@PathVariable int codigo_cliente) {
		return servicioCliente.obtenerCliente(codigo_cliente);
	}
	
	@DeleteMapping("eliminar/{codigo_cliente}")
	public void eliminarCliente(@PathVariable int codigo_cliente) {
		Cliente objCliente = servicioCliente.obtenerCliente(codigo_cliente);
		servicioCliente.eliminarCliente(objCliente);
	}	
}

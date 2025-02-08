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

 
import cibertec.edu.gavet.model.Veterinario;
import cibertec.edu.gavet.service.VeterinarioService;

@RestController
@RequestMapping("/veterinario")
public class VeterinarioController {
	
	@Autowired
	private VeterinarioService servicioVeterinario;
	
	@GetMapping
	public List<Veterinario>listarVeterinario(){
		return servicioVeterinario.listarVeterinario();
	}
	
	@PostMapping("/ingresar")
	@ResponseBody
	public Veterinario ingresarVeterinario(@RequestBody Veterinario objVeterinario) { 
		return servicioVeterinario.insertarVeterinario(objVeterinario);
	}
	
	@PutMapping("/actualizar")
	@ResponseBody
	public Veterinario actualizarVeterinario(@RequestBody Veterinario objVeterinario) {
		
		Veterinario tmpVeterinario=servicioVeterinario.obtenerVeterinario(objVeterinario .getCodigo_veterinario());
		tmpVeterinario.setNombre_veterinario(objVeterinario.getNombre_veterinario());
		tmpVeterinario.setDomicilio_veterinario(objVeterinario.getDomicilio_veterinario());
		tmpVeterinario.setEscuela_veterinario(objVeterinario.getEscuela_veterinario());
		tmpVeterinario.setTelefono_veterinario(objVeterinario.getTelefono_veterinario());
		
		return servicioVeterinario.actualizarVeterinario(tmpVeterinario);
	}
	
	@GetMapping("obtener/{codigo_veterinario}")
	public Veterinario obtenerVeterinario(@PathVariable int codigo_veterinario) {
		return servicioVeterinario.obtenerVeterinario(codigo_veterinario);
	}
	
	@DeleteMapping("eliminar/{codigo_veterinario}")
	public void eliminarVeterinario(@PathVariable int codigo_veterinario) {
		Veterinario objVeterinario = servicioVeterinario.obtenerVeterinario(codigo_veterinario);
		servicioVeterinario.eliminarVeterinario(objVeterinario);
	}
}

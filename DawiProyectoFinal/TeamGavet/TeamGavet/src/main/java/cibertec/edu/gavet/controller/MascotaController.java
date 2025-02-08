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

import cibertec.edu.gavet.model.Mascota;
import cibertec.edu.gavet.service.MascotaService;

@RestController
@RequestMapping("/mascota")
public class MascotaController {

	@Autowired
	private MascotaService servicioMascota;
	
	@GetMapping
	public List<Mascota>listarMascota(){
		return servicioMascota.listarMascota();
	}
	
	@PostMapping("/ingresar")
	@ResponseBody
	public Mascota ingresarMascota(@RequestBody Mascota objMascota) { 
		return servicioMascota.insertarMascota(objMascota);
	}
	
	@PutMapping("/actualizar")
	@ResponseBody
	public Mascota actualizarMascota(@RequestBody Mascota objMascota) {
		Mascota tmpMascota=servicioMascota.obtenerMascota(objMascota.getCodigo_mascota());
		tmpMascota.setNombre_mascota(objMascota.getNombre_mascota());
		tmpMascota.setDomicilio_mascota(objMascota.getDomicilio_mascota());
		tmpMascota.setRaza_mascota(objMascota.getRaza_mascota());
		tmpMascota.setColor_mascota(objMascota.getColor_mascota());	
		tmpMascota.setTipo_mascota(objMascota.getTipo_mascota());
		 
		return servicioMascota.actualizarMascota(tmpMascota);
	}
	
	@GetMapping("obtener/{codigo_mascota}")
	public Mascota obtenerMascota(@PathVariable int codigo_mascota) {	
		return servicioMascota.obtenerMascota(codigo_mascota);
	}
	
	@DeleteMapping("eliminar/{codigo_mascota}")
	public void eliminarVehiculo(@PathVariable int codigo_mascota) {
		Mascota objMascota = servicioMascota.obtenerMascota(codigo_mascota); 
		servicioMascota.eliminarMascota(objMascota);
	}
}

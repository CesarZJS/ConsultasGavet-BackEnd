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

import cibertec.edu.gavet.model.Cita;
import cibertec.edu.gavet.service.CitaService;

@RestController
@RequestMapping("/cita")
public class CitaController {
	
	@Autowired
	private CitaService servicioCita;
	
	@GetMapping
	public List<Cita>listarCita(){
		return servicioCita.listarCita();
	}
	
	@PostMapping("/ingresar")
	@ResponseBody
	public Cita ingresarCita(@RequestBody Cita objCita) {
		return servicioCita.insertarCita(objCita);
	}
	
	@PutMapping("/actualizar")
	@ResponseBody
	public Cita actualizarCita(@RequestBody Cita objCita) {
		Cita tmpCita=servicioCita.obtenerCita(objCita.getCodigo_cita());
		tmpCita.setFecha_cita(objCita.getFecha_cita());
		tmpCita.setCodigo_cliente(objCita.getCodigo_cliente());
		tmpCita.setCodigo_veterinario(objCita.getCodigo_veterinario());
		tmpCita.setCodigo_mascota(objCita.getCodigo_mascota());
		 
		return servicioCita.actualizarCita(tmpCita);
	}
	
	@GetMapping("/obtener/{codigo_cita}")
	public Cita obtenerCita(@PathVariable int codigo_cita) {
		return servicioCita.obtenerCita(codigo_cita);
	}
	
	@DeleteMapping("/eliminar/{codigo_cita}")
	public void eliminarCita(@PathVariable int codigo_cita) {
		Cita objCita = servicioCita.obtenerCita(codigo_cita);
		servicioCita.eliminarCita(objCita);
	}
	
	

}

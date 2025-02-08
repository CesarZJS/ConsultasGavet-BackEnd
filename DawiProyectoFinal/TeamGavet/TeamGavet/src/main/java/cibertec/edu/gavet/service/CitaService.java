package cibertec.edu.gavet.service;

import java.util.List;

import cibertec.edu.gavet.model.Cita;

public interface CitaService {

	public Cita insertarCita(Cita objCita);
	public List<Cita>listarCita();
	public Cita obtenerCita(int codigo_cita);	
	public Cita actualizarCita(Cita objCita);
	public void eliminarCita(Cita objCita);
}

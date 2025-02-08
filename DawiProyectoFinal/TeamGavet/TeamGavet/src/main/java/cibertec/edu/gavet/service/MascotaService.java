package cibertec.edu.gavet.service;

import java.util.List;

import cibertec.edu.gavet.model.Mascota;

public interface MascotaService {

	public Mascota insertarMascota(Mascota objMascota);
	public List<Mascota>listarMascota();
	public Mascota obtenerMascota(int codigo_mascota);	
	public Mascota actualizarMascota(Mascota objMascota);
	public void eliminarMascota(Mascota objMascota);
}

package cibertec.edu.gavet.service;

import java.util.List;

 
import cibertec.edu.gavet.model.Veterinario;

public interface VeterinarioService {

	public Veterinario insertarVeterinario(Veterinario objVeterinario);
	public List<Veterinario>listarVeterinario();
	public Veterinario obtenerVeterinario(int codigo_veterinario);	
	public Veterinario actualizarVeterinario(Veterinario objVeterinario);
	public void eliminarVeterinario(Veterinario objVeterinario);
}

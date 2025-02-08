package cibertec.edu.gavet.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.edu.gavet.model.Veterinario;
import cibertec.edu.gavet.repository.VeterinarioRepository;
import cibertec.edu.gavet.service.VeterinarioService;

@Service
public class VeterinarioServicioImpl implements VeterinarioService{

	@Autowired
	private VeterinarioRepository repoVeterinario;
	
	@Override
	public Veterinario insertarVeterinario(Veterinario objVeterinario) {
		// TODO Auto-generated method stub
		return repoVeterinario.save(objVeterinario);
	}

	@Override
	public List<Veterinario> listarVeterinario() {
		// TODO Auto-generated method stub
		return repoVeterinario.findAll();
	}

	@Override
	public Veterinario obtenerVeterinario(int codigo_veterinario) {
		// TODO Auto-generated method stub
		return repoVeterinario.findById(codigo_veterinario).orElse(null);
	}

	@Override
	public Veterinario actualizarVeterinario(Veterinario objVeterinario) {
		// TODO Auto-generated method stub
		return repoVeterinario.save(objVeterinario);
	}

	@Override
	public void eliminarVeterinario(Veterinario objVeterinario) {
		// TODO Auto-generated method stub
		repoVeterinario.delete(objVeterinario);
	}

}

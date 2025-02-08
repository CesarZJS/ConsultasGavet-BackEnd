package cibertec.edu.gavet.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.edu.gavet.model.Mascota;
import cibertec.edu.gavet.repository.MascotaRepository;
import cibertec.edu.gavet.service.MascotaService;

@Service
public class MascotaServiceImpl implements MascotaService{

	@Autowired
	private MascotaRepository repoMascota;
	
	@Override
	public Mascota insertarMascota(Mascota objMascota) {
		// TODO Auto-generated method stub
		return repoMascota.save(objMascota);
	}

	@Override
	public List<Mascota> listarMascota() {
		// TODO Auto-generated method stub
		return repoMascota.findAll();
	}

	@Override
	public Mascota obtenerMascota(int codigo_mascota) {
		// TODO Auto-generated method stub
		return repoMascota.findById(codigo_mascota).orElse(null);
	}

	@Override
	public Mascota actualizarMascota(Mascota objMascota) {
		// TODO Auto-generated method stub
		return repoMascota.save(objMascota);
	}

	@Override
	public void eliminarMascota(Mascota objMascota) {
		// TODO Auto-generated method stub
		repoMascota.delete(objMascota);
	}

}

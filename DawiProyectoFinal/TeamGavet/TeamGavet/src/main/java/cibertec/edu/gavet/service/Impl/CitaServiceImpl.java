package cibertec.edu.gavet.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.edu.gavet.model.Cita;
import cibertec.edu.gavet.repository.CitaRepository;
import cibertec.edu.gavet.service.CitaService;

@Service
public class CitaServiceImpl implements CitaService{

	@Autowired
	private CitaRepository repoCita;
	
	
	@Override
	public Cita insertarCita(Cita objCita) {
		// TODO Auto-generated method stub
		return repoCita.save(objCita);
	}

	@Override
	public List<Cita> listarCita() {
		// TODO Auto-generated method stub
		return repoCita.findAll();
	}

	@Override
	public Cita obtenerCita(int codigo_cita) {
		// TODO Auto-generated method stub
		return repoCita.findById(codigo_cita).orElse(null);
	}

	@Override
	public Cita actualizarCita(Cita objCita) {
		// TODO Auto-generated method stub
		return repoCita.save(objCita);
	}

	@Override
	public void eliminarCita(Cita objCita) {
		// TODO Auto-generated method stub
		repoCita.delete(objCita);
	}

}

package cibertec.edu.gavet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.edu.gavet.model.Cita;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Integer>{

}

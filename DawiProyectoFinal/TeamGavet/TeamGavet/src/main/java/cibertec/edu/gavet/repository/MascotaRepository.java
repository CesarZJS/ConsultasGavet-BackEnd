package cibertec.edu.gavet.repository;

 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 
import cibertec.edu.gavet.model.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Integer>{

	 
	 
}

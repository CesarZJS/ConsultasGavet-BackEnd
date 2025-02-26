package cibertec.edu.gavet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name="cita")
@Data
public class Cita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_cita;
@NotBlank(message = "La fecha de la cita no puede estar en blanco")
	    private String fecha_cita;
	private int codigo_cliente;
	private int codigo_veterinario;
	private int codigo_mascota;
	
}

package cibertec.edu.gavet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name="mascota")
@Data
public class Mascota {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_mascota;

    @NotBlank(message = "El nombre de la mascota no puede estar en blanco")
    @Size(max = 50, message = "El nombre de la mascota no puede tener más de 50 caracteres")
    private String nombre_mascota;

    @NotBlank(message = "El domicilio de la mascota no puede estar en blanco")
    @Size(max = 100, message = "El domicilio de la mascota no puede tener más de 100 caracteres")
    private String domicilio_mascota;

    private String observacion_mascota;

    @NotBlank(message = "La raza de la mascota no puede estar en blanco")
    @Size(max = 50, message = "La raza de la mascota no puede tener más de 50 caracteres")
    private String raza_mascota;

    @NotBlank(message = "El color de la mascota no puede estar en blanco")
    @Size(max = 20, message = "El color de la mascota no puede tener más de 20 caracteres")
    private String color_mascota;

    @NotNull(message = "El tipo de mascota no puede ser nulo")
    private int tipo_mascota;
}
package cibertec.edu.gavet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name="cliente")
@Data
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_cliente;
	 @NotBlank(message = "El nombre del cliente no puede estar en blanco")
	    @Size(max = 50, message = "El nombre del cliente no puede tener más de 50 caracteres")
	    private String nombre_cliente;

	    @NotBlank(message = "El domicilio del cliente no puede estar en blanco")
	    @Size(max = 100, message = "El domicilio del cliente no puede tener más de 100 caracteres")
	    private String domicilio_cliente;

	    @NotBlank(message = "El teléfono del cliente no puede estar en blanco")
	    @Pattern(regexp = "\\d{9}", message = "El teléfono del cliente debe tener 9 dígitos")
	    private String telefono_cliente;

	    @Min(value = 1, message = "La edad del cliente debe ser mayor a 0 años")
	    private int edad_cliente;

	    @NotNull(message = "El DNI del cliente no puede ser nulo")
	    @Digits(integer = 8, fraction = 0, message = "El DNI del cliente debe tener 8 dígitos")
	    private int dni_cliente;
}

package ec.edu.insteclrg.domein;

import java.sql.Date;

import ec.edu.insteclrg.enums.Sexo;
import ec.edu.insteclrg.enums.TipoIdentificacion;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Habitante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private Long id;
	
	@Column(nullable = false, length = 13)
	private String identificacion;
	
	@Column(nullable = false)
	private TipoIdentificacion tipoIdentificacion;
	
	@Column(nullable = false)
	private Sexo sexo;

	@Column(nullable = false, length = 50)
	private String nombrePersona;
	
	@Column(nullable = false, length = 50)
	private String apellido;
	
	@Column(nullable = false, length = 8)
	private Date fechaNacimiento;
	
	@Column(nullable = false, length = 50)
	private String genero;
	
	@Column(nullable = true, length = 10)
	private String telefono;
	
	@Column(nullable = false, length = 100)
	private String email;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( nullable = false)
	private Casa casa;

}
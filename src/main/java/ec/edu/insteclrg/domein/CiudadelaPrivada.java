package ec.edu.insteclrg.domein;

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
public class  CiudadelaPrivada {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private Long id;
	
	@Column(nullable = false, length = 50)
	private String nombreciudadelaprivada;
	
	@Column(nullable = false, length = 10)
	private String telefono;
	
	@Column(nullable = false, length = 10)
	private String ubucacion;
	
	@Column(nullable = false, length = 10)
	private String tipociudadelaprivada;
	
	@Column(nullable = false, length = 10)
	private Integer calificacion;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( nullable = false)
	private Ciudad Ciudad;

}

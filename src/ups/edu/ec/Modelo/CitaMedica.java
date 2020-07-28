package ups.edu.ec.Modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;





@Entity
public class CitaMedica implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn
	private Paciente paciente;
	
	@OneToOne
	@JoinColumn
	private SignosVitaes signosVitales;
	
	private String fecha;
	private String hora;

	private List<String>  sintomas;
	private List<String>  alergias;
	private List<String>  enfermedades;
	
	private boolean editable;
	
	
	public CitaMedica(String fecha, String hora, List<String> sintomas, List<String> alergias,
			List<String> enfermedades) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.sintomas = sintomas;
		this.alergias = alergias;
		this.enfermedades = enfermedades;
	}



	public CitaMedica() {
		
	}
	
	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Paciente getPaciente() {
		return paciente;
	}



	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}



	

	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getHora() {
		return hora;
	}



	public void setHora(String hora) {
		this.hora = hora;
	}

	public SignosVitaes getSignosVitales() {
		return signosVitales;
	}



	public void setSignosVitales(SignosVitaes signosVitales) {
		this.signosVitales = signosVitales;
	}



	public List<String> getSintomas() {
		return sintomas;
	}



	public void setSintomas(List<String> sintomas) {
		this.sintomas = sintomas;
	}



	public List<String> getAlergias() {
		return alergias;
	}



	public void setAlergias(List<String> alergias) {
		this.alergias = alergias;
	}



	public List<String> getEnfermedades() {
		return enfermedades;
	}



	public void setEnfermedades(List<String> enfermedades) {
		this.enfermedades = enfermedades;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CitaMedica other = (CitaMedica) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}

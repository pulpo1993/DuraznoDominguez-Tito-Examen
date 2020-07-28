package ups.edu.ec.Modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class SignosVitaes implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "signosVitales")
	private CitaMedica citaMedica;
	
	
	private String presion;
	private String frecuenciaCardiaca;
	private String frecuenciaRespitratoria;
	private String temperatura;
	private String saturacion;
	
	private boolean editable;
	public SignosVitaes() {
		
		
	}
	
	
	public SignosVitaes(String presion, String frecuenciaCardiaca, String frecuenciaRespitratoria, String temperatura,
			String saturacion) {
		
		this.presion = presion;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.frecuenciaRespitratoria = frecuenciaRespitratoria;
		this.temperatura = temperatura;
		this.saturacion = saturacion;
	}


	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public CitaMedica getCitaMedica() {
		return citaMedica;
	}
	public void setCitaMedica(CitaMedica citaMedica) {
		this.citaMedica = citaMedica;
	}
	public String getPresion() {
		return presion;
	}
	public void setPresion(String presion) {
		this.presion = presion;
	}
	
	public String getFrecuenciaCardiaca() {
		return frecuenciaCardiaca;
	}


	public void setFrecuenciaCardiaca(String frecuenciaCardiaca) {
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}


	public String getFrecuenciaRespitratoria() {
		return frecuenciaRespitratoria;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	public void setFrecuenciaRespitratoria(String frecuenciaRespitratoria) {
		this.frecuenciaRespitratoria = frecuenciaRespitratoria;
	}


	public String getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	public String getSaturacion() {
		return saturacion;
	}
	public void setSaturacion(String saturacion) {
		this.saturacion = saturacion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}


	@Override
	public String toString() {
		return "SignosVitaes [codigo=" + codigo + ", citaMedica=" + citaMedica + ", presion=" + presion
				+ ", frecuenciaCardiaca=" + frecuenciaCardiaca + ", frecuenciaRespitratoria=" + frecuenciaRespitratoria
				+ ", temperatura=" + temperatura + ", saturacion=" + saturacion + "]";
	}


	
	
	
	
}

package ups.edu.ec.Modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Paciente implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
	
	private List<CitaMedica> citamedica;
	
	private String cedula;
	private String nombre;
	private String apellido;
	private String telefono;
	private String direccion;
	private String correo;
	
	
	
	public Paciente() {
		
	}
	
	
	
	public Paciente(String cedula, String nombre, String apellido, String telefono, String direccion, String correo) {
		
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
	}



	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public List<CitaMedica> getCitamedica() {
		return citamedica;
	}
	public void setCitamedica(List<CitaMedica> citamedica) {
		this.citamedica = citamedica;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Paciente [codigo=" + codigo + ", citamedica=" + citamedica + ", cedula=" + cedula + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", telefono=" + telefono + ", direccion=" + direccion + ", correo="
				+ correo + "]";
	}
	
	
}

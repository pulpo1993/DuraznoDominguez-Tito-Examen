package ec.edu.ups.controlador;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;
import ec.edu.ups.ejb.*;
import ups.edu.ec.Modelo.CitaMedica;
import ups.edu.ec.Modelo.SignosVitaes;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class CitaMedicaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EJB
	private CitaMedicaFacade ejbCitaMedicaFacade;
	private List<CitaMedica> listaMedica;
	
	@EJB
	private SignosVitalesFacade ejbSignosVitalesFacade;
	private List<SignosVitaes> listaSignos;
	
	private String fecha;
	private String hora;

	private List<String>  sintomas;
	private List<String>  alergias;
	private List<String>  enfermedades;
	
	
	

	public CitaMedicaBean() {

	}

	@PostConstruct
	public void init() {

		listaMedica = ejbCitaMedicaFacade.findAll();

	}

	
	public String add() {

		System.out.println("Lista productos en citas");
		
		ejbCitaMedicaFacade.create(new CitaMedica(this.fecha,this.hora,this.sintomas,this.alergias,this.enfermedades));
		listaMedica = ejbCitaMedicaFacade.findAll();
		return null;

	}

	public String remove(CitaMedica c) {
		ejbCitaMedicaFacade.remove(c);
		listaMedica = ejbCitaMedicaFacade.findAll();
		return null;
	}

	public String edit(CitaMedica c) {
		c.setEditable(true);
		return null;
	}

	public String save(CitaMedica c) {
		ejbCitaMedicaFacade.edit(c);
		c.setEditable(false);
		return null;
	}

	
}

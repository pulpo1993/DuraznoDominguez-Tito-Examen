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
import ups.edu.ec.Modelo.SignosVitaes;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class SignosVitalesBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EJB
	private SignosVitalesFacade ejbSignosFacade;
	

	private List<SignosVitaes> listaSignos;
	
	private String presion;
	private String frecuencaCardiaca;
	private String frecuenciaRespitratoria;
	private String temperatura;
	private String saturacion;
	
	

	public SignosVitalesBean() {

	}

	@PostConstruct
	public void init() {

		listaSignos = new ArrayList<SignosVitaes>();	
		listaSignos = ejbSignosFacade.findAll();

	}

	

	public String add() {

		System.out.println("Lista productos en signos");
		ejbSignosFacade.create(new SignosVitaes(this.presion,this.frecuencaCardiaca,this.frecuenciaRespitratoria,this.temperatura,this.saturacion));
		listaSignos = ejbSignosFacade.findAll();
		return null;

	}

	public String remove(SignosVitaes p) {
		ejbSignosFacade.remove(p);
		listaSignos = ejbSignosFacade.findAll();
		return null;
	}

	public String edit(SignosVitaes p) {
		p.setEditable(true);
		return null;
	}

	public String save(SignosVitaes p) {
		ejbSignosFacade.edit(p);
		p.setEditable(false);
		return null;
	}

	
}

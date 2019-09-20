package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Digibank;
import service.DigibankEJB;

@ManagedBean(name = "digibankcontroller")
@SessionScoped
public class DigibankController {
	
	
	@EJB
	DigibankEJB digibankservice;
	@ManagedProperty(value="#{digibank}")
	private Digibank digibank;
	
	public void addNewTransaction() {
		System.out.println("Is in use");
		digibankservice.addNew(digibank.getEntity());
	}

	public Digibank getDigibank() {
		return digibank;
	}

	public void setDigibank(Digibank digibank) {
		this.digibank = digibank;
	}
	
	

}

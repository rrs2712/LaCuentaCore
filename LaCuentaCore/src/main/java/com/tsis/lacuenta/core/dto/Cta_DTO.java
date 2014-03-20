/**
 * 
 */
package com.tsis.lacuenta.core.dto;

import java.io.Serializable;

/**
 * @author asus
 *
 *Objeto con los valores necesarios para dividir una cuenta
 */
public class Cta_DTO implements Serializable {

	private double montoCta;
	private int personas;
	private double propina;
	
	/**
	 * 
	 */
	public Cta_DTO() {
		// TODO Auto-generated constructor stub
	}


	
	/**
	 * @param montoCta
	 * @param personas
	 * @param propina
	 * @param redondear
	 */
	public Cta_DTO(double montoCta, int personas, double propina) {
		super();
		this.montoCta = montoCta;
		this.personas = personas;
		this.propina = propina;
	}



	/**
	 * @return the montoCta
	 */
	public double getMontoCta() {
		return montoCta;
	}



	/**
	 * @param montoCta the montoCta to set
	 */
	public void setMontoCta(double montoCta) {
		this.montoCta = montoCta;
	}



	/**
	 * @return the personas
	 */
	public int getPersonas() {
		return personas;
	}



	/**
	 * @param personas the personas to set
	 */
	public void setPersonas(int personas) {
		this.personas = personas;
	}



	/**
	 * @return the propina
	 */
	public double getPropina() {
		return propina;
	}



	/**
	 * @param propina the propina to set
	 */
	public void setPropina(double propina) {
		this.propina = propina;
	}



	public void printValues(){
		
		System.out.println("Monto =" + this.montoCta);
		System.out.println("People=" + this.personas);
		System.out.println("tip   =" + this.propina);
	}

}

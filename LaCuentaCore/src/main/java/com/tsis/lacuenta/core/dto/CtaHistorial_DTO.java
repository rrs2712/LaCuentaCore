/**
 * 
 */
package com.tsis.lacuenta.core.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author asus
 *
 */
public class CtaHistorial_DTO extends Cta_DTO implements Serializable {
	
	private Date fecha;
	private double montoxPersona;

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the montoxPersona
	 */
	public double getMontoxPersona() {
		return montoxPersona;
	}

	/**
	 * @param montoxPersona the montoxPersona to set
	 */
	public void setMontoxPersona(double montoxPersona) {
		this.montoxPersona = montoxPersona;
	}

	/**
	 * 
	 */
	public CtaHistorial_DTO() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printValues(){
		super.printValues();
		System.out.println("Fecha =" + this.fecha);
		System.out.println("MontoxPersona=" + this.montoxPersona);
	}

	@Override
	public String showValues(){
		String cadena = super.showValues();
		cadena = cadena + "\nFecha =" + this.fecha +
						  "\nMontoxPersona=" + this.montoxPersona;
		return cadena;
	}
}

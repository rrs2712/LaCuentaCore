package com.tsis.lacuenta.core.bo;

/**
 * Interfaz de objeto de negocio para implementar una cuenta
 * @author asus
 *
 */
public interface CtaBO_IF {
	/**
	 * Metodo para devolver la cantidad a pagar por persona sin redondear
	 * @return double -  La cantidad a pagar por persona
	 */
	public double getCtaIndividual_Exacta();
	
	/**
	 * Metodo para devolver la cantidad redondeada a pagar por persona 
	 * @return int -  La cantidad a pagar por persona
	 */
	public int getCtaIndividual_Redondeada();
}

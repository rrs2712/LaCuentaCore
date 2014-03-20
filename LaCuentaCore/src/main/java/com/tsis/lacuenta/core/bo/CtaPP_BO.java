/**
 * 
 */
package com.tsis.lacuenta.core.bo;

import com.tsis.lacuenta.core.dto.Cta_DTO;

/**
 * Crea una cuenta agregando propina porcentual al monto de la cuenta.
 * CtaPP = Cuenta con Propina Porcentual
 * @author asus
 *
 */
public class CtaPP_BO extends CtaBase_BO implements CtaBO_IF {


	/**
	 * Crea una cuenta con propina porcentual
	 * @param cuenta
	 */
	public CtaPP_BO(Cta_DTO cuenta) {
		super(cuenta);
		System.out.println("Cuenta de tipo propina proporcional");
	}

	/* (non-Javadoc)
	 * @see com.tsis.bo.CtaBO_IF#getAmount_xPersona()
	 */
	@Override
	public double getCtaIndividual_Exacta() {
		return getCuentaIndividual(super.bill.getMontoCta(), super.bill.getPropina(), super.bill.getPersonas());
	}

	/* (non-Javadoc)
	 * @see com.tsis.bo.CtaBO_IF#getRoundedAmount_xPersona()
	 */
	@Override
	public int getCtaIndividual_Redondeada() {
		double r1 = getCuentaIndividual(super.bill.getMontoCta(), super.bill.getPropina(), super.bill.getPersonas());	
		return (int) Math.ceil(r1);
	}
	
	
	/**
	 * Metodo que contiene la formula para obtener la cuenta indivial dados los siguientes parametros:
	 * @param monto - Monto total de la cuenta
	 * @param tip - Propina (porcentaje) a incluir en la cuenta
	 * @param numPersonas - Numero de personas entre las cuales se dividira la cuenta.
	 * @return doueble - Con dos decimales
	 */
	private double getCuentaIndividual(double monto, double tip, int numPersonas){
		double realTip = tip / super.divisorPorcentaje;
		double resul = monto + (monto * realTip);
		resul = resul / numPersonas;
		resul = (double) Math.round(resul * super.cerosaRedondear) / super.cerosaRedondear;
		return resul;
	}

}

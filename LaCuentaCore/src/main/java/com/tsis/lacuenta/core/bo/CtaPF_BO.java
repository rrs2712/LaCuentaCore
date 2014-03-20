/**
 * 
 */
package com.tsis.lacuenta.core.bo;

import com.tsis.lacuenta.core.dto.Cta_DTO;

/**
 * Crea una cuenta agregando una propina (de cantidad) fija al monto de la cuenta.
 * CtaPF = Cuenta con Propina Fija
 * @author asus
 *
 */
public class CtaPF_BO extends CtaBase_BO implements CtaBO_IF {

	public CtaPF_BO(Cta_DTO cuenta) {
		super(cuenta);
		System.out.println("Cuenta con monto de propina fijo");
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
	
	private double getCuentaIndividual(double montoCta, double propina, int personas) {
		double r1 = (montoCta + propina) / personas;
		r1 = (double) Math.round(r1 * super.cerosaRedondear) / super.cerosaRedondear;
		return r1;
	}

}

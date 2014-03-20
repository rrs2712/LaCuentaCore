/**
 * 
 */
package com.tsis.lacuenta.core.bo;

import com.tsis.lacuenta.core.dto.Cta_DTO;

/**
 * @author asus
 * 
 */
public class CtaBase_BO {

	protected Cta_DTO bill;
	protected final int divisorPorcentaje = 100;
	protected final int cerosaRedondear = 100;

	/**
	 * 
	 */
	public CtaBase_BO(Cta_DTO cuenta) {
		super();
		this.bill = cuenta;
	}


}

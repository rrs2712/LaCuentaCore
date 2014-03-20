package com.tsis.lacuenta.core.main;

import com.tsis.lacuenta.core.bo.CtaBO_IF;
import com.tsis.lacuenta.core.bo.CtaPF_BO;
import com.tsis.lacuenta.core.bo.CtaPP_BO;
import com.tsis.lacuenta.core.dto.Cta_DTO;

public class Cuenta {

	private CtaBO_IF cta;

	public Cuenta(double monto, int pesonas, double propina, int tipoCta) {

		Cta_DTO dto = new Cta_DTO(monto, pesonas, propina);
		this.cta = selectTipoCta(tipoCta, dto, this.cta);

	}

	public double getCtaIndividual(boolean redondear) {
		if (redondear) {
			return (double)cta.getCtaIndividual_Redondeada();
		} else {
			return cta.getCtaIndividual_Exacta();
		}
	}
	
	private CtaBO_IF selectTipoCta(int tipoCta, Cta_DTO datos, CtaBO_IF unaCuenta){
		
		switch (tipoCta) {
		case 1:
			unaCuenta = new CtaPP_BO(datos);
			break;
		case 2:
			unaCuenta = new CtaPF_BO(datos);
			break;

		default:
			System.out.println("unkown seleccion");
			break;
		}
		return unaCuenta;
	}
	

}

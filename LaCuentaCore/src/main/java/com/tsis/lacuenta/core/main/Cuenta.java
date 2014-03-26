package com.tsis.lacuenta.core.main;


import com.tsis.lacuenta.core.bo.CtaBO_IF;
import com.tsis.lacuenta.core.bo.CtaPF_BO;
import com.tsis.lacuenta.core.bo.CtaPP_BO;
import com.tsis.lacuenta.core.bo.Rules_BO;
import com.tsis.lacuenta.core.dto.Cta_DTO;

public class Cuenta {

	public static final int CtaTipProporcional=1;
	public static final int CtaTipMontoFijo=2;
	
	private final double defaultMonto=0;
	private final int defaultPersonas=1;
	private final double defaultTip=0;
	
	private CtaBO_IF cta;
	private Rules_BO rules = new Rules_BO();
	
	/**
	 * Contructor con parametros visibles en tipos de datos primitivos
	 * @param monto - Monto de la cuenta
	 * @param personas - Numero de personas entre las cuales se dividira la cuenta
	 * @param propina - Propina a incluir
	 * @param tipoCta - Este parametro indica si la propina es de tipo porcentual o de monto fijo
	 */
	public Cuenta(double monto, int personas, double propina, int tipoCta) {
		
		// Si los parametros de entrada no son validos generaremos un default
		boolean data = rules.isDataOk(monto, personas, propina);

		Cta_DTO dto = (data) ? new Cta_DTO(monto, personas, propina) : getDefaultDTO(monto, personas, propina);
		this.cta = selectTipoCta(tipoCta, dto, this.cta);
	}
	/**
	 * Constructor con un parametro de tipo Cta_DTO, el cual debe contener el monto de la cuenta, el numero de
	 * personas entre las que se dividira y la propina. El tipo de propina que se usara por default es la
	 * propina proporcinal.
	 * @param cta - Cta_DTO
	 */
	public Cuenta(Cta_DTO cta){
		
		// Si los parametros de entrada no son validos generaremos un default
		boolean data = rules.isDataOk(cta.getMontoCta(), cta.getPersonas(), cta.getPropina());

		Cta_DTO dto = (data) ? cta : getDefaultDTO(cta.getMontoCta(), cta.getPersonas(), cta.getPropina());
		this.cta = selectTipoCta(CtaTipProporcional, dto, this.cta);
		
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
		case CtaTipProporcional:
			unaCuenta = new CtaPP_BO(datos);
			break;
		case CtaTipMontoFijo:
			unaCuenta = new CtaPF_BO(datos);
			break;
		default:
			unaCuenta = new CtaPP_BO(datos);
			break;
		}
		return unaCuenta;
	}
	
	private Cta_DTO getDefaultDTO(double monto, int personas, double propina) {
		
		monto   = (rules.isMontoOk(monto))       ? monto:defaultMonto;
		personas= (rules.isPersonasOk(personas)) ? personas:defaultPersonas;
		propina = (rules.isTipOk(propina))       ? propina:defaultTip;
		
		return new Cta_DTO(monto, personas, propina);
	}

}

/**
 * 
 */
package com.tsis.lacuenta.core.dto;

/**
 * @author asus
 *
 */
public class FakeBills {
	
	public Cta_DTO getCtaPF_MaxVals(){
		return new Cta_DTO(99999.99, 99, 99999.99);
	}
	
	public Cta_DTO getCtaPP_MaxVals(){
		return new Cta_DTO(99999.99, 99, 100);
	}
	
	public Cta_DTO getCta_DefaultVals(){
		return new Cta_DTO(200.55, 2, 20);
	}
	
	public Cta_DTO getCta_WrongVals(){
		return new Cta_DTO(-1.1, -1, -1.1);
	}
	
	
	// Cuentas con el resultado esperado
	public CtaFake_DTO getCtaPP_MaxVals_Result(){
		Cta_DTO datos = new Cta_DTO(99999.99, 99, 99999.99);
		return new CtaFake_DTO(datos, 1011110.91);
	}
	
	public CtaFake_DTO getCtaPP_AverVals_Result(){
		Cta_DTO datos = new Cta_DTO(200.55,	2,	20);
		return new CtaFake_DTO(datos, 120.33);
	}
	
	public CtaFake_DTO getCtaPP_MinVals_Result(){
		Cta_DTO datos = new Cta_DTO(0.01,	1,	0);
		return new CtaFake_DTO(datos, 0.01);
	}
	
	public CtaFake_DTO getCtaPP_DefaultVals_Result(){
		Cta_DTO datos = new Cta_DTO(0,	1,	0);
		return new CtaFake_DTO(datos, 0);
	}
	
	public CtaFake_DTO getCtaPP_WrongVals_Result(){
		Cta_DTO datos = new Cta_DTO(-1.1, -1, -1.1);
		return new CtaFake_DTO(datos, 0);
	}

}

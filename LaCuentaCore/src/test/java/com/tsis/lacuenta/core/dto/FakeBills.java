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

}

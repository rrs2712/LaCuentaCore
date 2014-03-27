/**
 * 
 */
package com.tsis.lacuenta.core.dto;

import java.util.Date;

import junit.framework.TestCase;

/**
 * @author asus
 *
 */
public class CtaHistorial_DTOTest extends TestCase {

	/**
	 * Test method for {@link com.tsis.lacuenta.core.dto.CtaHistorial_DTOTest#CtaHistorial_DTO()}.
	 */
	public final void testCtaHistorial_DTO() {
		CtaHistorial_DTO dto = new CtaHistorial_DTO();
		dto.setMontoCta(100);
		dto.setPersonas(2);
		dto.setPropina(10);
		dto.setFecha(new Date());
		dto.setMontoxPersona(55);
		
		dto.printValues();
		System.out.println(dto.showValues());
		
		assertNotNull(dto);
		
	}

}

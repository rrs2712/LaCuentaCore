/**
 * 
 */
package com.tsis.lacuenta.core.bo;

import junit.framework.TestCase;

import com.tsis.lacuenta.core.dto.Cta_DTO;
import com.tsis.lacuenta.core.dto.FakeBills;

/**
 * @author asus
 *
 */
public class CtaPF_BOTest extends TestCase {
	
	private FakeBills bills;
	private String clase = "\nCtaPF_BO.";

	/**
	 * @param name
	 */
	public CtaPF_BOTest(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		this.bills = new FakeBills();
	}

//	/* (non-Javadoc)
//	 * @see junit.framework.TestCase#tearDown()
//	 */
//	protected void tearDown() throws Exception {
//		super.tearDown();
//	}

//	/**
//	 * Test method for {@link com.tsis.lacuenta.core.bo.CtaPF_BO#CtaPF_BO(com.tsis.lacuenta.core.dto.Cta_DTO)}.
//	 */
//	public final void testCtaPF_BO() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	/**
//	 * Test method for {@link com.tsis.lacuenta.core.bo.CtaPF_BO#getCtaIndividual_Exacta()}.
//	 */
//	public final void testGetCtaIndividual_Exacta() {
//		fail("Not yet implemented"); // TODO
//	}

	/**
	 * Test method for {@link com.tsis.lacuenta.core.bo.CtaPF_BO#getCtaIndividual_Redondeada()}.
	 * 
	 * Prueba 1: Consiste en probar este metodo con los valores maximos permitidos de acuerdo a las especificaciones.
	 */
	public final void testGetCtaIndividual_Redondeada1() {
		String metodo = "getCtaIndividual_Redondeada (valores maximos)\n";
		CtaBO_IF cta = new CtaPF_BO(bills.getCtaPF_MaxVals());
		
		double expected = 2021;
		double actual = cta.getCtaIndividual_Redondeada();
		String msg = clase + metodo + "Esperado=" + expected + "\nActual=" + actual;
		
		assertTrue(msg, expected==actual);
	}
	
	/**
	 * Test method for {@link com.tsis.lacuenta.core.bo.CtaPF_BO#getCtaIndividual_Redondeada()}.
	 * 
	 * Prueba 2
	 */
	public final void testGetCtaIndividual_Redondeada2() {
		CtaBO_IF cta = new CtaPF_BO(new Cta_DTO(475.58, 10, 50));
		assertTrue(0<cta.getCtaIndividual_Redondeada());
	}

}

/**
 * 
 */
package com.tsis.lacuenta.core.main;

import com.tsis.lacuenta.core.dto.CtaFake_DTO;
import com.tsis.lacuenta.core.dto.FakeBills;

import junit.framework.TestCase;

/**
 * @author asus
 *
 */
public class Cuenta3Test extends TestCase {
	
	private String clase = "\nCuenta.";

	/**
	 * @param name
	 */
	public Cuenta3Test(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}


	/**
	 * Test method for {@link com.tsis.lacuenta.core.main.Cuenta#Cuenta(com.tsis.lacuenta.core.dto.Cta_DTO)}.
	 */
	public final void testCuentaCta_DTO() {

		String metodo = "Cuenta(Cta_DTO cta)\n";
		String msg = clase + metodo + "Este constructor devuelve null";
		
		FakeBills bills = new FakeBills();
		Cuenta cuenta = new Cuenta(bills.getCta_DefaultVals());
		assertNotNull(msg, cuenta);
	}
	
	public void testCuentaMaxVals(){	
		FakeBills bills = new FakeBills();
		
		Cuenta cuenta = new Cuenta(bills.getCtaPP_MaxVals_Result().getDto());
		
		double expected = bills.getCtaPP_MaxVals_Result().getXpectResult();
		double actual = cuenta.getCtaIndividual(false);
		String msg = "Contructor Cuenta(Cta_DTO cta) fallo con estos valores: " 
					+ bills.getCtaPP_MaxVals_Result().getDto().showValues() 
					+ "\nExpected=" + expected
					+ "\nReal =" + actual;
		
		assertTrue(msg, expected==actual);
	}
	
	public final void testGetCtaIndividual1() {
		
		assertTrue("blabla", true);
	}

}

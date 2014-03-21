/**
 * 
 */
package com.tsis.lacuenta.core.bo;

import junit.framework.TestCase;

/**
 * @author asus
 *
 */
public class Rules_BOTest extends TestCase {
	
	private String clase = "\nReglasNegocio_BO.";
	private Rules_BO rules;

	/**
	 * @param name
	 */
	public Rules_BOTest(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		rules = new Rules_BO();
	}

	/**
	 * Test method for {@link com.tsis.lacuenta.core.bo.Rules_BO#isDataOk(double, int, double, int)}.
	 * 
	 * Prueba con todos los parametros correctos, ya que los metodos que usa internamente este metodo son 
	 * probados con sus valores incorrectos.
	 */
	public final void testIsDataOk() {
		String metodo = "\n";
		String msg = clase + metodo + " Se esperaba un true para esta prueba";
		
		assertTrue(msg, rules.isDataOk(100, 3, 20));
	}

	/**
	 * Test method for {@link com.tsis.lacuenta.core.bo.Rules_BO#isMontoOk(double)}.
	 * 
	 * Prueba con un cantidad de cuenta no permitida
	 */
	public final void testIsMontoOk() {
		String metodo = "isMontoOk(double monto)\n";
		String msg = clase + metodo + " Se esperaba un false para esta prueba";
		
		assertFalse(msg, rules.isMontoOk(-0.1));
	}

	/**
	 * Test method for {@link com.tsis.lacuenta.core.bo.Rules_BO#isPersonasOk(int)}.
	 * 
	 * Prueba con con la cantidad de personas equivocada
	 */
	public final void testIsPersonasOk() {
		String metodo = "isPersonasOk(int personas)\n";
		String msg = clase + metodo + " Se esperaba un false para esta prueba";
		
		assertFalse(msg, rules.isPersonasOk(0));
	}

	/**
	 * Test method for {@link com.tsis.lacuenta.core.bo.Rules_BO#isTipOk(double)}.
	 * 
	 * Prueba con un monto de propina equivocada
	 */
	public final void testIsTipOk() {
		String metodo = "isTipOk(double tip)\n";
		String msg = clase + metodo + " Se esperaba un false para esta prueba";
		
		assertFalse(msg, rules.isTipOk(-0.1));
	}

	/**
	 * Test method for {@link com.tsis.lacuenta.core.bo.Rules_BO#isTipoCtaOk(int)}.
	 * 
	 * Prueba con tipo de cuenta equivocada
	 */
	public final void testIsTipoCtaOk() {
		String metodo = "isTipoCtaOk(int tipoCta)\n";
		String msg = clase + metodo + " Se esperaba un false para esta prueba";
		
		assertFalse(msg, rules.isTipoCtaOk(-1));
	}

	/**
	 * Test method for {@link com.tsis.lacuenta.core.bo.Rules_BO#isInRange(double, double, double)}.
	 * 
	 * Prueba con un rango correcto
	 */
	public final void testIsInRangeDoubleDoubleDouble() {
		String metodo = "isInRange(double min, double max, double prospect)\n";
		String msg = clase + metodo + " Se esperaba un true para esta prueba";
		
		assertTrue(msg, rules.isInRange(0.1, 1.1, 1));
	}

	/**
	 * Test method for {@link com.tsis.lacuenta.core.bo.Rules_BO#isInRange(int, int, int)}.
	 * 
	 * Prueba con un rango correcto
	 */
	public final void testIsInRangeIntIntInt() {
		String metodo = "isInRange(int min, int max, int prospect)\n";
		String msg = clase + metodo + " Se esperaba un true para esta prueba";
		
		assertTrue(msg, rules.isInRange(0, 2, 0));
	}

	/**
	 * Test method for {@link com.tsis.lacuenta.core.bo.Rules_BO#isAllTrue(boolean[])}.
	 * 
	 * Prueba de rangos con todo a true
	 */
	public final void testIsAllTrue1() {
		String metodo = "testIsAllTrue()\n";
		String msg = clase + metodo + " Se esperaba un true para esta prueba";
		
		boolean respuesta = rules.isAllTrue(true,true,true,true,true);
		assertTrue(msg, respuesta);
	}
	
	/**
	 * Test method for {@link com.tsis.lacuenta.core.bo.Rules_BO#isAllTrue(boolean[])}.
	 * 
	 * Prueba de rangos con un false
	 */
	public final void testIsAllTrue2() {
		String metodo = "testIsAllTrue()\n";
		String msg = clase + metodo + " Se esperaba un false para esta prueba";
		
		boolean respuesta = rules.isAllTrue(true,false,true,true,true);
		assertFalse(msg, respuesta);
	}

}

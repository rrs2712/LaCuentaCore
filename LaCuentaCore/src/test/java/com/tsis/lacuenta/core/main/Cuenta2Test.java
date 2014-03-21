/**
 * 
 */
package com.tsis.lacuenta.core.main;

import com.tsis.lacuenta.core.dto.Cta_DTO;
import com.tsis.lacuenta.core.dto.FakeBills;

import junit.framework.TestCase;

/**
 * @author asus
 * 
 * Test para probar la generacion de resultados cuando los datos de entrada no son correctos
 *
 */
public class Cuenta2Test extends TestCase {
	
	private Cuenta cuentaPF;
	private Cuenta cuentaPP;
	private String clase = "\nCuenta.";

	/**
	 * @param name
	 */
	public Cuenta2Test(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		
		// Obtenemos un set de datos de prueba
		FakeBills bills = new FakeBills();
		Cta_DTO dto = bills.getCta_WrongVals();
		// Creamos dos instancias de cuenta para probar: cuenta de propina proporcinonal y monto fijo de propina
		this.cuentaPP = new Cuenta(dto.getMontoCta(), dto.getPersonas(), dto.getPropina(), -1);
		this.cuentaPF = new Cuenta(dto.getMontoCta(), dto.getPersonas(), dto.getPropina(), -1);
	}

	/**
	 * Test method for {@link com.tsis.lacuenta.core.main.Cuenta#Cuenta(double, int, double, int)}.
	 */
	public final void testCuenta() {
		String metodo = "Cuenta(double monto, int pesonas, double propina, int tipoCta)\n";
		
		String msg = clase + metodo + "Este constructor devuelve null";
		assertNotNull(msg, cuentaPF);
	}

	// Cuentas con propina de monto fijo
	/**
	 * Test method for {@link com.tsis.lacuenta.core.main.Cuenta#getCtaIndividual(boolean)}.
	 * 
	 * Prueba: devolver cuenta individual con propina fija exacta
	 */
	public final void testGetCtaIndividual1() {
		String metodo = "getCtaIndividual(false)\n";
		
		double expected = 0;
		double actual = cuentaPF.getCtaIndividual(false);
		String msg = clase + metodo + "Esperado=" + expected + "\nActual=" + actual;
		
		assertTrue(msg, expected==actual);
	}
	
	/**
	 * Test method for {@link com.tsis.lacuenta.core.main.Cuenta#getCtaIndividual(boolean)}.
	 * 
	 * Prueba: devolver cuenta individual con propina fija redondeada
	 */
	public final void testGetCtaIndividual2() {
		String metodo = "getCtaIndividual(true)\n";
		
		double expected = 0;
		double actual = cuentaPF.getCtaIndividual(true);
		String msg = clase + metodo + "Esperado=" + expected + "\nActual=" + actual;
		
		assertTrue(msg, expected==actual);
	}
	
	
	// Cuentas con propina porcentual
	/**
	 * Test method for {@link com.tsis.lacuenta.core.main.Cuenta#getCtaIndividual(boolean)}.
	 * 
	 * Prueba: devolver cuenta individual con propina porcentual exacta
	 */
	public final void testGetCtaIndividual3() {
		String metodo = "getCtaIndividual(false)\n";
		
		double expected = 0;
		double actual = cuentaPP.getCtaIndividual(false);
		String msg = clase + metodo + "Esperado=" + expected + "\nActual=" + actual;
		
		assertTrue(msg, expected==actual);
	}
	
	/**
	 * Test method for {@link com.tsis.lacuenta.core.main.Cuenta#getCtaIndividual(boolean)}.
	 * 
	 * Prueba: devolver cuenta individual con propina porcentual redondeada
	 */
	public final void testGetCtaIndividual4() {
		String metodo = "getCtaIndividual(true)\n";
		
		double expected = 0;
		double actual = cuentaPP.getCtaIndividual(true);
		String msg = clase + metodo + "Esperado=" + expected + "\nActual=" + actual;
		
		assertTrue(msg, expected==actual);
	}

}

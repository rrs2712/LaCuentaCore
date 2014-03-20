package com.tsis.lacuenta.core.bo;

import java.util.Scanner;

import com.tsis.lacuenta.core.dto.Cta_DTO;

public class Cuenta {

	private CtaBO_IF cta;
	
	/**
	 * 
	 */
	public Cuenta() {
		super();
		Scanner scanner = new Scanner(System.in);
		
		Cta_DTO cuenta = new Cta_DTO();

		System.out.println("Monto?, Personas? Tip? Redondear?");
		cuenta.setMontoCta(scanner.nextDouble());
		cuenta.setPersonas(scanner.nextInt());
		cuenta.setPropina(scanner.nextDouble());
		cuenta.setRedondear(scanner.nextBoolean());
//		cuenta.printValues();
		
		
		System.out.println("Cta%=1, Cta$=2. Elige");
		int tipoCta = scanner.nextInt();
		scanner.close();
		
		switch (tipoCta) {
		case 1:
			cta = new CtaPP_BO(cuenta);
			break;
		case 2:
			cta = new CtaPF_BO(cuenta);
			break;

		default:
			System.out.println("unkown seleccion");
			break;
		}
		
		System.out.println("Total x mono exacto=" + cta.getCtaIndividual_Exacta());
		System.out.println("Total x mono redondeado=" + cta.getCtaIndividual_Redondeada());
		
	}

}

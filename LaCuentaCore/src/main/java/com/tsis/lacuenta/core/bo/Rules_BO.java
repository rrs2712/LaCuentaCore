package com.tsis.lacuenta.core.bo;

public class Rules_BO {
	
	private double montoMin=0.0;
	private double montoMax=99999.99;
	private int personasMin=1;
	private int personasMax=99;
	private double tipMin=0.0;
	private double tipMax=99999.99;
	private int tipoCtaMin=1;
	private int tipoCtaMax=2;

	public boolean isDataOk(double monto, int personas, double tip){
		return isAllTrue(
				isMontoOk(monto),
				isPersonasOk(personas),
				isTipOk(tip)
				);
	}
	
	public boolean isMontoOk(double monto){
		return isInRange(montoMin, montoMax, monto);
	}
	
	public boolean isPersonasOk(int personas){
		return isInRange(personasMin, personasMax, personas);
	}
	
	public boolean isTipOk(double tip){
		return isInRange(tipMin, tipMax, tip);
	}
	
	public boolean isTipoCtaOk(int tipoCta){
		return isInRange(tipoCtaMin, tipoCtaMax, tipoCta);
	}
	
	public boolean isInRange(double min, double max, double prospect){
		if (prospect>=min) {
			if (prospect<=max) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isInRange(int min, int max, int prospect){
		if (prospect>=min) {
			if (prospect<=max) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isAllTrue(boolean... bs){
		boolean answer=true;
		for (boolean b : bs) {
			if (!b) {
				answer=false;
				break;
			}
		}
		return answer;
	}
}

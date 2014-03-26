package com.tsis.lacuenta.core.dto;

public class CtaFake_DTO {
	private Cta_DTO dto;
	private double xpectResult;
	/**
	 * 
	 */
	public CtaFake_DTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param dto
	 * @param xpectResult
	 */
	public CtaFake_DTO(Cta_DTO dto, double xpectResult) {
		super();
		this.dto = dto;
		this.xpectResult = xpectResult;
	}
	/**
	 * @return the dto
	 */
	public Cta_DTO getDto() {
		return dto;
	}
	/**
	 * @param dto the dto to set
	 */
	public void setDto(Cta_DTO dto) {
		this.dto = dto;
	}
	/**
	 * @return the xpectResult
	 */
	public double getXpectResult() {
		return xpectResult;
	}
	/**
	 * @param xpectResult the xpectResult to set
	 */
	public void setXpectResult(double xpectResult) {
		this.xpectResult = xpectResult;
	}

}

package day_00_es_06_gestione_pagamento;

public class BonificoBancario implements MetodoPagamento {

	private String iban;
	private String intestatario;
	// Commissione esempio: 3,4% + 0,35€
	private static final double COMM_FISSA = 1.50;

	public BonificoBancario() {
		super();
	}

	public BonificoBancario(String aIban, String aIntestatario) {
		super();
		this.iban = aIban;
		this.intestatario = aIntestatario;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String aIban) {
		this.iban = aIban;
	}

	public String getIntestatario() {
		return intestatario;
	}

	public void setIntestatario(String aIntestatario) {
		this.intestatario = aIntestatario;
	}
	
	public double effettuaPagamento(double importo) {
		return importo + COMM_FISSA;
	}

	@Override
	public String toString() {
		return "BonificoBancario [iban=" + iban + ", intestatario=" + intestatario + "]";
	}

}

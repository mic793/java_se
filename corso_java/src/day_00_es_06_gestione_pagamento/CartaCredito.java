package day_00_es_06_gestione_pagamento;

public class CartaCredito implements MetodoPagamento {

	private String titolare;
	private String numero;
	private String cvv;
	private String scadenza;
	// Commissione esempio: 2% + 0,30€
	private static final double COMM_PERCENT = 0.02;
	private static final double COMM_FISSA = 0.30;

	public CartaCredito() {
		super();
	}

	public CartaCredito(String aTitolare, String aNumero, String aCvv, String aScadenza) {
		this.titolare = aTitolare;
		this.numero = aNumero;
		this.cvv = aCvv;
		this.scadenza = aScadenza;

	}

	public String getTitolare() {
		return titolare;
	}

	public void setTitolare(String aTitolare) {
		this.titolare = aTitolare;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String aNumero) {
		this.numero = aNumero;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String aCvv) {
		this.cvv = aCvv;
	}

	public String getScadenza() {
		return scadenza;
	}

	public void setScadenza(String aScadenza) {
		this.scadenza = aScadenza;
	}

	@Override
	public double effettuaPagamento(double importo) {
		double commissione = importo * COMM_PERCENT + COMM_FISSA;
		return importo + commissione;
	};

	@Override
	public String toString() {
		return "CartaCredito [titolare=" + titolare + ", numero=" + numero + ", cvv=" + cvv + ", scadenza=" + scadenza
				+ "]";
	}

}

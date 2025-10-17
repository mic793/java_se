package day_00_es_06_gestione_pagamento;

public class PayPal implements MetodoPagamento {

	private String email;
	private double saldoDisponibile;
	// Commissione esempio: 3,4% + 0,35€
	private static final double COMM_PERCENT = 0.034;
	private static final double COMM_FISSA = 0.35;

	public PayPal() {
		super();
	}

	public PayPal(String aEmail, double aSaldoDisponibile) {
		this.email = aEmail;
		this.saldoDisponibile = aSaldoDisponibile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String aEmail) {
		this.email = aEmail;
	}

	public double getSaldoDisponibile() {
		return saldoDisponibile;
	}

	public void setSaldoDisponibile(double aSaldoDisponibile) {
		this.saldoDisponibile = aSaldoDisponibile;
	}

	public double effettuaPagamento(double importo) {
		double commissione = importo * COMM_PERCENT + COMM_FISSA;
		return importo + commissione;
	}

	@Override
	public String toString() {
		return "PayPal [email=" + email + ", saldoDisponibile=" + saldoDisponibile + "]";
	}

}

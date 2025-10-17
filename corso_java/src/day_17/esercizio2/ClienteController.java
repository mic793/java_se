package day_17.esercizio2;

public class ClienteController {

	public static void prezzoDaPagare(Cliente aCliente) {
		if (aCliente instanceof ClienteLuce) {
			ClienteLuce clienteLuce = (ClienteLuce) aCliente;
			if (clienteLuce.getKwh() < 300) {
				clienteLuce.setCostoKwh(0.25);
			} else if (clienteLuce.getKwh() >= 300 && clienteLuce.getKwh() < 700) {
				clienteLuce.setCostoKwh(0.18);
			} else {
				clienteLuce.setCostoKwh(0.15);
			}
			clienteLuce.setPrezzoDaPagare(clienteLuce.getKwh() * clienteLuce.getCostoKwh());
		} else if (aCliente instanceof ClienteGas) {
			ClienteGas clienteGas = (ClienteGas) aCliente;
			if (clienteGas.getMetroCubo() < 50) {
				clienteGas.setCostoMetroCubo(1);
			} else if (clienteGas.getMetroCubo() >= 50 && clienteGas.getMetroCubo() < 80) {
				clienteGas.setCostoMetroCubo(0.8);
			} else {
				clienteGas.setCostoMetroCubo(0.7);
			}
			clienteGas.setPrezzoDaPagare(clienteGas.getMetroCubo() * clienteGas.getCostoMetroCubo());
		} else if (aCliente instanceof ClienteFisso) {
			ClienteFisso clienteFisso = (ClienteFisso) aCliente;
			if (clienteFisso.getTipo() == TipoCliente.STANDARD) {
				clienteFisso.setPrezzoDaPagare(TipoCliente.STANDARD.getPrezzo());
			} else if (clienteFisso.getTipo() == TipoCliente.SPECIAL) {
				clienteFisso.setPrezzoDaPagare(TipoCliente.SPECIAL.getPrezzo());
			} else {
				clienteFisso.setPrezzoDaPagare(TipoCliente.SUPERSPECIAL.getPrezzo());
			}

		} else if (aCliente instanceof ClienteMobile) {
			ClienteMobile clienteMobile = (ClienteMobile) aCliente;
			if (clienteMobile.getGigaByte() < 30) {
				clienteMobile.setPrezzoDaPagare(8);
			} else if (clienteMobile.getGigaByte() >= 30 && clienteMobile.getGigaByte() <= 80) {
				clienteMobile.setPrezzoDaPagare(12);
			} else {
				clienteMobile.setPrezzoDaPagare(15);
			}

		}
	}
}

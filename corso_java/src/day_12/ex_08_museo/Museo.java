package day_12.ex_08_museo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Museo {
	private final Opera[] operaEsposta;
	private final List<Opera> operaNonEsposta;
	
	//costruttore di default
	public Museo() {
		super();
		operaEsposta = new Opera[10];//array di 10 elementi perche le opere esposte possono essere solo 10
		operaNonEsposta = new LinkedList<Opera>();

	}

	public Opera[] getOperaEsposta() {
		return operaEsposta;
	}

	public List<Opera> getOperaNonEsposta() {
		return operaNonEsposta;
	}




	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Museo [operaEsposta=\n");
		for(Opera o : operaEsposta) {
			sb.append(o);
			sb.append("\n");
		}
		sb.append(" ]\n");
		sb.append("Museo [operaNonEsposta=\n");
		for(Opera o : operaNonEsposta) {
			sb.append(o);
			sb.append("\n");
		}
		sb.append(" ]");
		return sb.toString();
	}
	
	
	
	
	
	/*
	 * //1) carica(Opera opera) : void verifica se c'e' posto nel museo e mette
	 * l'opera "esposta" //altrimenti mette l'opera nel deposito e la imposta
	 * "non esposta" public void caricaOpera(Opera opera) { int index = 1;
	 * if(opera.isEsposta() == true) { for(int i = 0; i < this.operaEsposta.length;
	 * i++) { if(this.operaEsposta[i] == null) { index = 1; break; } } } if(index !=
	 * -1) { opera.setEsposta(true); this.operaEsposta[index] = opera; }else {
	 * opera.setEsposta(false); operaNonEsposta.add(opera); } } //2) sposta(into
	 * codice): Opera sposta l'opera del museo al deposito e cambia il campo esposta
	 * public Opera spostaOpera(String aCodice) { int index = -1; Opera opera =
	 * null; for(int i = 0; i < this.operaEsposta.length; i++) {
	 * if(this.operaEsposta[i] != null && this.operaEsposta[i].getCodice() ==
	 * aCodice) { index = i; break; } } if(index != -1) {
	 * operaEsposta[index].setEsposta(false);
	 * operaNonEsposta.add(operaEsposta[index]); opera = operaEsposta[index];
	 * operaEsposta[index] = null; } return opera; } //3) cerca(int codice) : Opera
	 * cerca per codice l'opera sia nel museo che nel deposito public Opera
	 * cercaOpera(String aCodice) { iterator = operaNonEsposta.listIterator();
	 * for(int i = 0; i < this.operaEsposta.length; i++) { if(this.operaEsposta[i]
	 * != null && this.operaEsposta[i].getCodice() == aCodice) { return
	 * operaEsposta[i] } }
	 * 
	 * }
	 */

}

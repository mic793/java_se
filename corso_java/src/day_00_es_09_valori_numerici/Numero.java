package day_00_es_09_valori_numerici;

/*
 * Definisci una opportuna gerarchia di classi per rappresentare valori numerici: tutte le
 * classi devono implementare l'interfaccia numero (N) contenete i seguenti metodi
 * abstract double valore che restituisce il valore associato a un dato numero,
 * abstract String stampa che restituisce una stringa che descrive il valore.
 * Implementare poi le seguenti classi concrete:
 * la classe intero (I) che implementa numero e rappresenta un valore intero contiene
 * oltre ai metodi ereditati i seguenti elementi:
 * una variabile di istanza valore:private int v che memorizza il valore intero associato
 * all'oggetto un costruttore pubblico ad un argomento valore che assegna il valore alla variabile di
 * istanza valore.
 * II metodo pubblico divisibile: boolean estd(int v2) che restituisce true se il valore
 * dell'oggetto this é divisibile con il valore associato a v2.
 * II metodo pubblico getvalore: int getv che restituisce il valore associato all 'oæetto.
 * il metodo ereditato String stupa () che restituisce una stringa del valore intero
 * associato all'oggetto ed il metodo ereditato valore ( ) .
 * La classe frazione (F), implementa numero e rappresenta una frazione contiene oltre
 * ai metodi ereditati anche i seguenti elementi due variabili di istanza
 * numeratore : private n (int) e denominatore : d (int) un costruttore pubblico con due argomenti:numeratore e denominatore;
 * il metodo pubblico boolean é-frazione-propria:boolean estfp() che non ha
 * parametri e controlla se la frazione é una frazione propria (cioé rappresenta
 * numeratore / denominatore ).
 * II metodo void inversa che non ha parametri che restituisce la frazione inversa
 * della frazione rappresentata da this, ottenuta scambiando numeratore e
 * denominatore. I i metodi pubblici getn() e getd() che restituiscono numeratore e
 * denominatore. II metodo ereditato stampa che restituisce una stringa nella forma
 * (n/d). II metodo ereditato valore () che restituisce il valore double associato alla
 * frazione. La classe operazione (O) che implementa N e rappresenta una operazione
 * aritmetica tra numeri scelta tra addizione, sottrazione, moltiplicazione e divisione;
 * essa contiene oltre ad i metodi ereditati anche i seguenti elementi: tre variabili di
 * istanza private: opl (operando 1) op2 (operando 2) char op (operazione) che
 * rappresentano i due operandi e l'operazione scelta tra + - * / deve esserci un
 * costruttore pubblico con i tre argomenti opl,op2,op. i metodi pubblici getopl ()
 * getop2 e getop II metodo ereditato stalQa() che restituisce una una stringa
 * nella forma opl op op2 senza spazi il metodo ereditato valore che restituisce il valore
 * double calcolato mediante I 'espressione.
 * 
 */

public interface Numero {
	
	double valore();
	String stampa();
	

}

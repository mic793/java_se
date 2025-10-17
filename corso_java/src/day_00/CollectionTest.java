package day_00;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionTest {
	public static void main(String[] args) {
		
		//ARRAYLIST
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(9);
		arrList.add(10);
		arrList.add(11);
		arrList.add(12);
		arrList.remove(3);
		arrList.remove(new Integer(11));
		
		System.out.println("Lista stampata con enhanced for");
		for(Integer i : arrList) {
			System.out.println(i);
		}
		System.out.println("Lista stampata con for ");
		for(int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		Iterator<Integer> iter = arrList.iterator();
		System.out.println("Lista stampata con iteratore e while ");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("");
		System.out.println("*************************");
		System.out.println("");
		
		
		//LINKEDLIST
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Ciao");
		linkedList.add("Ciaoo");
		linkedList.add("Ciaooo");
		linkedList.add("Ciaoooo");
		
		System.out.println("Lista stampata con enhanced for");
		
		for(String i : linkedList) {
			System.out.println(i);
		}
		
		System.out.println("Lista stampata con for ");
		
		for(int i = 0; i < linkedList.size(); i++) {
			
			System.out.println(linkedList.get(i));
		}
		
		Iterator<String> iter1 = linkedList.iterator();
		System.out.println("LinkedList stampata con iterator e while: ");
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		// List iterator puo essere utilizzato per linkedList e arrayList e muovo il
        // cursore sia in avanti che indietro(BIDIREZIONALE)
		ListIterator<String> iteratoreBidirezionale = linkedList.listIterator();
		
		while(iteratoreBidirezionale.hasNext()) {
			System.out.println(iteratoreBidirezionale.next());
		}
		
		while(iteratoreBidirezionale.hasPrevious()) {
			System.out.println(iteratoreBidirezionale.previous());
		}
		/*Una lista è una sequenza ordinata di elementi che ammette duplicati
        ArrayList & LinkedList
        Sono entrambe delle implementazioni dirette dell'interfaccia List; 
        queste differiscono essenzialmente per la loro progettazione.
        ArrayList - come suggerisce il nome, è basata su un array per cui l'operazione di accesso all'elemento impiega tempo costante 
        (complessità O(1), cioè viene prelevato direttamente giacchè gli elementi vengono memorizzati in locazioni contigue).
        LinkedList - è basata su una lista linkata per cui l'accesso ad uno specifico elemento consiste nello scorrere 
        l'intera lista alla ricerca dello stesso. Quest'operazione ha un costo computazionale maggiore, nell'ordine di O(n).
        A seguito delle considerazioni fatte la scelta dell'implementazione da utilizzare dipende solo ed esclusivamente 
        dal contesto specifico che vi trovate ad affrontare. Per fare un esempio consideriamo il caso in cui, 
        per esigenze specifiche, si abbia bisogno di una struttura dati con inserimenti effettuati di rado e continui accessi: 
        in questo caso la scelta più ovvia ricade su ArrayList.
       */
		
		System.out.println("");
		System.out.println("*************************");
		System.out.println("");		
		
		
		//STACK
		Stack<String> stack = new Stack<>();
		
		// Inserimento di elementi nello stack
		stack.push("Elemento 1");
		stack.push("Elemento 2");
		stack.push("Elemento 3");
		
		// Visita degli elementi nello stack
		System.out.println("Elementi nello stack: ");
		
		for(String elemento : stack) {
			System.out.println(elemento);
		}
		
		// Rimozione di un elemento dallo stack
		String rimosso = stack.pop();
		System.out.println("Elemento rimosso: " + rimosso);
		
		// Visualizzazione dell'elemento in cima allo stack senza rimuoverlo
		String top = stack.peek();
		System.out.println("Elemento in cima allo stack: " + top);
		
		// Ottengo il primo elemento inserito
		String primoElemento = stack.get(0);
		
		System.out.println("Il primo elemento inserito e': " + primoElemento);
		
		System.out.println("");
		System.out.println("*************************");
		System.out.println("");		
		
		
		//SET
		Set<Character> setCharacter = new HashSet<>();
		setCharacter.add('B');
		setCharacter.add('C');
		setCharacter.add('A');
		setCharacter.add('D');
		
		Iterator<Character> itrSet = setCharacter.iterator();
		System.out.println("HashSet stampato con iteratore ");
		while(itrSet.hasNext()) {
			System.out.println(itrSet.next());
		}
		
		System.out.println("");
		System.out.println("*************************");
		System.out.println("");		
		
		
		//TREESET
		Set<Double> setTree = new TreeSet<>();
		setTree.add(8.9);
		setTree.add(7.5);
		setTree.add(4.5);
		setTree.add(9.8);
		
		Iterator<Double> itrSet1 = setTree.iterator();
		System.out.println("TreeSet stampato con iteratore ");
		while(itrSet1.hasNext()) {
			System.out.println(itrSet1.next());
		}
		
		System.out.println("");
		System.out.println("*************************");
		System.out.println("");
		
		
		//LINKEDHASHSET
		Set<String> setLinkedHash = new LinkedHashSet<>();
		setLinkedHash.add("Ciao");
		setLinkedHash.add("a");
		setLinkedHash.add("tutti");
		setLinkedHash.add("Ciao");
		setLinkedHash.add("a");
		setLinkedHash.add("tutti");
		setLinkedHash.add("quanti");
		
		Iterator<String> itrLinkedHashSet = setLinkedHash.iterator();
		System.out.println("setLinkedHash stampato con iteratore ");
		while(itrLinkedHashSet.hasNext()) {
			System.out.println(itrLinkedHashSet.next());
		}
		  /*L'interfaccia Set non aggiunge alcun metodo a quelli già previsti dall'Interfaccia Collection e rappresenta 
	       un insieme di elementi senza duplicati. Il fatto di non permettere la presenza di duplicati impone la presenza di una tecnica che 
	       consenta di distinguere gli oggetti. Questo si traduce nell'implementazione dell'interfaccia Comparable da parte degli oggetti 
	       gestiti all'interno della nostra Collezione (nel Nostro caso Item).
	       TreeSet, 
	       come TreeMap, è utilizzato quando occorre mantenere un ordinamento di qualche tipo all'interno dell'insieme di elementi. 
	       Ha un tempo di accesso maggiore (di ordine logaritmico) proprio per garantire la condizione indicata sopra.*/
		
		System.out.println("");
		System.out.println("*************************");
		System.out.println("");		
				
		
		//HASHMAP
		Map<String, String> hm = new HashMap<String, String>();
		hm.put("Cf4", "Paolo Rossi");
        hm.put("Cf1", "Edoardo Gialli");
        hm.put("Cf2", "Mario Bianchi");
        hm.put("Cf3", "Ernesto Verdi");
        
        // scansione tramite enhanced for
        System.out.println("");
        
        Set<String> keySet = hm.keySet();//recupero l'insieme delle chiavi di tipo Stringa
        for(String key : keySet) {
        	String value = hm.get(key);
        	System.out.println(key + " : " + value);
        }// scansione dell'HasMap tramite for
        
        System.out.println("Scansione dell'HashMap tramite for");
        
        for (int i = 0; i < keySet.size(); i++) {
            String value = hm.get("Cf" + (i + 1));
            System.out.println("Cf" + (i + 1) + " : " + value);

        }
        
        // scansione dell hasmap tramite iterator
        System.out.println("Scansione dell'hashMap tramite iterator");
        Iterator<String> itrMap = keySet.iterator();
        while(itrMap.hasNext()) {
        	String str = itrMap.next();
            System.out.println(str + " : " + hm.get(str));
        }
    	
        System.out.println("");
		System.out.println("*************************");
		System.out.println("");
		
        
        //TREEMAP
        Map<String, String> tm = new TreeMap<String, String>();
        
        tm.put("CF5", "Paola Rossi");
        tm.put("CF6", "Paolo Verdi");
        tm.put("CF7", "Gianni Bianchi");
        tm.put("CF8", "Pietro Neri");
        
        System.out.println("");
        
        // scansione tramite enhanced for
        System.out.println("Scansione del TreeMap tramite iterator");

        Set<String> keySet1 = tm.keySet(); //recupero l'insieme delle chiavi di tipo Stringa
        for(String key : keySet1) {
        	String value = tm.get(key);
        	System.out.println(key + " : " + value);
        }
        
        // scansione del TreeMap tramite for
        System.out.println("Scansione del TreeMap tramite for");
        for(int i = 5; i < keySet1.size() + 5; i++) {
        	String value = tm.get("CF" + i);
        	System.out.println("CF" + i + " : " + value);
        }
        
        // scansione del TreeMap tramite iterator
        System.out.println("Scansione del TreeMap tramite iterator");

        Iterator<String> itrMap1 = keySet1.iterator();

        while (itrMap1.hasNext()) {
            String str = itrMap1.next();
            System.out.println(str + " : " + tm.get(str));
        }

        /*Le Mappe non sono altro che dizionari associativi ovvero strutture dati che associano un valore ad una ed una sola chiave. 
        In java le Mappe implementano l'interfaccia Map (java.util.Map).
        HashMap 
        è una implementazione diretta dell'interfaccia Map ed è anche quella prestazionalmente migliore (più veloce). 
        La caratteristica peculiare di questa implementazione risiede nelle prestazioni essenzialmente legate a:
        Utilizzo di Hashing
        Tempo di accesso agli elementi (costante)
        Mancanza di metodi Synchronized (privo di overhead)
        L'hashing, riportato sopra, è un processo di associazione secondo il quale ad ogni oggetto viene attribuito un intero. 
        Gli interi generati non sono sempre distinti ovvero spesso può capitare che oggetti diversi abbiamo lo stesso hash. 
        La frequenza di questo fenomeno (detto collissione) dipende dalla bontà dell'algoritmo di hashing. 
        Senza addentrarci troppo nel calcolo dell'hashing, a noi basterà sapere che qualora utilizziamo implementazioni che prevedano 
        l'utilizzo di Hash è opportunuto realizzare i metodi hashCode() ed equals() che seppur vengono ereditati dalla classe padre vanno 
        raffinati ed opportunamente realizzati in modo da consentire di distinguere istanze differenti della stessa classe.
        TreeMap 
        implementa l'interfaccia SortedMap ovvero mantiene un ordinamento tra gli elementi. 
        Questo fa si che il tempo di accesso ad uno specifico elemento sia maggiore (ordine logaritmico).
      */
		
	}

}

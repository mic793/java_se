package day_00;

/**
 * Dimostrazione dei concetti chiave di OOP in Java:
 * - Ereditarietà (extends)
 * - Costruttori e chiamata a super(...)
 * - Override dei metodi e dynamic dispatch (late binding)
 * - Aggiunta di comportamenti specifici nelle sottoclassi
 *
 * Nota sulle classi annidate:
 * Le sottoclassi sono dichiarate "static" per poter essere istanziate
 * direttamente dal metodo main (che è static). Una classe interna non-statich
 * richiederebbe prima l'istanza della classe esterna.
 */
public class AnimaleEreditarieta {

    // =======================
    // Superclasse: Animale
    // =======================
    /**
     * "Animale" rappresenta il tipo più generale.
     * Contiene lo stato condiviso (il nome) e un comportamento generico
     * che verrà specializzato nelle sottoclassi.
     */
    public static class Animale {
        // Stato dell'oggetto: ogni animale ha un nome.
        // Lasciamo visibilità di package per semplicità didattica:
        // nelle sottoclassi (qui nello stesso file) è direttamente accessibile.
        // In un design più rigoroso si userebbe 'private' + getter.
        String nome;

        /**
         * Costruttore: inizializza lo stato obbligatorio dell'istanza.
         * @param aNome nome simbolico dell'animale.
         */
        Animale(String aNome) {
            // 'this' si riferisce al campo dell'istanza, disambiguando dall'argomento.
            this.nome = aNome;
        }

        /**
         * Comportamento generico: un animale emette un verso.
         * Questo metodo NON è 'final' e quindi è sovrascrivibile (override)
         * nelle sottoclassi per fornire un comportamento più specifico.
         */
        public void emettiVerso() {
            System.out.println(nome + " emette un verso.");
        }
    }

    // =======================
    // Sottoclasse: Cane
    // =======================
    /**
     * "Cane" estende "Animale":
     * - eredita il campo 'nome' e tutti i metodi pubblici/protected/package
     * - specializza (override) il comportamento 'emettiVerso()'
     * - aggiunge un nuovo comportamento 'scodinzola()'
     */
    public static class Cane extends Animale {

        /**
         * Il costruttore della sottoclasse deve chiamare (come prima istruzione)
         * un costruttore della superclasse tramite 'super(...)', per inizializzare
         * correttamente lo stato ereditato (qui: il nome).
         */
        Cane(String aNome) {
            super(aNome);
        }

        /**
         * Override del metodo definito in 'Animale'.
         * L'annotazione @Override è opzionale ma consigliata: fa controllare
         * al compilatore che la firma sia identica a quella del metodo ereditato.
         */
        @Override
        public void emettiVerso() {
            System.out.println(nome + " abbaia: Bau Bau!");
        }

        /**
         * Metodo specifico del cane (non esiste nella superclasse).
         * Mostra come una sottoclasse possa introdurre nuove funzionalità.
         */
        public void scodinzola() {
            System.out.println(nome + " scodinzola.");
        }
    }

    // =======================
    // Sottoclasse: Gatto
    // =======================
    /**
     * "Gatto" estende "Animale" e fornisce una propria implementazione
     * di 'emettiVerso()', più un comportamento aggiuntivo 'faiFusa()'.
     */
    public static class Gatto extends Animale {

        Gatto(String aNome) {
            // Invoca il costruttore della superclasse per settare 'nome'.
            super(aNome);
        }

        @Override
        public void emettiVerso() {
            System.out.println(nome + " fa: Miaoooo!");
        }

        public void faiFusa() {
            System.out.println(nome + " fa le fusa.");
        }
    }

    // =======================
    // Punto di ingresso
    // =======================
    /**
     * Il metodo main dimostra:
     * - creazione di istanze delle sottoclassi
     * - invocazione di metodi overridati (polimorfismo)
     * - invocazione di metodi specifici della sottoclasse
     * - upcasting implicito verso la superclasse e dynamic dispatch
     */
    public static void main(String[] args) {
        // Creiamo due oggetti con stato differente (nomi diversi).
        Cane cane = new Cane("Fido");
        Gatto gatto = new Gatto("Whiskers");

        // Invoca il metodo overridato della sottoclasse 'Cane'.
        cane.emettiVerso();   // Output: "Fido abbaia: Bau Bau!"

        // Metodo che esiste solo in 'Cane'.
        cane.scodinzola();    // Output: "Fido scodinzola."

        // Invoca il metodo overridato della sottoclasse 'Gatto'.
        gatto.emettiVerso();  // Output: "Whiskers fa: Miaoooo!"

        // Metodo che esiste solo in 'Gatto'.
        gatto.faiFusa();      // Output: "Whiskers fa le fusa."

        // ----------------------------------------------------------
        // Polimorfismo (late binding / dynamic dispatch):
        // Anche trattando le istanze come 'Animale', a runtime verranno
        // eseguite le versioni overridate CORRETTE in base al tipo reale.
        // ----------------------------------------------------------
        Animale a1 = cane;    // Upcasting implicito: Cane -> Animale
        Animale a2 = gatto;   // Upcasting implicito: Gatto -> Animale

        a1.emettiVerso();     // Chiama Cane.emettiVerso() per via del tipo reale (Cane)
        a2.emettiVerso();     // Chiama Gatto.emettiVerso() per via del tipo reale (Gatto)

        // ----------------------------------------------------------
        // Attenzione al downcasting:
        // Richiede cast esplicito e può lanciare ClassCastException se il
        // tipo dinamico non è compatibile.
        // Esempio (commentato):
        //
        // Cane c2 = (Cane) a1; // OK: a1 punta davvero a un Cane
        // Cane c3 = (Cane) a2; // ERRORE a runtime: a2 punta a un Gatto
        // ----------------------------------------------------------
    }
}
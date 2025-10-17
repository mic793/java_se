package day_17.esercizio2;

public enum TipoCliente {
    STANDARD(30.0),
    SPECIAL(50.0),
    SUPERSPECIAL(60.0);

    private final double prezzo;

    // Costruttore dell'enum
    private TipoCliente(double prezzo) {
        this.prezzo = prezzo;
    }

    // Metodo per ottenere il prezzo associato al tipo
    public double getPrezzo() {
        return prezzo;
    }
    
}

package Multimedia;

public class Immagine extends elementoMultimediale{
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita > 0 ? luminosita : 1;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita = Math.max(0, luminosita - 1);
    }

    public void show() {
        String output = titolo;
        for (int i = 0; i < luminosita; i++) {
            output += "*";
        }
        System.out.println(output);
    }

    @Override
    public void esegui() {
    show();
    }
}

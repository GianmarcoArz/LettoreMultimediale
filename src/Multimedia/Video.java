package Multimedia;

public class Video extends elementoVolume implements Riproduci{

    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
        this.luminosita = luminosita > 0 ? luminosita : 1;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita = Math.max(0, luminosita - 1);
    }


    public void play() {
        for (int i = 0; i < durata; i++) {

            String output = titolo;
            for (int j = 0; j < volume; j++) {
                output += "!";
            }
            System.out.println(output);


            String asterisco = "";
            for (int j = 0; j < luminosita; j++) {
                asterisco += "*";
            }
            System.out.println(asterisco);
        }
    }

    @Override
    public void esegui() {
        play();
    }
}

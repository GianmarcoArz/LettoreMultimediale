package Multimedia;

public class Audio extends elementoVolume implements Riproduci {


    public Audio(String titolo, int durata, int volume) {
        super(titolo, durata, volume);
    }

    @Override
    public void play() {

        for (int i = 0; i < durata; i++) {
            String output = titolo;
            for (int j = 0; j < volume; j++) {
                output += "!";
            }
            System.out.println(output);
        }

    }

    @Override
    public void esegui() {

        play();

    }
}

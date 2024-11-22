package Multimedia;

public class LettoreMultimediale {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        elementoMultimediale[] elementi = new elementoMultimediale[5];
        System.out.println("**********************************************");
        System.out.println("BENVENUTO AMICO MIO:");
        System.out.println("Ora ti chiedero di inserire 5 elementi a tua scelta nel tuo lettore. Poi deciderai tu quale riprodurre");


        for (int i = 0; i < 5; i++) {

            System.out.println("Cosa vuoi inserire (1:Audio, 2:Video, 3:Immagine):");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci titolo:");
            String titolo = scanner.nextLine();
            switch (tipo) {
                case 1:
                    System.out.println("Inserisci durata:");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci volume:");
                    int volumeAudio = scanner.nextInt();
                    elementi[i] = new Audio(titolo,durataAudio,volumeAudio);
                    break;

                case 2:
                    System.out.println("Inserisci durata:");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci volume:");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci luminosità:");
                    int luminositaVideo = scanner.nextInt();
                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;

                case 3:
                    System.out.println("Inserisci luminosità:");
                    int luminositaImmagine = scanner.nextInt();
                    elementi[i] = new Immagine(titolo, luminositaImmagine);
                    break;
            }
        }

        System.out.println("*******************************");
        System.out.println("Perfetto AMICO MIO. Ora che hai popolato il tuo lettore : ");

        while (true) {
            System.out.println("Quale elemento vuoi eseguire? (1-5, 0 per finire)");
            int scelta = scanner.nextInt();

            if (scelta == 0) {
                System.out.println("Grazie AMICO MIO per aver usato questo lettore. Arrivederci !");

                break;

            }

            if (scelta > 0 && scelta <= 5) {
                elementi[scelta - 1].esegui();
            }
            else {
                System.out.println("Scelta non valida");
            }
        }

        scanner.close();
    }
}

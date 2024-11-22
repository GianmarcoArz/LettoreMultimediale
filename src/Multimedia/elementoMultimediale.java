package Multimedia;

abstract class elementoMultimediale {
    public  String titolo;

    public elementoMultimediale(String titolo) {
        this.titolo = titolo;
    }
    public abstract void esegui();
}

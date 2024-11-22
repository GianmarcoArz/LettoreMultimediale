package Multimedia;

abstract class elementoVolume extends elementoMultimediale {

    public int volume;
    public int durata;

    public elementoVolume(String titolo, int durata, int volume) {
        super(titolo);

        this.volume = volume > 0 ? volume : 1;
        this.durata = durata > 0 ? durata : 1;
    }

    public void alzaVolume() {
        volume++;
    }

    public void abbassaVolume () {
        volume --;
    }
}


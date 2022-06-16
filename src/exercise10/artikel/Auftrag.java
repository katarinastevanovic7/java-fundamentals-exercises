package exercise10.artikel;

public class Auftrag {
    private int menge;
    private Artikel artikel;

    public Auftrag(int menge, Artikel artikel) {
        this.menge = menge;
        this.artikel = artikel;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public void setArtikel(Artikel artikel) {
        this.artikel = artikel;
    }


    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }


}


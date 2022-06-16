package exercise10.artikel;

public class RabattAuftrag extends Auftrag {

    private double rabattInProzent;

    public RabattAuftrag(int menge, Artikel artikel, double rabattInProzent) {
        super(menge, artikel);
        this.rabattInProzent = rabattInProzent;
    }

    public double getRabattInProzent() {
        return rabattInProzent;
    }

    public void setRabattInProzent(double rabattInProzent) {
        this.rabattInProzent = rabattInProzent;
    }


}
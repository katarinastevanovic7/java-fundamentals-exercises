package exercise10.artikel;

public class ArtikelMain {
    double gesamwert;

    public static double getGesamtwert(Auftrag... auftraege) { // Übungsblatt 12 [] in ...

        double sum = 0;
        for (int i = 0; i < auftraege.length; i++) {
            sum += auftraege[i].getMenge() * auftraege[i].getArtikel().getPreis();

        }
        return sum ;
    }


    public static void main(String[] args) {
        Artikel kaugummi = new Artikel();
        kaugummi.setPreis(.99);
        Artikel Chips = new Artikel();
        Chips.setPreis(.99);
        Artikel Joghurt = new Artikel();
        Joghurt.setPreis(1.89);
        Artikel Wasser = new Artikel();
        Wasser.setPreis(.60);
        Artikel Brot = new Artikel();
        Brot.setPreis(2.99);


        System.out.println(kaugummi.getPreis());
        System.out.println(Chips.getPreis());
        System.out.println(Joghurt.getPreis());
        System.out.println(Wasser.getPreis());
        System.out.println(Brot.getPreis());


        Auftrag kaugummiAuftrag = new Auftrag(100, kaugummi);
        Auftrag ChipsAuftrag = new Auftrag(50, Chips);
        Auftrag WasserAuftrag = new Auftrag(1000, Wasser);
        RabattAuftrag JoghurtAuftrag = new RabattAuftrag(20, Joghurt, 20);
        RabattAuftrag BrotAuftrag = new RabattAuftrag(500, Brot, 10);

        Auftrag[] auftraege = {kaugummiAuftrag, ChipsAuftrag, WasserAuftrag, JoghurtAuftrag, BrotAuftrag};

        System.out.println(getGesamtwert(auftraege));

    }


}

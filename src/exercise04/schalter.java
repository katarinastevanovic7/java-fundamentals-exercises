package exercise04;

public class schalter {

    public static void main(String[] args) {
        boolean schalterA = false, schalterB = true, schalterC = true;
        boolean lichtBrennt = (schalterA || schalterB) && schalterC;
        System.out.println(" ist das licht an: " + lichtBrennt);
        String ausgabe = lichtBrennt ? " Das Licht ist an" : " das Licht ist aus";
        System.out.println(ausgabe);

        if (lichtBrennt) ;
        {
            System.out.println(" ist das lich an : " + lichtBrennt);
        }
    }


}

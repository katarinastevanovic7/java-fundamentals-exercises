package exercise12;

public class Funktion {

    static int magic(int zahl) {
        if(zahl == 0){
            return 1;
        }
        return 2*magic(zahl -1) +1;


    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(magic(i));

        }
    }
}

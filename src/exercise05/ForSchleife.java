package exercise05;

public class ForSchleife {

    public static void main(String[] args) {

        for (int id = 10; id > 0; id -= 2) {
            System.out.println(id);
        }


        {
            int id = 10;
            while (id > 0) {
                System.out.println(id);
                id -= 2;
            }
        }
        int id = 10;
        {
            do {
                System.out.println(id);
                id -= 2;
            } while (id > 0);

        }
    }
}






package exercise07;

        import java.io.IOException;
        import java.util.Scanner;
        import java.nio.file. Path;
        import java.nio.file. Paths;

public class ReadingFiles1 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte Postleitzahl eingeben: ");
        int inputPlz = scanner.nextInt();

        Path file = Paths.get("/Users/katarinastevanovic/Downloads/OpenGeoDB-plz-ort-de-semi.csv");
        Scanner fileScanner = new Scanner(file, "UTF-8");

        //liefert true zurück, wenn es noch eine Zeile gibt, die nicht eingelesen
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter(";");
            int plz = lineScanner.nextInt();
            String city = lineScanner.next();
            if (inputPlz == plz) {
                System.out.print(city + " " + ", ");
            }

            lineScanner.close();
        } // wichtig zu schließen, da dateiressourcen nicht richtig freigegeben werden
        fileScanner.close();
    }
}

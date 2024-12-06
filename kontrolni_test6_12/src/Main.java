import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        final String ODDELOVAC = ":";


        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("soubor.txt")))){
            while(scanner.hasNextLine()){
                String radek = scanner.nextLine();
                String[] polozky = radek.split(ODDELOVAC);
                String jmeno = polozky[0];
                int body = Integer.parseInt(polozky[1].trim());
                if(body > 50){
                    System.out.println(jmeno);
                }



            }
        }   catch (FileNotFoundException e){
            System.err.println("soubor nenalezen");
        }   catch (NumberFormatException e){
            System.err.println("spatne zapsane cislo"+ e.getLocalizedMessage());
        }



    }
}
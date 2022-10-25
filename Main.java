import java.io.InputStream;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Auto Benz = new Auto("EZ182AC", "Merceds Benz", "GLE", 5500, "2022", 4);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la targa: ");
        String targa = scanner.nextLine();
        System.out.println("Inserisci la marca: ");
        String marca = scanner.nextLine();
        System.out.println("Inserisci il modello: ");
        String modello = scanner.nextLine();
        System.out.println("Inserisci la cilindrata: ");
        int cilindrata = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Inserisci l'anno d'acquisto: ");
        String annoAcquisto = scanner.nextLine();
        System.out.println("Inserisci il numero di posti: ");
        Auto tuaMacchina;
        int numeroPosti = scanner.nextInt();
        tuaMacchina = new Auto(targa, marca, modello, cilindrata, annoAcquisto, numeroPosti);
        scanner.close();
        System.out.println("L'anno d'acquisto è: "+tuaMacchina.getAnnoAcquisto());

        Auto[] arrayMacchina = new Auto[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Inserisci l'anno d'acquisto: ");
        }
    }
}
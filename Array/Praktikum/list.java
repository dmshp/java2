package Array.Praktikum;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Jumlah siswa :");
        int a = scan.nextInt();

        System.out.println("-----------------------");

        String[] buah = new String[a];

        for (int i = 1; i < buah.length; i++) {
            System.out.print ( "Siswa ke-" + i + ": ");
            buah [i] = scan.nextLine();
        }

        System.out.println("-----------------------");

        for (String b : buah) {
            System.out.println(b);
        }
    }
}

package percabangan.latihan;
import java.util.Scanner;

public class hadiah {
    public static void main(String[] args) {
        int belanja = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Total Belanjaan: Rp. ");
        belanja = input.nextInt();

        if(belanja > 100000) {
            System.out.println("Selamat, anda mendapatkan hadiah!");


        }

        System.out.println(" Terimakasih.... ");
    }
}

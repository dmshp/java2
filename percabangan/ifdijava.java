package percabangan;
import java.util.Scanner;


public class ifdijava {
    public static void main(String[] args) {
        int jam = 0;
        Scanner input = new Scanner(System.in);


        System.out.println("Masukkan Jam : ");
        jam = input.nextInt();

        if ( jam >= 5 && jam <= 9 ) {
            System.out.println("Selamat pagi!!");
        }
        else if ( jam >= 10 && jam <= 14 ) {
            System.out.println("Siang");
        }
        else if ( jam >= 15 && jam <= 18  ) {
            System.out.println("Sore");
        }
        else {
                System.out.println("Selamat malam!!!");
        }
    }
}


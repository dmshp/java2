package percabangan.latihan;
import java.util.Scanner;

import percabangan.switchd;


public class traficlight {
  public static void main(String[] args) {
    
    String lamp;
    Scanner scan = new Scanner(System.in);

    System.out.print("Input Warna: ");
    lamp = scan.nextLine();

    switch(lamp) {
        case "merah":
            System.out.println(" Berhenti ");
            break;
        case "kuning":
            System.out.println(" Hati-hati ");
            break;
        case "hijau":
            System.out.println(" Jalan ");
            break;        
        default:
            System.out.println(" ???? ");
            break;
    }


  }  
}

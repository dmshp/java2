package Array.Praktikum;
import java.util.Scanner;

public class datasiswa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        
        System.out.print("Jumlah siswa :");
        int a = scan.nextInt();

        System.out.println("-----------------------");

        String[] buah = new String[a];
        int[] nilai = new int [a];
        String[] status = new String[a];


        for (int i = 0; i < a; i++) {
            System.out.print ( "Siswa ke-" + (i+1) + ": ");
            buah [i] = scan2.nextLine();
            System.out.print ( "Nilai siswa ke-" + (i+1) + ": ");
            nilai [i] = scan3.nextInt();

            
            // Lulus/tdk
            if (nilai[i] >= 70) {
                status[i] = "Lulus";
            } else {
                status[i] = "Tidak";
            }

        }

        // Out
        System.out.println("=================================");
        System.out.println("        DAFTAR NILAI SISWA       "); 
        System.out.println("=================================");

        System.out.println("No.\tSiswa\tNilai\tStatus");
        for (int i = 0; i < a; i++) {
            System.out.println((i+1) + "\t" + buah[i] + "\t" + nilai[i] + "\t" + status[i]);
        }

    }
}

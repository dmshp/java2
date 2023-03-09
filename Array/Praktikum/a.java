package Array.Praktikum;
import java.util.Scanner;


public class a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        String[] namaSiswa = new String[jumlahSiswa];
        int[] nilaiSiswa = new int[jumlahSiswa];
        String[] statusSiswa = new String[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nama siswa ke-" + (i+1) + ": ");
            namaSiswa[i] = input.nextLine();

            System.out.print("Masukkan nilai siswa ke-" + (i+1) + ": ");
            nilaiSiswa[i] = input.nextInt();

            if (nilaiSiswa[i] > 70) {
                statusSiswa[i] = "LULUS";
            } else {
                statusSiswa[i] = "TIDAK LULUS";
            }
        }

        System.out.println("Data Siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Nama Siswa: " + namaSiswa[i]);
            System.out.println("Nilai Siswa: " + nilaiSiswa[i]);
            System.out.println("Status Siswa: " + statusSiswa[i]);
            System.out.println();
        }
    }
}

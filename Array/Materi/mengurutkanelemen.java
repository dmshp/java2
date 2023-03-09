package Array.Materi;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.Arrays;

public class mengurutkanelemen {
    public static void main(String[] args) {
        int [] nilaiInterger  = {3, 2, 6, 4, 8, 7, 9, 1, 5, 10};
        char [] nilaiKarakter = {'d', 'c', 'g', 'f', 'i', 'a', 'b', 'h', 'e'};
        
        String tampilan;
        JTextArea areaTampilan;

        // Menampilkan elemen larik integer
        tampilan = "Menampilkan elemen larik integer :\n";
        for (int x = 0; x < nilaiInterger.length; x++)
            tampilan += nilaiInterger[x] + "  ";
        Arrays.sort(nilaiInterger);

        // Setelah diurutkan

        tampilan += "\nMenampilkan elemen larik integer setelah diurutkan :\n";
        for (int x = 0; x < nilaiInterger.length; x++)
            tampilan += nilaiInterger[x] + "  ";

        // Menampilkan elemen larik karakter
        tampilan += "\n \nMenampilkan elemen larik karakter :\n";
        for (int x = 0; x< nilaiKarakter.length; x++)
            tampilan += nilaiKarakter[x] + "  ";
        Arrays.sort(nilaiKarakter);

        // Setelah diurutkan
        tampilan += "\nMenampilkan elemen larik karakter setelah diurutkan :\n";
        for ( int x = 0; x < nilaiKarakter.length; x++)
            tampilan += nilaiKarakter[x] + "  ";
        
            areaTampilan = new JTextArea();
        areaTampilan.setText(tampilan);
        JOptionPane.showMessageDialog(null, areaTampilan, "Mengurutkan Elemen Larik",  JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }
}

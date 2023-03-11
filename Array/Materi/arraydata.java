package Array.Materi;

public class arraydata {
    public static void main(String[] args) {
        // Array data
        String[][] data = {
            {"Nama", "Usia", "Alamat"},
            {"Andi", "25", "Jakarta"},
            {"Budi", "30", "Surabaya"},
            {"Cindy", "27", "Bandung"},
            {"Diana", "29", "Semarang"}
        };
        
        // Membuat tabel
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


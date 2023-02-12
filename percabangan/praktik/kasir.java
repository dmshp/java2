package percabangan.praktik;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class kasir {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("kosong.png");

        String yatidak = (String) JOptionPane.showInputDialog(null,"Apakah anda mempunyai kartu member ?","XRA Market",JOptionPane.INFORMATION_MESSAGE,icon,null,"");
        switch(yatidak) {
            case "ya":
                
                String total1 = (String) JOptionPane.showInputDialog(null,"Berapa total belanja anda ?","XRA Market",JOptionPane.INFORMATION_MESSAGE,icon,null,"");
                
                int num1 = Integer.parseInt(total1);
                if ( num1 >= 500000 ) {
                    int diskon50 = num1 - 50000;
                    JOptionPane.showMessageDialog(null, "Maka anda hanya harus membayar sebesar : " + diskon50);
                }
                else if (num1 >= 100000) {
                    int diskon15 = num1 - 15000;
                    JOptionPane.showMessageDialog(null, "Maka anda hanya harus membayar sebesar : " + diskon15);
                } else {
                    JOptionPane.showMessageDialog(null, "Maka anda hanya harus membayar sebesar : " + num1);
                }

                break;
            case "tidak":
                String total2 = (String) JOptionPane.showInputDialog(null,"Berapa total belanja anda ?","XRA Market",JOptionPane.INFORMATION_MESSAGE,icon,null,"");
                int num2 = Integer.parseInt(total2);
                if ( num2 >= 100000 ) {
                    int diskon10 = num2 - 10000;
                    JOptionPane.showMessageDialog(null, "Maka anda hanya harus membayar sebesar : " + diskon10);
                } else {
                    JOptionPane.showMessageDialog(null, "Maka anda hanya harus membayar sebesar : " + num2);
                }
                break;    
        }
    }
}

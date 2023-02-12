package percabangan.praktik;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class tilang {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("kosong.png");

        String sim = (String) JOptionPane.showInputDialog(null,"Apakah anda mempunyai kartu sim ?","XRA Departement",JOptionPane.INFORMATION_MESSAGE,icon,null,"");
        if ( sim.equals("ya")) {
            String stnk = (String) JOptionPane.showInputDialog(null,"Apakah anda mempunyai stnk kendaraan ini ?","XRA Departement",JOptionPane.INFORMATION_MESSAGE,icon,null,"");
            if ( stnk.equals("ya") ) {
                JOptionPane.showMessageDialog(null, "Anda lolos");
            }
            else {
                JOptionPane.showMessageDialog(null, "Anda ditilang");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Anda ditilang");
        }
    }
}

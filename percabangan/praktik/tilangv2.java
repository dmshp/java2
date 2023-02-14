package percabangan.praktik;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class tilangv2 {


    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("kosong.png");


        int sim = JOptionPane.showOptionDialog(null, "Apakah anda mempunyai SIM", "XRA Departement", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon, null, null);
        if (sim == JOptionPane.YES_OPTION ) {
            int stnk = JOptionPane.showOptionDialog(null, "Apakah anda mempunyai STNK", "XRA Departement", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon, null, null);
            if (stnk == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Tidak ditilang");
            } else if(stnk == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Anda Ditilang");
            }
        } else if(sim == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Anda Ditilang");
        }
    }   
}

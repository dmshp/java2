package perulangan.praktik;

public class ww {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++) {
            for(int j=4-i; j>0; j--) {
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
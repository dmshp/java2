package percabangan;
import java.util.Scanner;


public class switchd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String aa = "";
        
        System.out.println("Masukkan ya / tidak / atau : ");
        aa = input.nextLine();

        
        switch (aa) {
            case "ya":
                System.out.println("ya");
                break;
            case "tidak":
                System.out.println("tidak");
                break;
            case "atau":
                System.out.println("atau");
                break;
            default:
                System.out.println("apa?");
                break;
        }
    }
}



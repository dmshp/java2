package percabangan.latihan;
import java.util.Scanner;
public class grade 
{
    static void main(String[]args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.print("Inputkan nilai :");
        int b = scan.nextInt();
        String grade;
        
        if (b >= 90)
        {
            grade = "A";
        }
        else if (b >= 80)
        {
            grade = "B+";
        }
        else if (b >= 70)
        {
            grade = "B";
        }
        else if (b >= 60)
        {
            grade = "C+";
        }
        else if (b >= 50)
        {
            grade = "C";
        }
        else if (b >= 40)
        {
            grade = "D";
        }
        else {
            grade = "E";
        }

        System.out.print("Grade: " + grade);
    
    }
        
}

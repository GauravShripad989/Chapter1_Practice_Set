package Chapter1_Practice_Set;
import java.util.Scanner;
public class Calculating_CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input grade of 3 subject
        System.out.println("enter your grade of respective 3 subject:");

        //input
        int grade1 = sc.nextInt();
        int grade2 = sc.nextInt();
        int grade3 = sc.nextInt();

        //Calculation
        int sum = (grade1 + grade2 + grade3);
        float CGPA = ((float) sum / 3);

        //Output
        System.out.println("CGPA is : "+CGPA);

    }
}

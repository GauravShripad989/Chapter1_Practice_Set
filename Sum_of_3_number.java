package Chapter1_Practice_Set;
import java.util.Scanner;
public class Sum_of_3_number {
    public static void main(String[] args){
        // Sum of 3 Numbers

        //input numbers from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three number");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        // Sum of the Number
        float sum = num1 + num2 + num3;
        System.out.println("Sum of numbers "+num1+" ,"+num2+" ,"+num3+
                " ,is "+sum);

    }
}

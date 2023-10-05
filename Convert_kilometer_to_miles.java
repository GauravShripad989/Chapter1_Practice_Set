package Chapter1_Practice_Set;
import java.util.Scanner;
public class Convert_kilometer_to_miles {
    public static void main(String[] args) {
        //Enter value in kilometer
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in Kilometer : ");
        float kilo = sc.nextFloat();
        //calculation part
        float miles = (float) ( kilo / 1.609);

        //output
        System.out.println(kilo+" km in miles : "+ miles);
    }
}

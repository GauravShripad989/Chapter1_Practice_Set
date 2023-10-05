package Chapter1_Practice_Set;
import java.util.Scanner;
public class Greet_user {
    public static void main(String[] args) {
        //Input username
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String userName = sc.nextLine();

        //Output greet
        System.out.println("Hello! "+userName+" ,have a good day");

    }
}

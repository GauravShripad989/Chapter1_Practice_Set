package Chapter1_Practice_Set;
import java.util.Scanner;
public class Interger_or_not {
    public static void main(String[] args) {
        //take input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        if(sc.hasNextLine()){
            System.out.println(sc.nextInt()+ " is valid integer");
        }else {
            System.out.println(sc.nextInt()+" is not a valid integer");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class IT25102435Lab4Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Positive number");
        } 
        else if (number < 0) {
            System.out.println("Negative number");
        } 
        else {
            System.out.println("Number is Zero");
        }

        input.close();
    }
}
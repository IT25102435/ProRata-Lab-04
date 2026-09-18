import java.util.Scanner;

public class IT25102435Lab4Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double examMarks;
        double labMarks;
        double examPercentage;
        double labPercentage;
        double finalMark;

        do {
            System.out.print("Enter exam marks (0-100): ");
            examMarks = input.nextDouble();

            if (examMarks < 0 || examMarks > 100) {
                System.out.println("Invalid marks! Try again.");
            }

        } while (examMarks < 0 || examMarks > 100);

        do {
            System.out.print("Enter lab marks (0-100): ");
            labMarks = input.nextDouble();

            if (labMarks < 0 || labMarks > 100) {
                System.out.println("Invalid marks! Try again.");
            }

        } while (labMarks < 0 || labMarks > 100);
       
        do {
            System.out.print("Enter exam percentage: ");
            examPercentage = input.nextDouble();

            System.out.print("Enter lab percentage: ");
            labPercentage = input.nextDouble();

            if (examPercentage + labPercentage != 100) {
                System.out.println(
                    "Invalid percentages! Total must be 100."
                );
            }

        } while (examPercentage + labPercentage != 100);
        
        finalMark = (examMarks * examPercentage
                   + labMarks * labPercentage) / 100;

        System.out.println("Final Mark: " + finalMark);

        input.close();
    }
}
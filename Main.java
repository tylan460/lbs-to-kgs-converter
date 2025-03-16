import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // creating objects

        Scanner scanner = new Scanner(System.in);

        // welcome message
        System.out.println("Weight Conversion Program");

        // variable declaration
        int option;
        double kgs;
        double lbs;

        //user options and prompt
        System.out.println("1: Convert lbs to kgs\n2: Convert kgs to lbs");
        System.out.print("Choose an option: ");
        option = scanner.nextInt();

        //conversion code along with output
        /* this code doesn't have any exception handling at the moment 
        i suppose i'll figure out how to implement it later once i learn more
        */

        if(option == 1) {
            System.out.print("Enter the weight in lbs: ");
            lbs = scanner.nextDouble();
            double lbsToKgs = lbs * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f", lbsToKgs);

        }
        else if(option == 2) {
            System.out.print("Enter the weight in kgs: ");
            kgs = scanner.nextDouble();
            double kgsToLbs = kgs * 2.20462;
            System.out.printf("The new weight in kgs is: %.2f", kgsToLbs);
        } else {
            System.out.println("That was not a valid choice!");
        }
         scanner.close();
    }

}

import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {
        System.out.println("Welcome In Bus Ticket Discount Checker");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int Yourage = input.nextInt();
        System.out.print("Pls Verify us Your Male/Female in True/False: ");
        boolean isFemale = input.nextBoolean();

        if (Yourage<5){
            System.out.println("You got 50% discount");
        } else if (isFemale) {
            System.out.println("You got 100% discount, means got a free ticket");
        } else if (Yourage>60 && !isFemale) {
            System.out.println("You got 50% discount");
        }
        else {
            System.out.println("Sorry, We don't have discount for you");
        }
    }
}

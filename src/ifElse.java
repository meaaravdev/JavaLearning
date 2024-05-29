import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Answer in True/False: ");
        boolean isMale = input.nextBoolean();

        /* used to consume the newline character left in the buffer after calling input.nextBoolean();*/
        input.nextLine();

        System.out.print("Enter Your Name: ");
        String yourName = input.nextLine();

        if (isMale){
            System.out.println("You are Male " + yourName);
        }
        else {
            System.out.print("I think you are not male " +yourName);
        }
    }
}

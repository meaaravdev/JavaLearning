import java.util.Scanner;

public class relationalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Age of Verify For Driving License: ");
        int Userage = input.nextInt();

        if (Userage>=18){
            System.out.println("You are Eliglibe For Driving License");
        }
        else {
            System.out.println("Sorry you are not eliglibe for driving license, cycle chalao");
        }
    }
}

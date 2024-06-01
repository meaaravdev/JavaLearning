import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int first = Calc();
        int second = Calc();

        int sum = first+second;
        System.out.println("Sum is: "+sum);
    }

    public static int Calc(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numbber = input.nextInt();
        return numbber;
    }

    public static void greet(){
        System.out.println("Welocme to calculator");
    }
}

public class ParameterFunctions {
    public static void main(String[] args) {
        int num = sumOfTwoNumbers(4,7);
        System.out.println(num);
        System.out.println((sumOfTwoNumbers(7,88)));
        System.out.println((sumOfTwoNumbers(-89,45)));
    }
    public static int sumOfTwoNumbers(int first, int second){
        System.out.println("First Number Received & value is: "+first);
        System.out.println("Second Number Received & value is: "+second);
        int sum = first + second;
        return sum;
    }
}

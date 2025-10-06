import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 number");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2 number");
        int num2 = scanner.nextInt();

        System.out.println("Operation");
        String action = scanner.next();
        int res;

        switch (action){
            case "+":
                res = num1 + num2;
                System.out.println("Result: " + res);
                break;
            case "*" :
                res = num1 * num2;
                System.out.println("Result: " + res);
                break;
            case "/" :
                if (num2 == 0)
                    System.out.println("Error");
                else {
                    res = num1 / num2;
                    System.out.println("Result: " + res);
                }
                break;
            default:
                System.out.println("Unknown operation");
        }
    }
}

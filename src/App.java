import java.util.Scanner;

public class App {



    public static int Fibonacci(int n){
        if (n == 0 || n == 1) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
        
    }

    public static void getFibonacciNumber(int n) {
        n = Fibonacci(n);
    }

    public static void main(String[] args) throws Exception {
        for (String s: args) {
            System.out.println(s);
        }

    int firstArg;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input the Fibonacci number you want.");
    firstArg = scanner.nextInt();
    scanner.close();
    System.out.println(Fibonacci(firstArg));
    getFibonacciNumber(firstArg);
        
    if (firstArg <= -1) {
        try {
            firstArg = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            
            } finally {
                System.out.println("n must be a non-negative number!");
            System.exit(1);
            }
        }

    }
    
}

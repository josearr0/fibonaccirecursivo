
import java.util.Scanner;


public class FibonacciRecursivo {

    public static int fibonacci(int n) {

        if (n == 1 || n == 2) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

    public static void main(String args[]) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Limite de la serie: " + "\n");
        int n = sc.nextInt();
        
        System.out.println("Serie hasta la posicion "+n);
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }
    }
}

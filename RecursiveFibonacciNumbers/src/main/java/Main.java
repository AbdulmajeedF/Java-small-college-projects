
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter n for a Fibonacci number: ");
        int n = sc.nextInt();
        
        System.out.println("fib(" + n + ") = "  + m.fib(n));

    }
    public long fib(long n){
        if (n == 0 ){
            return 0;
        }else if (n == 1){
            return 1;
        }else {
            return fib(n-1) + fib (n - 2);
        }
    }
    
}

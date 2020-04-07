
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of n: ");
        int input = sc.nextInt();
        System.out.println("------------------------------------");
        Main m = new Main();
        System.out.print("Factorial of " + input + " is " + m.factorial(input));

    }
    public int factorial (int n){
        
        if (n == 1){
            return n;
        }else{
            
            return n * factorial (n-1);   
        } 
    }  
}

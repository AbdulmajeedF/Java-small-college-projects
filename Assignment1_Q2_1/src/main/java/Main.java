import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        System.out.println("---------------------------");
        System.out.println("First " + in + " square numbers are:");        
        SquareNumbersGenerator(in);
    }
    public static int i = 1;
    private static int SquareNumbersGenerator(int n){
        if (i <= n){
            System.out.print( i * i + " ");
            i ++;
            SquareNumbersGenerator(n);        
        }
        return i;
    }
}

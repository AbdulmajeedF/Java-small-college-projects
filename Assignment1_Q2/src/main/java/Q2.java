import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner obj = new Scanner(System.in);
        int in = obj.nextInt();
        System.out.println("---------------------------");
        System.out.println("First " + in + " square numbers are:");
        
        calculation(in);
    }
    private static int calculation(int n){
        if (n == 1){
            System.out.print(n + " ");
        }else {
            calculation(n-1);
            int i = n * n;
            System.out.print(i + " "); 
        }
        return (n * (n + 1));
    }
}

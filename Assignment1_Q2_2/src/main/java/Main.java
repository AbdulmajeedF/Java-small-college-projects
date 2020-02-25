import java.util.Scanner;
public class Main {
    public static int square(int n){
        if (n == 1){
            System.out.print(1);
            System.out.print(" ");
            return 1;
        }else {
            square(n-1);
            System.out.print(n*n);
            System.out.print(" ");
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("--------------------------------");
        System.out.println("First "+x+" square numbers are: ");
        square(x);
    }    
}

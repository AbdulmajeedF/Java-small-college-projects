import java.util.Scanner;
public class Main 
    {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.println("---------------------");
        System.out.println("First "+ n+" square numbers are");
        NSquaredNumbs(n);
    }
    public static int NSquaredNumbs(int n)
    {
        if (n == 1)
        {
            System.out.print("1 ");
            return 1;
        }else
        {
            NSquaredNumbs(n- 1);
            System.out.print(n*n + " ");
        }
        return 1;
    }
    }

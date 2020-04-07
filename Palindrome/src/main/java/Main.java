
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = sc.nextLine();
        
        int low = 0;
        int high = text.length()-1;
        boolean isPalindrome = true;
        
        while (low < high){
            if (text.charAt(low) != text.charAt(high)){
                isPalindrome = false;
                break;
            }else{
                isPalindrome = true;
            }
            low++;
            high--;
        }
        if (isPalindrome){
            System.out.println(text + " is palindrome");
        }else{
            System.out.println(text + " is not palindrome");
        }

    }
    
}

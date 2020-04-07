import java.util.Scanner;
public class Main {
	public static void main (String [] args){
		
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		
		System.out.println("Enter a string: ");
		String in =  sc.nextLine();
		
		if (m.isPalindrome(in)){
			System.out.println(in + " is a plaindrome");
		}else{
			System.out.println(in + " is not a palindrome");
		}
	}
	public boolean isPalindrome(String s){
		
		if (s.length() <= 1){
			
			return true;
			
		}else if (s.charAt(0) != s.charAt(s.length()-1)){
			
			return false;
			
		}else{
			
			System.out.println ("substring " + s.substring(1, s.length()-1));
			return isPalindrome(s.substring(1, s.length()-1));
			
		}
	}
}
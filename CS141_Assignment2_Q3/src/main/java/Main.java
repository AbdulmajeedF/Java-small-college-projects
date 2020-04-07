import java.util.Scanner;
public class Main {
    public static int linearSearch(int index){
        int[] list = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};   
        for (int i = 0; i < list.length; i++){
            if (index == list[i])
                return i;
        }
        return -1;
    }   
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to look for in the array: ");
        int in = sc.nextInt();
        System.out.println(in + " is in the index number " + main.linearSearch(in));

    }
}

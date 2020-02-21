public class Main {
    public static void main(String[] args) {

        System.out.println(factorial(10));

    }
    public static int factorial(int n){
        if (n == 0){
            System.out.println("factorial (" + n + ") = 1");
            return 1;
        }else {
            System.out.println("Factorial (" +  n + ") = " + n + " * factorial (" + (n-1) + ")");
            return n * factorial(n - 1);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        countBackward(100);
    }
    public static void countBackward(int n){
        if (n < 0){
            System.out.println("Done!");
        }else{
            System.out.println(n);
            n -- ;
            countBackward(n);
        }
    }
    
}

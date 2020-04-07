public class Tester {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(300);
        BankAccount acc2 = new BankAccount(500);
        BankAccount acc3 = new BankAccount(800);
        BankAccount acc4 = new BankAccount(50);
        
        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
        System.out.println(acc3.getBalance());
        System.out.println(acc4.getBalance());
        
        DataSet stat = new DataSet();
        
        stat.add(acc1);
        stat.add(acc3);
        stat.add(acc2);
        
        System.out.println(stat.getMaximum());
    }
    
}
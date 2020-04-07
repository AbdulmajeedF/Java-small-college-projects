public class BankAccount {
    private double balance;
    
    public BankAccount (double amount){
        this.balance = this.balance + amount;
    }
    public double getBalance(){
        return this.balance;
    }
}

public class DataSet {
    private double sum;
    private BankAccount maximum;
    private int count;
    
    public void add(BankAccount x){
        this.sum = this.sum + x.getBalance();
        if (count == 0 || maximum.getBalance() < x.getBalance()){
            maximum = x;
        }
        count++;
    }
    
    // This method type should be BankAccount instead of double ... fix it later
    public double getMaximum(){
        return maximum.getBalance();
    }
}

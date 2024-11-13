package MultiThreading.O1_SyncronizationATMExample;

public class Customer extends Thread{
    private String name;
    private ATM atm;
    private int amount;
    public Customer(String name,ATM atm,int withdrawAmount){
        this.name = name;
        this.atm = atm;
        this.amount = withdrawAmount;
    }
    public void useATM(){
        atm.checkBalance(this.name);
        atm.withdraw(this.name,this.amount);
    }
    @Override
    public void run(){
        useATM();
    }
}

package ObjectOriented;

class ATM{
    public void checkBalance(String name){
        System.out.println(name+"Checking");
        try{
            Thread.sleep(1000);
        }catch(Exception e){
        }
        System.out.println("Balance");
    }

    public void withdraw(String name,int amount){
        System.out.println(name+" Withdrawing ");
        try{
            Thread.sleep(1000);
        }catch(Exception e){

        }
        System.out.println(amount);
    }
}

class Customer extends Thread{
    String name;
    ATM atm;
    int amount;

    public Customer(String name,ATM a,int withdrawAmt){
        this.name = name;
        this.atm = a;
        this.amount = withdrawAmt;
    }
    
    public void useATM(){
        atm.checkBalance(this.name);
        atm.withdraw(this.name, this.amount);
    }

    @Override
    public void run(){
        useATM();
    }
}


public class O016_Synchronization {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 = new Customer("Smith",atm,100);
        Customer c2 = new Customer("John",atm,200);
        c1.start();
        c2.start();

    }
}

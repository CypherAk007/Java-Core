package MultiThreading.O1_SyncronizationATMExample;

public class Client  {
    public static void main(String[] args) {
//        PS: when checking and withdraw only one customer should do it not
//        simultansouly


        ATM atm = new ATM();
        Customer c1  = new Customer("ak",atm,1000);
        Customer c2  = new Customer("bk",atm,2000);
        Customer c3  = new Customer("ck",atm,3000);
        Customer c4  = new Customer("dk",atm,4000);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }

}

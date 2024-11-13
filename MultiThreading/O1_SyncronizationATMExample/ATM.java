package MultiThreading.O1_SyncronizationATMExample;

public class ATM {
    synchronized public void checkBalance(String name){
        System.out.println("Checking Balance for "+name);
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(name+" Balance xxxx");

    }


    synchronized public void withdraw(String name,int amount){
        System.out.println("Withdrawing for "+name);
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(name+" amount xxxx");

    }
}

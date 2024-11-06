package Exceptions.O2_CustomException;

public class ClientForCustomException {
    public static void main(String[] args) {

        try{

        Pair p1 = new Pair("A","B");
        System.out.println(p1);
//
        Pair p2 = new Pair(null,null);
        System.out.println(p2);

        Pair p3 = new Pair(1,2);
        System.out.println(p3);
        }catch (NullValuesNotAllowedException e){
//            System.out.println("Null value not allowed!!. Alerting it");
//            op-> Null value not allowed!!. Alerting it

            System.out.println(e.getMessage());
            System.out.println("Alerting it");
//              op->
//              -> e.getMessage()
//              Null value not allowed!!. -> is from custom class-> super("Null value not allowed!!.");
//              Alerting it

        }catch (ClassCastException e){
            System.out.println(e.getMessage());
        }
//        Combining exceptions
//        catch (NullValuesNotAllowedException | ClassCastException exception){
//            System.out.println(exception.getMessage());
//        }

        System.out.println("End of program!!");

    }
}

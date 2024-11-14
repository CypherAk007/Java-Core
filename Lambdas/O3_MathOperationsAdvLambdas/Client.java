package Lambdas.O3_MathOperationsAdvLambdas;

public class Client {
    public static void main(String[] args) {
//        Passing Method as Reference
//        M1 -> Using the return lambda from a function as a reference
        System.out.println(execute(3,4,Operations.add()));
//        THIS IS SAME AS THIS
        System.out.println(execute(3,4,(a,b)->a+b));

        System.out.println(execute(3,4,Operations.sub()));
        System.out.println(execute(3,4,Operations.mul()));
        System.out.println(execute(3,4,Operations.divide()));

        System.out.println("--------------------------------------");
//        M2->
//        execute(3,4,(a,b)->a+b);
//        now the a+b is returned from OperationsFunctions add method
        System.out.println(execute(3,4,(a,b)->OperationsFunctions.add(a,b)));

        System.out.println(execute(3,4,(a,b)->OperationsFunctions.sub(a,b)));
        System.out.println(execute(3,4,(a,b)->OperationsFunctions.mul(a,b)));
        System.out.println(execute(3,4,(a,b)->OperationsFunctions.divide(a,b)));

        System.out.println("--------------------------------------");
//        M3->
        System.out.println(execute(3,4,(a,b)->a+b));

//        the above was converted to this
        System.out.println(execute(3,4,Operations.add()));
//        where Operations.add() returns  (a,b)->a+b; // Anynomus class of MathOperations

//        next we converted the above to
        System.out.println(execute(3,4,(a,b)->OperationsFunctions.add(a,b)));
//        where  now the a+b is returned from OperationsFunctions add method
//        now the a+b is returned from OperationsFunctions add method
        System.out.println("--------------------------------------");
//        Now SINCE WE HAVE OperationsFunctions definded normally -> returns a+b i.e integer after addition
//        and not returning the lambda function i.e (a,b)->a+b
//        we any ways want (a,b)-> a+b in the execute(3rd parameter )
//        so insted of creating/passing lambda we can directily pass the method refrence of OperationsFunctions
        System.out.println(execute(3,4,OperationsFunctions::add));
//        though add() of OperationsFunctions has no link to MathOperations that is expected in the
//        execute(3rd parameter )
//        we are passing the refrence of add function of OperationsFunctions which points to
//        public static int add (int a,int b){
//            return a+b;
//        }
//        this function of OperationsFunctions which inturn satisify the need of (a,b)->a+b;
        System.out.println(execute(3,4,OperationsFunctions::sub));
        System.out.println(execute(3,4,OperationsFunctions::mul));
        System.out.println(execute(3,4,OperationsFunctions::divide));
    }

    public static int execute(int a,int b,MathOperations mathOperations){
        return mathOperations.operate(a,b);
    }

//    M2 ->
    public static int execute2(int a,int b,MathOperations mathOperations){
        return mathOperations.operate(a,b);
    }
}

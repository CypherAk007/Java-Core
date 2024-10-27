package Lambdas.O3_MathOperationsAdvLambdas;

public class Operations {

//    THESE METHODS OF Operations Class RETURNS LAMBDAS

    public static MathOperations add(){
//        MathOperations mathOperations = new MathOperations() {
//            @Override
//            public int operate(int a, int b) {
//                return a+b;
//            }
//        };
//        return mathOperations;

//        MathOperations mathOperations = ( a, b)->a+b;
//        return mathOperations;

        return (a,b)->a+b;
    }

    public static MathOperations sub(){
        return (a,b)->a-b;
    }

    public static MathOperations mul(){
        return (a,b)->a*b;
    }

    public static MathOperations divide(){
        return (a,b)->a/b;
    }

}

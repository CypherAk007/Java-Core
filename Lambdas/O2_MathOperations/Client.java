package Lambdas.O2_MathOperations;

public class Client {
    public static void main(String[] args) {
//        M1-> make SAM and functional interface and make add operation class and add numbers
        MathOperations mathOperations = new AddOperation();
        int a = 2,b= 3;
        System.out.println(mathOperations.operate(a,b));

//        M2-> Skip AddOperation class make  it in the main class using anynomus class
        MathOperations mathOperations1 = new MathOperations() {
            @Override
            public int operate(int a, int b) {
                return a+b;
            }
        };
        System.out.println(mathOperations1.operate(a,b));

//        M3-> use Lambdas to eliminate the code
        MathOperations mathOperations2 = (int x,int y) -> (x+y);
        System.out.println(mathOperations2.operate(1,2));

        System.out.println("----------------------------");
//        M4-> use Lambdas to eliminate the code | Eliminate datatypes |Multi line statement
        MathOperations addOperation3 = ( x, y) -> (x+y);
        MathOperations subtractOperation3 = ( x, y) -> (x-y);
        MathOperations mulOperation3 = ( x, y) -> {
            return x*y;
        };
        MathOperations divideOperation3 = ( x, y) -> {
            if(y==0){
                return 0;
            }
            return x/y;
        };

        System.out.println(addOperation3.operate(9,2));
        System.out.println(subtractOperation3.operate(3,2));
        System.out.println(mulOperation3.operate(4,2));
        System.out.println(divideOperation3.operate(1,0));

        System.out.println("----------------------------");
//        M5-> PASS ANYNOMUS FUNCTION TO A FUNCTION.

        System.out.println(execute(1, 20, new MathOperations() {
            @Override
            public int operate(int a, int b) {
                return a+b;
            }
        }));
        System.out.println("----------------------------");
//        M5-> PASS ANYNOMUS FUNCTION TO A FUNCTION. + Lambdas
        System.out.println(execute(20,30,(x,y)->x+y));
        System.out.println(execute(20,30,(x,y)->x-y));
        System.out.println(execute(20,30,(x,y)->x*y));
        System.out.println(execute(20,30,(x,y)->x/y));

        System.out.println("----------------------------");
//        M6-> PASS ANYNOMUS FUNCTION TO A FUNCTION. + Lambdas-> leverage AddOperations Class
        System.out.println(execute(33,44,new AddOperation()));


        System.out.println("----------------------------");
//        M7-> PASS ANYNOMUS FUNCTION TO A FUNCTION. + Lambdas-> leverage AddOperations Class
//        Instead of passing the lambda as function to the function USE A FUNCTION AS A REFERENCE
//                TO RETURN LAMBDA FROM A FUNCTION
        System.out.println(execute(33,44,add()));
    }



    //        M5-> PASS ANYNOMUS FUNCTION TO A FUNCTION.
    private static int execute(int a,int b,MathOperations mathOperations){
        return mathOperations.operate(a,b);
    }

//    M7-> return lambda from a function as a reference
    private static MathOperations add(){
//        MathOperations mathOperations = new MathOperations() {
//            @Override
//            public int operate(int a, int b) {
//                return a+b;
//            }
//        };
//        return mathOperations;
//CONVERT ABOVE TO BELOW USING LAMBDAS

//        MathOperations mathOperations = (a,b)->a+b;
//        return mathOperations;

//SHORTERN IT MORE-> DIRECTLY RETURN THE MathOperation
        return (a,b)->a+b;
    }
}

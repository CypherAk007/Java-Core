package Lambdas.O4_NameConverterOnCommand;

import java.util.function.Function;

public class ClientInBuiltFuncInterface {
    public static void main(String[] args) {
        String name = "Abhishek Krishna";
        String type = "lower";
        switch (type){
            case "upper":
                print(name,s-> s.toUpperCase());
                break;
            case "lower":
//                print(name,s-> s.toLowerCase());
                print(name,String::toLowerCase);
                break;
            case "normal":
                print(name,s -> s);
                break;
        }
    }

//    private static void print(String s,StringConverter stringConverter){
//        System.out.println(stringConverter.convert(s));
//    }

//    USING INBUILT FunctionalInterface
private static void print(String s, Function<String,String> function){
    System.out.println(function.apply(s));
}
}

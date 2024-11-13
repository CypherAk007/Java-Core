package Generics.O1_GenericsMethods;

import Generics.O1_GenericsArray.GenericArray;

public class GenericDemo {
    static void fun(GenericArray obj){ //~ static void fun(GenericArray<?> obj) <?> wild card
        obj.display();
    }

//    if we want to bound the args then <? extends number> number and classes that extend number.
//    for Lower Bound fun(GenericArray<? super number> obj)
//    static void fun1(GenericArray<T> obj){ // Not valid as we cant use <T> this in parm
//        obj.display();
//    }


    public static void main(String[] args) {
        GenericArray<String> ma1 = new GenericArray<>();
        ma1.append("Hi");
        ma1.append("Bye");

        GenericArray<Integer> ma2 = new GenericArray<>();
        ma2.append(10);
        ma2.append(20);

        fun(ma1);
        fun(ma2);
    }
}

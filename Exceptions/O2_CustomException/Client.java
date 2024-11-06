package Exceptions.O2_CustomException;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Pair> list = new ArrayList<>();
        try{

        list.add(new Pair("ak","one"));
        list.add(new Pair("bk","two"));
        list.add(new Pair("ck","three"));
//        list.add(new Pair(null,null));
        list.add(new Pair(1,2));
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
//            This became too generic as for int to string and also for null it gives same exception
//            so generate custom exception
            System.out.println("null values are not allowed");
        }

        System.out.println(list);
    }
}

package Generics.O1_CountNumberOdd;

import java.util.Collection;

public class Algorithm {
    public static <T> int countIf(Collection<T> c,UnaryPridicate<T> p){
        int count = 0;
        for(T ele:c){
            if (p.test(ele)){
                count++;
            }

        }
        return count;
    }
}

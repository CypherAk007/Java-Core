package Generics.O1_CountNumberOdd;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class OddPridicate implements UnaryPridicate<Long>{
    public boolean test(Long i){
        return i%2!=0;
    }


}
public class Test {
    public static void main(String[] args) {
        List<Long> ci = Arrays.asList(1l,2l,3l,4l);
        int count = Algorithm.countIf(ci,new OddPridicate());
        System.out.println("Number of Odd Elements: " + count);
    }
}

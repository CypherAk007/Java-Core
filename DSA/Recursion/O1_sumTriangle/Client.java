package DSA.Recursion.O1_sumTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        List<List<Integer>> triangle = helper(arr);
        System.out.println(triangle);
    }

    public static List<List<Integer>> helper(int[] arr){
//        bc
        if(arr.length==1){
            List<List<Integer>>out = new ArrayList<>();
            out.add(new ArrayList<>(Arrays.asList(arr[0])));
            return out;
        }

        int[] passer = new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            passer[i] = arr[i]+arr[i+1];
        }
        List<List<Integer>> out = helper(passer);
//        List<Integer> converter = Arrays.stream(arr)
//                .boxed()
//                .collect(Collectors.toCollection(new Supplier<List<Integer>>() {
//                    @Override
//                    public List<Integer> get() {
//                        return new ArrayList<>();
//                    }
//                }));

        List<Integer> converter = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toCollection(()->new ArrayList<>()));

//        List<Integer> converter = Arrays.stream(arr)
//                .boxed()
//                .collect(Collectors.toCollection(ArrayList::new));
        out.add(converter);
        return out;


    }
}


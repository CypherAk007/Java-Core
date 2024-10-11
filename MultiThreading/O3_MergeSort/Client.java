package MultiThreading.O3_MergeSort;

import java.util.List;

public class Client {
    public static void main(String[] args) throws Exception{
        List<Integer> arr = List.of(6,4,3,8,2,1,10);
        MergeSorter mergeSorter = new MergeSorter(arr);
        List<Integer> sortedData = mergeSorter.call();
        System.out.println("Sorted array : "+sortedData);
    }
}

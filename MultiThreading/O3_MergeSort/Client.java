package MultiThreading.O3_MergeSort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception{
        List<Integer> arr = List.of(6,4,3,8,2,1,10);
        MergeSorter mergeSorter = new MergeSorter(arr);
//        List<Integer> sortedData = mergeSorter.call();
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<List<Integer>>  sortedDataFuture = executorService.submit(mergeSorter);

        List<Integer> sortedData = sortedDataFuture.get(); // Blocking call waits of response

        System.out.println("Sorted array : "+sortedData);

        executorService.shutdown();
    }
}

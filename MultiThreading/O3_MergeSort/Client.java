package MultiThreading.O3_MergeSort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception{
        List<Integer> arr = List.of(6,4,3,8,2,1,10);
        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(arr,executorService);

//        this is like mergeSorter.run() if we had implemented runnable we are not creating new
//                thread to run this
//        List<Integer> sortedData = mergeSorter.call();

//        Using executor to create thread
//        Future moves to next execution and once data arrives at sortedDataFuture it will
//        be avail for others to use it
        Future<List<Integer>>  sortedDataFuture = executorService.submit(mergeSorter);

//        if we want the statment execution to stop till we get the value into sortedDataFuture
        List<Integer> sortedData = sortedDataFuture.get(); // Blocking call waits of response

        System.out.println("Sorted array : "+sortedData);

        executorService.shutdown();
    }
}

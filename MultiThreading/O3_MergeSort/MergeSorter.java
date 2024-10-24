package MultiThreading.O3_MergeSort;

import javax.xml.stream.XMLEventFactory;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>>{

    private List<Integer> arr;
    private ExecutorService executorService;
    public MergeSorter(List<Integer> arr,ExecutorService executorService){
        this.arr = arr;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception{

        if(arr.size()<=1){
            return arr;
        }
        int mid = arr.size()/2;
        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftArray.add(arr.get(i));
        }

        for(int i=mid;i<arr.size();i++){
            rightArray.add(arr.get(i));
        }

        MergeSorter leftMergeSorter = new MergeSorter(leftArray,executorService);
        MergeSorter rightMergeSorter = new MergeSorter(rightArray,executorService);

//        List<Integer> leftSortedArray = leftMergeSorter.call();
//        List<Integer> rightSortedArray = rightMergeSorter.call();

//        Insted of directly call in the left and right mergesort, call via threads
//        we are exe the left half and right half on different threads
        Future<List<Integer>> leftSortedArrayFuture = executorService.submit(leftMergeSorter);
        Future<List<Integer>> rightSortedArrayFuture = executorService.submit(rightMergeSorter);

//        Wait for the data to arrive at future later merge it
        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();

        return merge(leftSortedArray,rightSortedArray);

    }

    public List<Integer> merge(List<Integer> leftSortedArray,List<Integer> rightSortedArray){
        int i=0,j=0;
        List<Integer> mergedArray = new ArrayList<>();
        while(i<leftSortedArray.size() && j<rightSortedArray.size()){
            if(leftSortedArray.get(i)<=rightSortedArray.get(j)){
                mergedArray.add(leftSortedArray.get(i));
                i++;
            }else {
                mergedArray.add(rightSortedArray.get(j));
                j++;
            }
        }
        while (i<leftSortedArray.size()){
            mergedArray.add(leftSortedArray.get(i));
            i++;
        }
        while (j<rightSortedArray.size()){
            mergedArray.add(rightSortedArray.get(j));
            j++;
        }
        return mergedArray;
    }

}

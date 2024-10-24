package MultiThreading.O4_BinaryTreeSizeCalc;

import MultiThreading.O3_MergeSort.MergeSorter;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception{

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(50);

        ExecutorService executorService = Executors.newCachedThreadPool();
        TreeSizeCalculator treeSizeCalculator = new TreeSizeCalculator(root,executorService);
        Future<Integer> treeSizeFuture= executorService.submit(treeSizeCalculator);
        Integer size = treeSizeFuture.get();
        System.out.println("Size of the Binary Tree is "+size);


        executorService.shutdown();
    }
}

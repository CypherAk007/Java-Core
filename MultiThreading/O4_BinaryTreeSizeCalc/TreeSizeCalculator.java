package MultiThreading.O4_BinaryTreeSizeCalc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    private Node root;
    private ExecutorService executorService;
    public TreeSizeCalculator(Node root,ExecutorService executorService){
        this.root = root;
        this.executorService = executorService;
    }

    @Override
    public Integer call() throws Exception{
        if (root==null){
            return 0;
        }

        TreeSizeCalculator leftTreeSizeCalculator = new TreeSizeCalculator(root.left,executorService);
        TreeSizeCalculator rightTreeSizeCalculator = new TreeSizeCalculator(root.right,executorService);

        Future<Integer> leftTreeFuture= executorService.submit(leftTreeSizeCalculator);
        Future<Integer> rightTreeFuture= executorService.submit(rightTreeSizeCalculator);

        Integer left = leftTreeFuture.get();
        Integer right = rightTreeFuture.get();

        return 1+left+right;

    }
}
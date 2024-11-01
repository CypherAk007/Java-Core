package DSA.Stacks.NearestGLGRSLSR;

import java.util.ArrayList;
import java.util.List;

public class StackMain {
    public static void main(String[] args) {
        List<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(0);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(4);
        NearestGLGRSLSR nearest = new NearestGLGRSLSR();
        System.out.println(arr);
        System.out.println(nearest.NGR(arr));
        System.out.println(nearest.NGL(arr));
        System.out.println(nearest.NSL(arr));
        System.out.println(nearest.NSR(arr));
    }
}

package Collections;

import java.util.Arrays;

public class O28_ArraysClass {
    public static void main(String[] args) {
        int numbers[] = { 6, 5, 4, 3, 2, 1 };
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println(index);


        Arrays.sort(numbers);
        
        
        Arrays.fill(numbers, 12);
        
        
         for(int i:numbers){
            System.out.print(i+" ");

        }
        System.out.println();
    }

}

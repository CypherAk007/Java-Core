package Basics;

public class O06_Arrays {
    public static void main(String[] args) {
        int arr[] = {3,9,7,12,6,15,5,4,10};
        // find summ
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
        int target = 15,tarIdx = -1;

        for (int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                tarIdx = i ;
            }

        }
        System.out.println(target);
        System.out.println(tarIdx);

        int maxi = -1,maxi2 = -1;
        for (int i = 0; i<arr.length;i++){
            if(arr[i]>maxi){
                maxi2 = maxi; 
                maxi = arr[i];
            }
            else if(arr[i]>maxi2){
                maxi2 = arr[i];
            }
        }
        System.out.println(maxi);
        System.out.println(maxi2);

        // ROTATION OF ARRAY 
        int temp =arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] =arr[i]; 
        }
        arr[arr.length-1] = temp;
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int arr2[] = new int[10];
        arr2[0]  = 1;
    }
}

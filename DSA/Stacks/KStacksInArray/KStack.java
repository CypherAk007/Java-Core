package DSA.Stacks.KStacksInArray;

public class KStack {
    private int[] arr;
    private int[] top;
    private int[] next;
    int n,s;
    int freespot;
    public KStack(int n,int s){
        this.n = n;
        this.s = s;
        arr = new int[s];
        top= new int[n];
        next = new int[s];

//        init top
        for(int i=0;i<n;i++){
            top[i] = -1;
        }

//        init next
        for(int i=0;i<n;i++){
            next[i] = i+1;
        }
//        update last index value to -1
        next[n-1] = -1;

//        init freespot
        freespot = 0;
    }

    public boolean push(int x,int k){
//        overflow
        if(freespot==-1){
            System.out.println("Stack Overflow!!");
            return false;
        }
//        find index
        int index = freespot;
//        update freespot
        freespot = next[index];
//        push to stack
        arr[index] = x;
//        update next to point to stack previous top
        next[index] = top[k-1]; //0 based idx so k-1
//        update top to point to new top
        top[k-1] = index;

        return true;
    }

    public int pop(int k){
        if(top[k-1]==-1){
            System.out.println("Stack underflow!!");
            return -1;
        }
        int index = top[k-1];
        top[k-1] = next[index];
        next[index] = freespot;
        freespot = index;
        return arr[index];
    }

    public void peek(int k){
        if(top[k-1]==-1){
            System.out.println("Stack underflow!!");
//            return -1;
        }
        System.out.println(arr[top[k-1]]);


    }


}

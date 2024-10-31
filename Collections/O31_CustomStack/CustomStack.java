package Collections.O31_CustomStack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;


    public CustomStack(){
//        calls CustomStack(int size)
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack!!");
        }
        return data[ptr--];
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }
    public boolean push(int item){
        if(isFull()){
            return ptr==data.length -1;
        }
        ptr++;
        data[ptr]= item;
        return true;
    }

    public boolean isFull(){
        return ptr==data.length-1;

    }

    public boolean isEmpty(){
        return ptr==-1;
    }
}

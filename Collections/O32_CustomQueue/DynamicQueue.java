package Collections.O32_CustomQueue;

public class DynamicQueue extends CustomQueue{
    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item){
        if(this.isFull()){
            int[] temp = new int[data.length*2];
//            create a new array of double size and put elements from index 0 of new array
//                elements from old array dont start from 0 they start from front
            for (int i=0;i<data.length;i++){
                temp[i] = data[(front+i)%data.length];

            }
            front = 0;
            rear = data.length;
            data = temp;
        }
        return super.insert(item);
    }
}

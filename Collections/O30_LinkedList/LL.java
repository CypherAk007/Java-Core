package Collections.O30_LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = this.head;
        this.head = node;
        if(this.tail==null){
            this.tail = this.head;
        }
        this.size +=1;
    }
    public void display(){
        Node temp = this.head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Head: "+this.head.value);
        System.out.println("Tail:"+this.tail.value);
    }
    public void insertRec(int value,int index){
        head = insertRec(value,index,head);


    }
    private Node insertRec(int value,int index,Node node){
//        bc
        if(index==0){
            Node temp = new Node(value,node);
            this.size++;
            return temp;

        }
        System.out.println(node.value);
        node.next = insertRec(value,index-1,node.next);
        return node;
    }
    private class Node{
        private  int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
}

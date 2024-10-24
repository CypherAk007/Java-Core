package MultiThreading.O4_BinaryTreeSizeCalc;

public class Node{
    public Node left;
    public Node right;
    public int data;
    public Node(int data){
        this.data = data;
    }
    public Node(int data,Node left,Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
package DSA.Trees.O1_AvlTrees;

public class Client {
    public static void main(String[] args) {
        AVL avl = new AVL();
        for(int i=0;i<5;i++){
            avl.insert(i);
        }
        avl.display();
        System.out.println(avl.inorder());
        System.out.println(avl.inorderHeights());

        for(int i=5;i<7;i++){
            avl.insert(i);
        }
        avl.display();
        System.out.println(avl.inorder());
        System.out.println(avl.inorderHeights());

        avl.delete(5);
        avl.display();
        System.out.println(avl.inorder());
        System.out.println(avl.inorderHeights());


    }
}

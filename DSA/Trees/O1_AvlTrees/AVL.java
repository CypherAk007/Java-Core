package DSA.Trees.O1_AvlTrees;

import java.util.ArrayList;
import java.util.List;

public class AVL {
    public TreeNode root;
    public AVL(){
        root = null;
    }
    public int height(TreeNode node){
        if(node==null) return -1;
        return node.height;
    }

    public void display(){
        displayInternal(root,"Root Node: ");
    }

    public void displayInternal(TreeNode node,String details){
        if(node==null) return;
        System.out.println(details+node.val);
        displayInternal(node.left,"LeftChild of "+node.val+" is: ");
        displayInternal(node.right,"RightChild of "+node.val+" is: ");
    }

    public void delete(int value){
        this.root = deleteInternal(this.root,value);
    }

    public TreeNode deleteInternal(TreeNode root,int value){
        if(root==null) return null;
        if(value<root.val){
            root.left = deleteInternal(root.left,value);
        }
        else if(value>root.val){
            root.right = deleteInternal(root.right,value);
        }else{
            if(root.left==null && root.right==null){
                return null;
            }else if(root.left==null || root.right==null){
                if(root.left==null){
                    return root.right;
                }else{
                    return root.left;
                }
            }else{
                TreeNode temp  = root.left;
                while(temp.right!=null){
                    temp = temp.right;
                }
                root.val = temp.val;
                root.left = deleteInternal(root.left,temp.val);
            }
        }
        return root;
    }

    public void insert(int value){
        this.root = insertInternal(this.root,value);
    }

    public TreeNode insertInternal(TreeNode node,int value){
        if(node==null){
            return new TreeNode(value);
        }
        if(node.val<value){
            node.right = insertInternal(node.right,value);
        }
        if(node.val>=value){
            node.left = insertInternal(node.left,value);
        }
//        update the height as new node is inserted for all affected node fm bottom to top
        node.height = Math.max(height(node.left),height(node.right))+1;


//        Balances the tree and returns the node
        return rotate(node);
    }

    public TreeNode rotate(TreeNode node){
        if(height(node.left)-height(node.right)>1){
//            Left heavy
            if(height(node.left.left)-height(node.left.right)>0){
//                l-l rotation
                return rightRotate(node);
            }

            if(height(node.left.left)-height(node.left.right)<0){
//                l-r rotation

                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }else if(height(node.left)-height(node.right)<-1){
//            Right heavy

            if(height(node.right.left)-height(node.right.right)<0){
//                r-r rotation

                return leftRotate(node);
            }
            if(height(node.right.left)-height(node.right.right)>0){
//                r-l rotation
                node.right =  rightRotate(node.right);
                return leftRotate(node);
            }

        }
        return node;

    }

    public TreeNode leftRotate(TreeNode child){
        TreeNode parent = child.right;
        TreeNode remaingTree = parent.left;
        parent.left = child;
        child.right = remaingTree;

//        update the heights
//        update the heights in order:1st child height as it is lower than parent after transformation
        child.height =   Math.max(height(child.left),height(child.right))+1;
        parent.height = Math.max(height(parent.left),height(parent.right))+1;
        return parent;
    }

    public TreeNode rightRotate(TreeNode parent){
        TreeNode child = parent.left;
        TreeNode remaingTree = child.right;
        child.right = parent;
        parent.left = remaingTree;

//        update the heights in order:1st parent height as it is lower than child after transformation
        parent.height = Math.max(height(parent.left),height(parent.right))+1;
        child.height =   Math.max(height(child.left),height(child.right))+1;
        return child;
    }

    public List<Integer> inorder(){
        return inorderInternal(root);
    }

    public List<Integer> inorderInternal(TreeNode node){
        if(node==null){
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        list.addAll(inorderInternal(node.left));
        list.add(node.val);
        list.addAll(inorderInternal(node.right));
        return list;
    }


    public List<List<Integer>>  inorderHeights(){
        return inorderHeightsInternal(root);
    }

    public List<List<Integer>> inorderHeightsInternal(TreeNode node){
        if(node==null){
            return new ArrayList<>();
        }
        List<List<Integer>>  list = new ArrayList<>();
        list.addAll(inorderHeightsInternal(node.left));
        list.add(new ArrayList<>(List.of(node.val,node.height)));
        list.addAll(inorderHeightsInternal(node.right));
        return list;
    }


}

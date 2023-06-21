//https://www.geeksforgeeks.org/binary-tree-set-1-introduction/?ref=lbp
// a binary search tree can consist atmost two nodes for each parent node.  
//The maximum number of nodes at level ‘l’ of a binary tree is 2^l. 
//The Maximum number of nodes in a binary tree of height ‘h’ is 2^h – 1.
//In a Binary Tree with N nodes, minimum possible height or the minimum number of levels is? Log2(N+1) ?    
//types: full(each node will have 0 or two child nodes), complete(A tree where every level fully filled (have 2 children) 
//except maybe the last level.), perfect(full+complete should have two nodes) 
class binarytrees{
    Node root,leftNode,rightNode,temp;
    public void insertdata(int val){
        if(root==null){
            root=new Node(val);
        }
        else{
            if(root.left==null){
                root.left=new Node(val);
            }
            else if(root.left!=null && root.right==null){               //iterative recusion needs to be done for inserting nodes
                root.right=new Node(val);                          
            }
        }
    }
    class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value=value;
        } 
    }   
}
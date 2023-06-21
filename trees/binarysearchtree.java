//Traversal of two types: DFS(Inorder, preorder, postorder) & BFS(level order)
//Inorder: left subtree => root => right subtree 
//Preorder: root => LS => RS  
//Postorder: LS => RS => root
public class binarysearchtree{
    Node root = null;
    public void createbst(int val){
        if(root==null){
            root=new Node(val);
        }
        else{
            Node curr=root; 
            while(true){
                Node parent=curr;
                if(val < curr.value){
                    curr = curr.left;
                    if(curr == null){
                        parent.left=new Node(val);
                        return;
                    } 
                }
                else{
                    curr=curr.right;
                    if(curr==null){
                        parent.right=new Node(val);
                        return;
                    }    
                }
            }    
        } 
    }     
    public void traversal(){
        inordertraversal(root);
        System.out.println();
        preordertraversal(root);
        System.out.println();
        postordertraversal(root);
    }
    public void inordertraversal(Node root){
        if(root==null){
            return ;
        }
        inordertraversal(root.left);
        System.out.print(root.value+" => ");
        inordertraversal(root.right);
    }
    public void preordertraversal(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.value+" => ");
        preordertraversal(root.left);
        preordertraversal(root.right);
    }
    public void postordertraversal(Node root){
        if(root==null){
            return ;
        }
        postordertraversal(root.left);
        postordertraversal(root.right);
        System.out.print(root.value+" => ");
    }
    public class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value=value;
            this.left=null;
            this.right=null;
        }
    }     
}

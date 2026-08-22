/*
Available tree - 1
                                                           
          8
        /   \
       3     10
      / \      \
     1   6      14
        / \     /
       4   7   13

       
*/
import java.util.*;
class node{
    int data;
    node left;
    node right;
    public node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class trees {
    //NO OF NODES IN TREE
    public static int countAllnodes(node root) {

        if (root == null) {return 0;}

        return 1 + countAllnodes(root.left) + countAllnodes(root.right);
    }

    //NO OF LEAF IN TREE
    public static int countleaf(node root){
        
        if(root==null){return 0;}
        
        if(root.left==null && root.right==null){return 1;}

        return countleaf(root.left)+countleaf(root.right);
    }

    //NO OF NODES WITHOUT LEAF
    public static int countnonleaf(node root){
        
        if(root==null){return 0;}

        if(root.left==null && root.right==null){return 0;}

        return 1+countnonleaf(root.left)+countnonleaf(root.right);
    }

    //IF AN NUMBER EXITS OR NOT
    public static boolean ifnodeexits(node root, int key){

        if(root==null){return false;}

        if(root.data==key){return true;}
        
        boolean res1 = ifnodeexits(root.left,key);
        
        if(res1){return true;}
        
        boolean res2=ifnodeexits(root.right, key);
        
        return res2;
    }

    //FREQUENCY OF AN PARTICULAR ELEMENT
    public static int count(node root, int key){

        if(root==null){return 0;}

        int c = (root.data==key) ? 1 : 0;
        
        return c+count(root.left,key)+count(root.right,key);
    }

    //IF TWO TREES ARE THE SAME OR NOT
    public static boolean isSameTree(node p, node q) {
        
        if(p==null && q==null){return true;}

        if(p==null || q==null){return false;}

        if(p.data==q.data){return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);}
        return false;
    }

    //CHECK IF TWO TREES ARE MIRROR
    public static boolean areMirror(node a, node b) {

        if(a==null && b==null) return true;

        if(a==null || b==null || a.data!=b.data) return false;

        return areMirror(a.left,b.right) && areMirror(a.right,b.left);
    }

    //CHECK IF TWO TREES ARE ISOMORPHIC
    public static boolean isIsomorphic(node root1, node root2) {

        if(root1==null && root2==null){return true;}
    
        if(root1==null || root2==null || root1.data != root2.data){return false;}
        
        return (isIsomorphic(root1.left,root2.right) && isIsomorphic(root1.right,root2.left) || isIsomorphic(root1.left,root2.left) && isIsomorphic(root1.right,root2.right));
    }

    //TRANSFORM OF SUM TREE
    public static int solve(node root){

        if(root==null){return 0;}
        
        int oldvalue=root.data;
        int ls = solve(root.left);
        int rs = solve(root.right);
        root.data = ls+rs;
        return oldvalue+root.data;
    }
    public void toSumTree(node root) {
        solve(root);
    }

    public static void main(String[] args) {
        //TREE 1
        node root = new node(8);
        root.left = new node(3);
        root.left.left = new node(1);
        root.left.right = new node(6);
        root.left.right.left = new node(4);
        root.left.right.right = new node(7);

        root.right = new node(10);
        root.right.right = new node(14);
        root.right.right.left = new node(13);

        //TREE 2
        node root2 = new node(8);
        root2.left = new node(3);
        root2.left.left = new node(1);
        root2.left.right = new node(6);
        root2.left.right.left = new node(4);
        root2.left.right.right = new node(7);

        root2.right = new node(10);
        root2.right.right = new node(14);
        root2.right.right.left = new node(13);

        System.out.println("Number of node: " + countAllnodes(root));
        System.out.println("Number of levels: " + countleaf(root));
        System.out.println("Number of non-leaf nodes: " + countnonleaf(root));

        if(isSameTree(root, root2)){System.out.println("Identical");}
        else{System.out.println("Not Identical");}

        if(areMirror(root, root2)){System.out.println("MIRRORS");}
        else{ System.out.println("NOT MIRROR");}
        
        if(isIsomorphic(root, root2)){System.out.println("ISOMORPHIC TREES");}
        else{System.out.println("NOT ISOMORPHIC");}

        Scanner c = new Scanner(System.in);
        System.out.println("Enter a value to search:");
        int n = c.nextInt();
        
        if(ifnodeexits(root, n)){System.out.println("Exists!");}
        else{System.out.println("Not Exists!");       
        }
    }
}

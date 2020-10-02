import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

    static HashMap<Integer, Integer> treeValues = new HashMap<Integer, Integer>();
    // static Stack<Integer> stack = new Stack<Integer>();
// static ArrayList<Integer> list = new ArrayList<Integer>();
    static int maxHeight = 0;
    static void levelOrder(Node root){
        //Write your code here
        travler(root, 1);
        for(int i = 0; i <= maxHeight; i++){
            for(int key : treeValues.keySet()){
                if(treeValues.get(key) == i){
                    System.out.print(key + " ");
                }
            }
        }
    }

    public static void travler(Node trav, int height){
        if(trav.right != null){
            travler(trav.right, height + 1);
        }
        if(trav.left != null){
            travler(trav.left, height+1);
        }
        if(height + 1 > maxHeight){
            maxHeight = height;
        }
        treeValues.put(trav.data, height);
        return;
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
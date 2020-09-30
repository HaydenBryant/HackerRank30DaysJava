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
    static void levelOrder(Node root){
        //Write your code here
        travler(root, 1);

        // Set<Integer> arr = treeValues.keySet();
        // System.out.println(arr);
        for(Integer num : treeValues.keySet()){
            System.out.println(num);
        }

    }

    public static void travler(Node trav, int height){
        if(trav.right != null){
            travler(trav.right, height + 1);
        }
        if(trav.left != null){
            travler(trav.left, height+1);
        }
        treeValues.put(height + 1, trav.data);
        return;
    }

    public static Node insert(Node root,int data){
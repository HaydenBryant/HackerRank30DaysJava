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

    static int maxHeight = 0;
    public static int getHeight(Node root){
        //Write your code here

        travler(root, 1);

        //   while(true){
        //       if(travR.right != null){
        //           heightR++;
        //           travR = travR.right;
        //           continue;
        //       } else if(travL.left != null){
        //           heightL++;
        //           travL = travL.left;
        //       } else {
        //           if(heightR > maxHeight){
        //               maxHeight = heightR;
        //                 heightR = 0;
        //           }
        //           if(heightL > maxHeight){
        //               maxHeight = heightL;
        //               heightL = 0;
        //           }
        //           break;
        //       }
        //   }
        return maxHeight;
    }

    public static int travler(Node trav, int height){
        if(trav.right != null){
            travler(trav.right, height++);
        }
        if(trav.left != null){
            travler(trav.left, height++);
        }
        if(height > maxHeight){
            maxHeight = height;
        }
        return height;
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
        int height=getHeight(root);
        System.out.println(height);
    }
}
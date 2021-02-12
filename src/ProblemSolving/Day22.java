package ProblemSolving;

public class Day22 {
    static int maxHeight = 0;
    public static int getHeight(Node root){
        //Write your code here

        travler(root, 1);
        return maxHeight;
    }

    public static int travler(Node trav, int height){
        if(trav.right != null){
            travler(trav.right, height++);
        }
        if(trav.left != null){
            travler(trav.left, height++);
        }
        if(height + 1 > maxHeight){
            maxHeight = height + 1;
        }
        return height++;
    }
}

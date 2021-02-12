package ProblemSolving;

public class Day23 {
    static void levelOrder(Node root){
        //Write your code here
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(root);
        Node trav = new Node(root.data);

        while(!queue.isEmpty()){
            Node node = queue.remove();

            System.out.print(node.data + " ");

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }
}

import java.util.Scanner;

class BinaryTree {
    public BinaryTree() {
    }
    private static class Node{
        int val;
        Node left , rigth;

        public Node(int val) {
            this.val = val;
        }
    }
    private Node root;
    public void populate(Scanner scanner) {
        System.out.println("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of : " + node.val);
        boolean left =  scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of " + node.val);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }

        System.out.println("Do you want to enter right of : " + node.val);
        boolean right =  scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of " + node.val);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.rigth);
        }

    }



}
public class Main {
    public static void main(String[] args) {

    }
}
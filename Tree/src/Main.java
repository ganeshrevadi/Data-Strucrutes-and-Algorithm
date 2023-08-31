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
            node.rigth = new Node(value);
            populate(scanner,node.rigth);
        }

    }

    public void display(){
        display(this.root, "");

    }
    private void  display(Node node , String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.val);
        display(node.left ,indent + "\t");
        display(node.rigth ,indent + "\t");
    }

    public void preetyDisplay(){
        preetyDisplay(root, 0);
    }

    private void preetyDisplay(Node node, int level) {
        if(node == null){
            return;
        }

        preetyDisplay(node.rigth,level + 1);
        if(level != 0){
            for (int i = 0; i < level- 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|-------->" + node.val);
        }
        else {
            System.out.println(node.val);
        }
        preetyDisplay(node.left,level + 1);
    }

}
public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(scanner);
//        tree.display();
//        tree.preetyDisplay();

        BST tree = new BST();
        int[] nums = {5,2,7,1,4,6,9,8,3,10};
        tree.populate(nums);
        tree.display();
        tree.preetyDisplay();
    }
}
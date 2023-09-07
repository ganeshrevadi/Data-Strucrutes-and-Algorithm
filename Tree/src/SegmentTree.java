class SegmentTree {

    Node root;
    public SegmentTree(int[] arr){
        this.root = constructTree(arr,0,arr.length - 1);
    }
    private static class Node{
        int val;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }

    }

    private Node constructTree(int[] arr , int start , int end){
        if(start == end ) {
            //Leaf Node
            Node leaf = new Node(start, end);
            leaf.val = arr[start];
            return leaf;
        }
        // create new node with index you are at
        Node node = new Node(start,end);
        int mid = (start + end) / 2;

        node.left = this.constructTree(arr,start,mid);
        node.right = this.constructTree(arr,mid + 1 , end);

        node.val = node.left.val + node.right.val;
        return node;
    }

    public void display() {
        display(this.root);
    }
    private void display(Node node) {
        String str = "";

        if(node.left != null) {
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.val + " => ";
        } else {
            str = str + "No left child";
        }

        // for current node
        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.val + " <= ";
        if(node.right != null) {
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.val;
        } else {
            str = str + "No right child";
        }

        System.out.println(str + '\n');

        // call recursion
        if(node.left != null) {
            display(node.left);
        }

        if(node.right != null) {
            display(node.right);
        }
    }

    // query
    public int query(int qsi, int qei) {
        return this.query(this.root, qsi, qei);
    }
    private int query(Node node, int qsi, int qei) {
        if(node.startInterval >= qsi && node.endInterval <= qei) {
            // node is completely lying inside query
            return node.val;
        } else if (node.startInterval > qei || node.endInterval < qsi) {
            // completely outside
            return 0;
        } else {
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    // update
    public void update(int index, int value) {
        this.root.val = update(this.root, index, value);
    }
    private int update(Node node, int index, int value) {
        if (index >= node.startInterval&& index <= node.endInterval){
            if(index == node.startInterval && index == node.endInterval) {
                node.val = value;
                return node.val;
            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.val = leftAns + rightAns;
                return node.val;
            }
        }
        return node.val;
    }
    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,-8,4,9};

        SegmentTree tree = new SegmentTree(arr);
        tree.display();
        System.out.println(tree.query(2,8));
        System.out.println(tree.query(1,6));
    }

    public Node invertTree(Node node){
        if(node == null){
            return node;
        }
        Node temp = node.right;
        node.right = invertTree(node.left);
        node.left = temp;

        return node;
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

class BinaryTree {
    public Node root;

    public void NewNode(int data) {
        root = NewNode(root, new Node(data));
    }

    private Node NewNode(Node root, Node newData) {
        if (root == null) {
            root = newData;
            return root;
        }

        if (newData.data < root.data) {
            root.left = NewNode(root.left, newData);
        } else {
            root.right = NewNode(root.right, newData);
        }
        return root;
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.NewNode(20); // Menambahkan root
        tree.NewNode(2); // Menambahkan node ke kiri root
        tree.NewNode(25); // Menambahkan node ke kanan root
        tree.NewNode(37); // Menambahkan node ke kiri dari node kiri root
        tree.NewNode(16); // Menambahkan node ke kanan dari node kanan root

        System.out.println("\nPre Order: ");
        tree.preOrder(tree.root);
        System.out.println("\n\nIn Order: ");
        tree.inOrder(tree.root);
        System.out.println("\n\nPost Order: ");
        tree.postOrder(tree.root);
    }
}
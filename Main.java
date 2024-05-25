public class  Main{
    public static void main(String[] args) {
        Tree<Character> tree = new Tree<>();
        char[] pohon = {'F','E','H','D','H','C','B','H','K','J'};
      
        for(char BTS : pohon){
            System.out.printf("%s",BTS);
            tree.insertNode(BTS);
        }
        char huruf1 = 'K';
        char huruf2 = 'A';
        System.out.println();
        System.out.println("Huruf yang ingin dicari adalah "+huruf1+" dan "+huruf2);

        tree.searchBST('A');
        tree.searchBST('K');
    }
}


class Tree<E extends Comparable<E>> {
    private TreeNode<E> root;

    // constructor initializes an empty Tree of integers
    public Tree() {
        root = null;
    }

    // insert a new node in the binary search tree
    public void insertNode(E insertValue) {
        if (root == null) {
            root = new TreeNode<E>(insertValue); // create root node
        } else {
            root.insert(insertValue); // call the insert method
        }
    }

    // begin preorder traversal
    public void preorderTraversal() {
        preorderHelper(root);
    }

    private void preorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.getData()); // output node data
        preorderHelper(node.getLeftNode()); // traverse left subtree
        preorderHelper(node.getRightNode()); // traverse right subtree
    }

    // begin inorder traversal
    public void inorderTraversal() {
        inorderHelper(root);
    }

    // recursive method to perform inorder traversal
    private void inorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        inorderHelper(node.getLeftNode()); // traverse left subtree
        System.out.printf("%s ", node.getData()); // output node data
        inorderHelper(node.getRightNode()); // traverse right subtree
    }

    // begin postorder traversal
    public void postorderTraversal() {
        postorderHelper(root);
    }

    // recursive method to perform postorder traversal
    private void postorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        postorderHelper(node.getLeftNode()); // traverse left subtree
        postorderHelper(node.getRightNode()); // traverse right subtree
        System.out.printf("%s ", node.getData()); // output node data
    }

    public void searchBST(E key) {
        boolean hasil = searchBSTHelper(root, key);
        if (hasil)
            System.out.println("Huruf "+ key +" ditemukan");
        else
            System.out.println("Huruf "+key+" tidak ditemukan");
    }

    // Carrano
    public boolean searchBSTHelper(TreeNode<E> node, E key) {
        boolean result = false;
        if (node != null) {
            if (key.equals(node.getData()))
                result = true;

            else if (key.compareTo(node.getData()) < 0)
                result = searchBSTHelper(node.getLeftNode(), key);
            else
                result = searchBSTHelper(node.getRightNode(), key);
        }
        return result;
    }
}

class TreeNode<E extends Comparable<E>> {
    private TreeNode<E> leftNode;
    private E data; // node value
    private TreeNode<E> rightNode;

    // constructor initializes data and makes this a leaf node
    public TreeNode(E nodeData) {
        data = nodeData;
        leftNode = rightNode = null; // node has no children
    }

    public E getData() {
        return data;
    }

    public TreeNode<E> getLeftNode() {
        return leftNode;
    }

    public TreeNode<E> getRightNode() {
        return rightNode;
    }

    public void insert(E insertValue) {
        // insert in left subtree
        if (insertValue.compareTo(data) < 0) {
            // insert new TreeNode
            if (leftNode == null) {
                leftNode = new TreeNode<E>(insertValue);
            } else { // continue traversing left subtree recursively
                leftNode.insert(insertValue);
            }
        }
        // insert in right subtree
        else if (insertValue.compareTo(data) > 0) {
            // insert new TreeNode
            if (rightNode == null) {
                rightNode = new TreeNode<E>(insertValue);
            } else { // continue traversing right subtree recursively
                rightNode.insert(insertValue);
            }
        }
    }
}
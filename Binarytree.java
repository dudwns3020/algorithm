import java.util.Scanner;

class BinarySearchTree {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    Node node;
    public Node search(Node node, int key){
        if(node == null || node.data == key) {
            return key;
        }
        if(node.data > key) {
            return search(node.right, key);
        }
        else {
            return search(node.left, key);
        }
    }
    public void insert(int data) {
        node = insert(node, data);
    }
    public Node insert(Node node, int data) {
        if(node == null) {
            node = new Node(data);
            return node;
        }
        if(data < node.data) {
            node.left = insert(node.left, data);
        }
        else if (data > node.data) {
            node.right = insert(node.right, data);
        }
        return node;
    }
    
}
    
public class Binarytree {
    public static void main(String[] args) {
        Binarytree t = new Binarytree();
    }
}
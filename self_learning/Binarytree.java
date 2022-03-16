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
    public void delete(int data) {
        node = delete(node, data);
    }
    public Node delete(Node node, int data) {
        if(node == null){
            return node;
        }
        if(data < node.data) {
            node.left = delete(node.left, data);
        }
        else if(data > node.data) {
            node.right = delete(node.right, data);
        }
        else {
            if(node.right == null && node.left == null) {
                return null;
            }
            else if(node.right == null) {
                return node.left;
            }
            else if(node.left == null) {
                return node.right;
            }

            node.data = min(node.data);
            node.right = delete(node.right, node.data)
        }
        return node;
    }
    public Node min(Node node) {
        int m = node.data;
        while(node.left != null) {
            m = node.left.data;
            node = node.left;
        }
        return min;
    }
   
    public void inorder(Node node) {
        if(node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
    public void inorder() {
        inorder(node);
        System.out.println("");

    }

}
    
public class Binarytree {
    public static void main(String[] args) {
        BinarySearchTree t = new BinarySearchTree();
        
        t.insert(4);
        t.insert(2);
        t.insert(1);
        t.insert(3);
        t.insert(6);
        t.insert(5);
        t.insert(7);

        t.inorder();
    }
}
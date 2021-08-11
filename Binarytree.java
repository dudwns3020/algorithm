import java.util.Scanner;

public class Binarytree {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node search(Node node, int key){
        while(node != null) {
            if(key == node.data) {
                return node;
            }
            if(key < node.data) {
                return search(node.left, key);
            }
            else {
                return search(node.right, key);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Binarytree t = new Binarytree();
    }
}
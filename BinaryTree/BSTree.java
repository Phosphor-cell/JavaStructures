package BinaryTree;

public class BSTree<T> {
    public static BSTNode<String> root = new BSTNode("Hello");
    public static <T> void main(String[] args){
        BST<String> t = new BST(root);
        System.out.println(t.find("data"));
    }
}

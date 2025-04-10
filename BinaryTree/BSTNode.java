package BinaryTree;

public class BSTNode<T extends Comparable<T>>{

    //The data value for all nodes is T which means that you can use anything for the data
    public T data;
    public BSTNode<T> left;
    public BSTNode<T> right;
    public BSTNode<T> parent;

    /**
     *Created a Binary Search Tree Node
     * <br>Type Any "<T>"
     * @param data
     */
    public BSTNode(T data){
        this.left = null;
        this.right = null;
        this.parent = null;
        this.data = data;
    }

    /**
     * Creates a Binary Search Tree node with all parameters
     * <br>
     * @param data "<T>"
     * @param left Node
     * @param right Node
     * @param parent Node
     */
    public BSTNode(T data, BSTNode<T> left, BSTNode<T> right, BSTNode<T> parent) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

    //______Generic Setup Operations_______________________________//
    /**
     * Retrieves the data from the node
     * @return data
     */
    public T getData(){
        return this.data;
    }

    /**
     * Retrieves the left child
     * @return left BSTNode
     */
    public BSTNode<T> getLeft(){
        return this.left;
    }

    /**
     * Retrieves the right child
     * @return right BSTNode
     */
    public BSTNode<T> getRight(){
        return this.right;
    }

    /**
     * Retrieves the parent for current BSTNode
     * @return parent BSTNode
     */
    public BSTNode<T> getParent(){
        return this.parent;
    }

    /**
     * Sets data for current Node
     * @param data
     */
    public void setData(T data){
        this.data = data;
    }

    /**
     * Sets left child
     * @param left BSTNode
     */
    public void setLeft(BSTNode<T> left){
        this.left = left;
    }

    /**
     * Sets right child
     * @param right BSTNode
     */
    public void setRight(BSTNode<T> right){
        this.right = right;
    }

    /**
     * Sets the parent
     * @param parent BSTNode
     */
    public void setParent(BSTNode<T> parent){
        this.parent = parent;
    }

    public boolean isLeaf(){
        //returns false if and ONLY IF both left and right children are null
        return this.left == null && this.right == null;
    }

    //_______________END OF GENERIC OPERATIONS______________________________________________________________________//

    //_________________Advanced Operations_________________________________________________________________________//

}

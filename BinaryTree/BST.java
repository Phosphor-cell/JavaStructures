package BinaryTree;

public class BST<T extends Comparable<T>> {
    //This entire function will operate for Binary Search Trees, the BSTNode will later be used for AVL trees as well (TO be Continued)
    public BSTNode<T> root;

    public BST(){
        root = null;
    }

    public BST(BSTNode<T> root){
        this.root = root;
    }

    public BSTNode<T> getRoot(){
        return root;
    }

    public void setRoot(BSTNode<T> root){
        this.root = root;
    }


    /**
     * finds the data within the inputted Binary Tree has time complexity of O(n) (This can become exponential if not carefully designed)
     * @param r Node
     * @param data T
     * @return Node
     */
    public BSTNode<T> find(BSTNode<T> r, T data) {
        if (r != null) {
            if (r.getData().compareTo(data) == 0) {
                return r;
            } else if (!r.isLeaf()) {
                if (r.getData().compareTo(data) < 0) {
                    return find(r.getLeft(), data);
                } else if (r.getData().compareTo(data) > 0) {
                    return find(r.getRight(), data);
                }
            }
        }
        return null;
    }

    /**
     * finds data with the current tree and returns that node
     * @param data T
     * @return Node
     */
    public BSTNode<T> find(T data){
        BSTNode<T> curr = this.root;
        while (curr != null) {
            if (curr.getData().compareTo(data) == 0) {
                return curr;
            } else if (!curr.isLeaf()) {
                if (curr.getData().compareTo(data) < 0) {
                    curr = curr.getLeft();
                } else if (curr.getData().compareTo(data) > 0) {
                    curr = curr.getRight();
                }
            }else{
                return null;
            }
        }
        return null;
    }

}

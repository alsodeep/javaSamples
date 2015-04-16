package com.alsodeep.btree;

/**
 * Represent BTree node.
 * Created by alsodeep on 15/04/15.
 */
public class TreeNode {

    private Integer value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(Integer value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Integer getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
}

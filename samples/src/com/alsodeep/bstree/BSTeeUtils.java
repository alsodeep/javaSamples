package com.alsodeep.bstree;

import com.alsodeep.btree.TreeNode;

/**
 * Utils method for BTree
 * Created by Sergey Lysenko on 16/04/15.
 */
public class BSTeeUtils {
    /**
     * Check if binary search tree is valid. All left siblings is smaller than node, and all right sibling is bigger
     * than node
     *
     * @param node Node to check
     * @param max  max allowed value for node
     * @param min  min allowed value for node
     * @return true if binary tree is binary search tree, otherwise return false
     */
    public static boolean checkIfValid(TreeNode node, Integer max, Integer min) {
        //FIXME Should check for null for siblings when calling
        //Check if node value bigger than left node value
        return node.getValue() > node.getLeft().getValue() &&
                //Check if node bigger than allowed min value
                node.getValue() > min &&
                //Check if node value smaller than right node value
                node.getRight().getValue() > node.getValue() &&
                //Check if node  smaller than allowed max value
                node.getValue() < max &&
                //Do check for left sibling node
                checkIfValid(node.getLeft(), node.getValue(), Integer.MIN_VALUE) &&
                //Do check for right sibling node
                checkIfValid(node.getRight(), Integer.MAX_VALUE, node.getValue());
    }
}

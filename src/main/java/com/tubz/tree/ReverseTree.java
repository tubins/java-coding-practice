package com.tubz.tree;


/**
 * Recursive call  so, O(n) time, O(h) is the maximum height of the tree from the root node.
 */

public class ReverseTree {

    static class Tree {
        int data;
        Tree left;
        Tree right;

        public Tree(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public Tree(int data, Tree left, Tree right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void reverseTree(Tree tree) {
        if (null == tree) {
            return;
        }
        // reverse operation goes here
        Tree temp = tree.left;
        tree.left = tree.right;
        tree.right = temp;
        reverseTree(tree.left);
        reverseTree(tree.right);

    }

    public static void main(String[] args) {
        // let tree
        /**
         *             1
         *        2          9
         *    3      4     10       11
         *  5   6   7   8         12    13
         *
         */
    }

}

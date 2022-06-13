package com.tubz.tree;


/**
 * Recursive call  so, O(n) time, O(h) is the space  -
 *
 *
 *
 */

public class TreeDFS {

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

    public static void dfsPreOrder(Tree tree) {
        if (null == tree) {
            return;
        }
        System.out.println(tree.data);
        dfsPreOrder(tree.left);
        dfsPreOrder(tree.right);
    }

    public static void dfsPostOrder(Tree tree) {
        if (null == tree) {
            return;
        }
        dfsPostOrder(tree.left);
        dfsPostOrder(tree.right);
        System.out.println(tree.data);

    }

    public static void dfsInOrder(Tree tree) {
        if (null == tree) {
            return;
        }
        dfsInOrder(tree.left);
        System.out.println(tree.data);
        dfsInOrder(tree.right);
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

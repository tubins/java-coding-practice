package com.tubz.tree;


// By using a queue (recursively):

// Time complexity: O(n)
// Space complexity: O(n)

import java.util.ArrayList;

public class TreeBFS {

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


    static void bfs(Tree root, int i, ArrayList<Tree> queue) {
        if (i >= queue.size()) return;
        else {
            Tree poppedNode = queue.get(i);
            if (poppedNode != null) {
                System.out.println(poppedNode.data);
                queue.add(poppedNode.left);
                queue.add(poppedNode.right);
            }
            bfs(root, i + 1, queue);
        }
    }

    static void bfs(Tree root) {
        ArrayList<Tree> queue = new ArrayList<>();
        queue.add(root);
        bfs(root, 0, queue);
    }

    public static void main(String[] args) {

    }

}

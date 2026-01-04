package com.example.algorithms.tree;

public class TreeTest {

    public static void main(String[] args) {
        System.out.println("Tree test");
        TreeNode root = new TreeNode(5);
        root.left=new TreeNode(4);
        root.right=new TreeNode(6);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);

        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(3);


    }

}

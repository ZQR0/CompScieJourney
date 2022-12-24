package org.cs.Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
* Definition for a binary tree node.
*/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

/*
* @author ZQR0
* @since 24.12.2022
* Main solution for leetcode task
*/
public class BinaryTreeInorderTraversal {
    /*
    * @method inorderTraversal
    * @param TreeNode root - root of tree nodes
    * @return list of ordered traversal
    */
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();

        TreeNode cur = root;

        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.left;
            }

            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }

        return res;
    }
}

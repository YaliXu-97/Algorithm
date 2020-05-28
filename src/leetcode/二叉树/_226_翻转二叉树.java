package leetcode.二叉树;

import java.util.LinkedList;
import java.util.Queue;

public class _226_翻转二叉树 {
//    //先序遍历
//    public TreeNode invertTree(TreeNode root) {
//        if (root==null) return root;
//        TreeNode tmp=root.left;
//        root.left=root.right;
//        root.right=tmp;
//
//        invertTree(root.left);
//        invertTree(root.right);
//        return root;
//    }
    //后序遍历
//    public TreeNode invertTree(TreeNode root) {
//        if (root==null) return root;
//        invertTree(root.left);
//        invertTree(root.right);
//
//        TreeNode tmp=root.left;
//        root.left=root.right;
//        root.right=tmp;
//        return root;
//    }
    //中序遍历
//public TreeNode invertTree(TreeNode root) {
//        if (root==null) return root;
//        invertTree(root.left);
//        TreeNode tmp=root.left;
//        root.left=root.right;
//        root.right=tmp;
//        invertTree(root.left);
//        return root;
//}
//层序遍历，迭代
public TreeNode invertTree(TreeNode root) {
   if (root==null) return root;
    Queue<TreeNode> queue=new LinkedList<TreeNode>();
    queue.add(root);
    while (!queue.isEmpty()){
        TreeNode current=queue.poll();
        TreeNode temp=current.left;
        current.left=current.right;
        current.right=temp;
        if (current.left!=null) queue.add(current.left);
        if (current.right!=null) queue.add(current.right);
    }
    return root;
}
}

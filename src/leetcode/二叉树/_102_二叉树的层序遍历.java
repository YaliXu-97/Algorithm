package leetcode.二叉树;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _102_二叉树的层序遍历 {
    public static void main(String args[]){
        TreeNode t1=new TreeNode(3);
        TreeNode t2=new TreeNode(9);
        TreeNode t3=new TreeNode(20);
        TreeNode t4=new TreeNode(15);
        TreeNode t5=new TreeNode(7);
        t1.left=t2;
        t1.right=t3;
        t2.right=null;
        t2.left=null;
        t3.left=t4;
        t3.right=t5;
        _102_二叉树的层序遍历 test=new _102_二叉树的层序遍历();
        test.levelOrder(t1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> tree=new LinkedList<TreeNode>();
        List<List<Integer>> lists=new LinkedList<List<Integer>>();
        if (root==null) return lists;
        tree.add(root);
        while (!tree.isEmpty()){
            List<Integer> list=new LinkedList<Integer>();
            int size=tree.size();
            for (int i=0;i<size;i++){
                TreeNode node=tree.poll();
                list.add(node.val);
                if (node.left!=null) tree.add(node.left);
                if (node.right!=null) tree.add(node.right);
            }
            lists.add(list);
        }
        return lists;
    }
}

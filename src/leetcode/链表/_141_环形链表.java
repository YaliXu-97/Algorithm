package leetcode.链表;
//https://leetcode-cn.com/problems/linked-list-cycle/
//作业：1、移除链表元素 2、删除排序链表中的重复元素 3、链表的中间结点
public class _141_环形链表 {
     class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
  }
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        if (head==null||head.next==null)
            return  false;
        while (fast!=null&&fast.next!=null){
            if (slow==fast)
                return true;
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
    public static void main(String args[]){
    }
}

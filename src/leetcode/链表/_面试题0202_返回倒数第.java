package leetcode.链表;

import 链表.List;

public class _面试题0202_返回倒数第 {
    public static void main(String args[]){
        ListNode list1= new ListNode(1);
        ListNode list2= new ListNode(2);
        ListNode list3= new ListNode(3);
        ListNode list4= new ListNode(4);
        list4.next=null;
        list3.next=list4;
        list2.next=list3;
        list1.next=list2;
        _面试题0202_返回倒数第 list=new _面试题0202_返回倒数第();
        list.kthToLast(list1,2);
    }
    public int kthToLast(ListNode head, int k) {
        if(head==null) return 0;
        ListNode slow=head,fast=null;
        while (k>0){
            fast=head;
            head=head.next;
            k--;
        }
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
       // System.out.println( slow.val);
        return  slow.val;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

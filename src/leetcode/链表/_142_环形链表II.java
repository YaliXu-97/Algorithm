package leetcode.链表;

import 链表.LinkedList;

import java.util.*;

public class _142_环形链表II {
  static  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        Set<ListNode > map=new HashSet<ListNode >();
        ListNode r=head;
        while (r!=null){
         if (map.contains(r)){
             return r;
         }
         map.add(r);
         r=r.next;
        }
        return null;
    }
    public static void main(String args[]){
        ListNode l1=new ListNode(3);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(0);
        ListNode l4=new ListNode(-4);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l2;
        _142_环形链表II list=new _142_环形链表II();
        list.detectCycle(l1);
    }
}

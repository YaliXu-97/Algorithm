package leetcode.链表;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class _面试题0201_移除重复节点 {
    public static void main(String args[]){
        ListNode list1= new ListNode(1);
        ListNode list2= new ListNode(2);
        ListNode list3= new ListNode(3);
        ListNode list4= new ListNode(3);
        ListNode list5= new ListNode(2);
        ListNode list6= new ListNode(1);
        list6.next=null;
        list5.next=list6;
        list4.next=list5;
        list3.next=list4;
        list2.next=list3;
        list1.next=list2;
//        while (list1!=null){
//            System.out.println(list1.val+" ");
//            list1=list1.next;
//        }
        _面试题0201_移除重复节点 list=new _面试题0201_移除重复节点();
        list.removeDuplicateNodes(list1);
    }
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head==null||head.next==null) return head;
        ListNode pre=new ListNode(-1);
        ListNode p=pre;
        int visited[]=new int[20001];
        while (head!=null){
            if (visited[head.val]==0){
                visited[head.val]=1;
                p.next=head;
                head=head.next;
                p=p.next;
            }
            else {
                head=head.next;
                p.next=head;
            }
        }
//        while (pre.next!=null){
//            System.out.println(pre.next.val+" ");
//            pre=pre.next;
//        }
        return pre.next;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

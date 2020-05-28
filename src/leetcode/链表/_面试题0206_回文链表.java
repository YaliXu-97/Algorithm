package leetcode.链表;

import 链表.ArrayList;
import 链表.List;

public class _面试题0206_回文链表 {
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
        _面试题0206_回文链表 list=new _面试题0206_回文链表();
        list.isPalindrome(list1);
    }
    public boolean isPalindrome(ListNode head) {
        if (head==null||head.next==null) return true;
        List<Integer> li=new ArrayList<>();
        while (head!=null){
            li.add(head.val);
            head=head.next;
        }
        int front=0,last=li.size()-1;
        while (front<last){
            if (!li.get(front).equals(li.get(last))){
                return false;
            }
            front++;
            last--;
        }
        return true;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

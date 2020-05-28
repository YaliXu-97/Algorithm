package leetcode.链表;

public class _面试题24_反转链表 {
    public static void main(String args[]){
        ListNode list1= new ListNode(1);
        ListNode list2= new ListNode(2);
        ListNode list3= new ListNode(3);
        ListNode list4= new ListNode(4);
        list4.next=null;
        list3.next=list4;
        list2.next=list3;
        list1.next=list2;
        _面试题24_反转链表 list=new _面试题24_反转链表();
        list.reverseList(list1);
    }
    public ListNode reverseList(ListNode head) {
        if (head==null||head.next==null) return head;
        ListNode newHead=reverseList(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

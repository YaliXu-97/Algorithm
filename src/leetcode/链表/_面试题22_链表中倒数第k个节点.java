package leetcode.链表;

public class _面试题22_链表中倒数第k个节点 {
    public static void main(String args[]){
        ListNode list1= new ListNode(1);
        ListNode list2= new ListNode(2);
        ListNode list3= new ListNode(3);
        ListNode list4= new ListNode(4);
        list4.next=null;
        list3.next=list4;
        list2.next=list3;
        list1.next=list2;
        _面试题22_链表中倒数第k个节点 list=new _面试题22_链表中倒数第k个节点();
        list.getKthFromEnd(list1,2);
    }
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head==null) return null;
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
        return slow;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

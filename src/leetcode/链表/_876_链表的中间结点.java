package leetcode.链表;

public class _876_链表的中间结点 {
    public static void main(String args[]){
        ListNode list1= new ListNode(1);
        ListNode list2= new ListNode(1);
        ListNode list3= new ListNode(2);
        ListNode list4= new ListNode(3);
        ListNode list5= new ListNode(3);
        ListNode list6= new ListNode(5);
        ListNode list7= new ListNode(5);
        list7.next=null;
        list6.next=list7;
        list5.next=list6;
        list4.next=list5;
        list3.next=list4;
        list2.next=list3;
        list1.next=list2;
        _876_链表的中间结点 list=new _876_链表的中间结点();
        list1=list.middleNode(list1);
        System.out.println();
        while (list1!=null){
            System.out.print(list1.val+" ");
            list1=list1.next;
        }
        System.out.println();
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //利用快慢指针，当快指针到达终点时，满指针正好走一半
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}

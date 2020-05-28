package leetcode.链表;

public class _面试题52_两个链表的第一个公共节点 {
    public static void main(String args[]){
        ListNode l1= new ListNode(4);
        ListNode list2= new ListNode(1);
        ListNode list3= new ListNode(8);
        ListNode list4= new ListNode(4);
        ListNode list5= new ListNode(5);
        ListNode l2= new ListNode(5);
        ListNode list6= new ListNode(0);
        ListNode list7= new ListNode(1);
        //ListNode list8= new ListNode(1);

        list5.next=null;
        list4.next=list5;
        list3.next=list4;
        list2.next=list3;
        l1.next=list2;

        // list8.next=list3;
        list7.next=list3;
        list6.next=list7;
        l2.next=list6;
        _面试题52_两个链表的第一个公共节点 list=new _面试题52_两个链表的第一个公共节点();
        list.getIntersectionNode(l1,l2);
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null) return null;
        ListNode pa=headA,pb=headB;
        while (pa!=pb){
            pa=pa==null?headB:pa.next;
            pb=pb==null?headA:pb.next;
        }
        return pa;
    }
    public  static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

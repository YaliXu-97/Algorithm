package leetcode.链表;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class _328_奇偶链表 {
    public static void main(String args[]){
        ListNode list1= new ListNode(1);
        ListNode list2= new ListNode(2);
        ListNode list3= new ListNode(3);
        ListNode list4= new ListNode(4);
        list4.next=null;
        list3.next=list4;
        list2.next=list3;
        list1.next=list2;
        _328_奇偶链表 list=new _328_奇偶链表();
        list.oddEvenList(list1);

    }
    public ListNode oddEvenList(ListNode head) {
        if (head==null) return head;
        ListNode pa=head,pb=head.next,r=pb;
        while (pb!=null&&pb.next!=null){
            pa.next=pb.next;
            pa=pa.next;
            pb.next=pa.next;
            pb=pb.next;
        }
        pa.next=r;
        return head;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

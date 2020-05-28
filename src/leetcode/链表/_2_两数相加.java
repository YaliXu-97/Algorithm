package leetcode.链表;

import javax.annotation.processing.SupportedSourceVersion;

public class _2_两数相加 {
    public static void main(String args[]){
        ListNode l1= new ListNode(7);
        ListNode list2= new ListNode(2);
        ListNode list3= new ListNode(4);
        ListNode list4= new ListNode(3);
        ListNode l2= new ListNode(5);
        ListNode list5= new ListNode(6);
        ListNode list6= new ListNode(4);
        list4.next=null;
        list3.next=list4;
        list2.next=list3;
        l1.next=list2;

        list6.next=null;
        list5.next=list6;
        l2.next=list5;
        _2_两数相加 list=new _2_两数相加();
        list.addTwoNumbers(l1,l2);
    }
    public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1==null||l2==null) return null;
        ListNode r=l1;
       ListNode head=new ListNode(-1);
       ListNode pre=head;
       int carry=0;
        while (l1!=null||l2!=null||carry!=0){
           int l1val=l1!=null?l1.val:0;
           int l2val=l2!=null?l2.val:0;
           int sumValue=l1val+l2val+carry;
           carry=sumValue/10;
           ListNode sum=new ListNode(sumValue%10);
           pre.next=sum;
           pre=pre.next;
           if (l1!=null) l1=l1.next;
           if (l2!=null) l2=l2.next;
        }
        while (head.next!=null){
            System.out.println(head.next.val+" ");
            head=head.next;
        }
        return head.next;
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

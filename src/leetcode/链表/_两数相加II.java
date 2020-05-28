package leetcode.链表;
//https://leetcode-cn.com/problems/add-two-numbers-ii/
public class _两数相加II {
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
        _两数相加II list=new _两数相加II();
        list.addTwoNumbers(l1,l2);
    }
    public ListNode reverse(ListNode node){
        if (node==null||node.next==null) return node;
        ListNode newHead=reverse(node.next);
        node.next.next=node;
        node.next=null;
        return newHead;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode pre=new ListNode(-1);
        ListNode head=pre;
        int carry=0;
        while (l1!=null||l2!=null||carry!=0){
            int l1val=l1!=null?l1.val:0;
            int l2val=l2!=null?l2.val:0;
            int sumValue=l1val+l2val+carry;
            ListNode sum=new ListNode(sumValue%10);
            carry=sumValue/10;
            pre.next=sum;
            pre=pre.next;
            if (l1!=null) l1=l1.next;
            if (l2!=null) l2=l2.next;
        }
        return head;
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

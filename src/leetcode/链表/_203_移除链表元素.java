package leetcode.链表;
//https://leetcode-cn.com/problems/remove-linked-list-elements/
public class _203_移除链表元素 {
    public static void main(String args[]){
        ListNode list1= new ListNode(1);
        ListNode list2= new ListNode(2);
        ListNode list3= new ListNode(6);
        ListNode list4= new ListNode(3);
        ListNode list5= new ListNode(4);
        ListNode list6= new ListNode(5);
        ListNode list7= new ListNode(6);
        list7.next=null;
        list6.next=list7;
        list5.next=list6;
        list4.next=list5;
        list3.next=list4;
        list2.next=list3;
        list1.next=list2;
        System.out.println();
        _203_移除链表元素 list=new _203_移除链表元素();
        System.out.println(list1.val);
      list1=list.removeElements(list1,6);
        System.out.println(list1.val);
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
 //非递归
    public ListNode removeElements(ListNode head, int val) {
       while (head!=null&&head.val==val){
           head=head.next;
       }
        if (head==null||head.next==null) return head;
       ListNode newHead=head;
       while (head.next!=null){
           if (head.next.val!=val){
               head=head.next;
           }
           else {
               head.next=head.next.next;
           }
       }
       return newHead;
    }
    //递归
    public ListNode removeElements2(ListNode head, int val) {
        if (head==null) return head;
        head.next=removeElements(head.next,val);
        if (head.val==val){
            head=head.next;
            return head;
        }
        else {
            return head;
        }
    }

}

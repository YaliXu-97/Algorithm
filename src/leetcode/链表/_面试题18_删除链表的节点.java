package leetcode.链表;

public class _面试题18_删除链表的节点 {
    public static void main(String args[]){
        ListNode list1= new ListNode(1);
        ListNode list2= new ListNode(2);
        ListNode list3= new ListNode(3);
        ListNode list4= new ListNode(4);
        list4.next=null;
        list3.next=list4;
        list2.next=list3;
        list1.next=list2;
        _面试题18_删除链表的节点 list=new _面试题18_删除链表的节点();
        list.deleteNode(list1,2);

    }
    public ListNode deleteNode(ListNode head, int val) {
        if (head==null) return head;
        ListNode pre=new ListNode(-1);
        ListNode p=pre;
        while (head!=null){
            if (head.val==val){
                head=head.next;
                p.next=head;
            }
            else {
                p.next=head;
                head=head.next;
                p=p.next;
            }
        }
        return pre.next;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}

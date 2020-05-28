package leetcode.链表;

public class _面试题0203_删除中间节点 {
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
        _面试题0203_删除中间节点 list=new _面试题0203_删除中间节点();
        list.deleteNode(list1);
    }
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

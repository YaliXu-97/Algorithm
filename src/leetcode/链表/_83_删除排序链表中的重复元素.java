package leetcode.链表;

import 链表.List;

//https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
public class _83_删除排序链表中的重复元素 {
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
        _83_删除排序链表中的重复元素 list=new _83_删除排序链表中的重复元素();
        list1=list.deleteDuplicates3(list1);
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
    //非递归
    public ListNode deleteDuplicates(ListNode head) {
        while (head!=null&&head.next!=null){
            if (head.val==head.next.val){
                head=head.next;
            }
            else
                break;
        }
        if (head==null||head.next==null) return head;
        ListNode pre=head;
        head=head.next;
        while (head.next!=null){
            if (head.val==head.next.val){
                head.next=head.next.next;
            }
            else {
                head=head.next;
            }
        }
        return pre;
    }
    //方法二
    public ListNode deleteDuplicates2(ListNode head) {
        if (head==null||head.next==null) return head;
        ListNode list=head;
        while (list.next!=null){
            if (list.val<list.next.val){
                list=list.next;
            }
            else {
                list.next=list.next.next;
            }
        }
        return head;
    }
    //方法三：递归
    public ListNode deleteDuplicates3(ListNode head) {
        if (head==null||head.next==null) return head;
        head.next=deleteDuplicates3(head.next);
        if (head.val==head.next.val){
            return head.next;
        }
        else return head;
    }
}

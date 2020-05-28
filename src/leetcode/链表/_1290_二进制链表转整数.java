package leetcode.链表;

import java.util.ArrayList;
import java.util.List;

public class _1290_二进制链表转整数 {
    public static void main(String args[]){
        ListNode list1= new ListNode(1);
        ListNode list2= new ListNode(0);
        ListNode list3= new ListNode(0);
       // ListNode list4= new ListNode(3);
        //ListNode list5= new ListNode(2);
        //ListNode list6= new ListNode(1);
        //list6.next=null;
        //list5.next=list6;
        //list4.next=list5;
        list3.next=null;
        list2.next=list3;
        list1.next=list2;
        _1290_二进制链表转整数 list=new _1290_二进制链表转整数();
        list.getDecimalValue(list1);
    }
    public int getDecimalValue1(ListNode head) {
        if (head==null) return 0;
        int sum=0;
        List<Integer> list=new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head=head.next;
        }
        for(int i=0;i<list.size();i++){
            sum+=list.get(i)*Math.pow(2,list.size()-1-i);
        }
        System.out.println(sum);
        return sum;
    }
    public int getDecimalValue(ListNode head){
        if (head==null) return 0;
        int sum=0;
        while (head!=null){
            sum=sum*2+head.val;
            head=head.next;
        }
        System.out.println(sum);
        return sum;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

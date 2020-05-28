package leetcode.链表;

import java.util.HashMap;
import java.util.Map;

public class _160_相交链表 {
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
//        while (l2!=null){
//            System.out.print(l2.val+" ");
//            l2=l2.next;
//        }
//        System.out.println();
        _160_相交链表 list=new _160_相交链表();
        list.getIntersectionNode(l1,l2);
    }
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        ListNode r=null,q=headB;
        if (headA==null||headB==null) return null;
        while (headA!=null){
            while (headB!=null){
                if (headA!=headB) {
                    headB=headB.next;
                }
                else {
                    r=headA;
                    return r;
                }
            }
            headA=headA.next;
            headB=q;
        }
        return r;
    }
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB){
        if (headA==null||headB==null) return null;
        ListNode p=headA,q=headB;
        int countA=0,countB=0;
        while (p!=null&&q!=null){
            if (p!=q){
                p=p.next;
                q=q.next;
            }
            else{
                return  p;
            }
            if (countA==0&&p==null){
                p=headB;
                countA++;
            }
            if (countB==0&&q==null){
                q=headA;
                countB++;
            }
        }
        return null;
    }
    public ListNode getIntersectionNode3(ListNode headA, ListNode headB){
        if (headA==null||headB==null) return null;
        ListNode pa=headA,pb=headB;
        while (pa!=pb){
            pa=pa==null?headB:pa.next;
            pb=pb==null?headA:pb.next;
        }
        return pa;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        Map<ListNode, Integer> map=new HashMap<>();
        while (headA!=null){
            map.put(headA,headA.val);
            headA=headA.next;
        }
        while (headB!=null){
           if(map.containsKey(headB)){
               return headB;
           }else {
                headB=headB.next;
           }
        }
        return null;
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

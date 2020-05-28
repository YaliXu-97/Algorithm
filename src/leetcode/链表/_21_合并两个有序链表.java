package leetcode.链表;
//https://leetcode-cn.com/problems/merge-two-sorted-lists/
public class _21_合并两个有序链表 {
    public static  void main(String args[]){
        ListNode l1= new ListNode(1);
        ListNode list2= new ListNode(2);
        ListNode list3= new ListNode(4);
        ListNode l2= new ListNode(1);
        ListNode list5= new ListNode(3);
        ListNode list6= new ListNode(4);
        list3.next=null;
        list2.next=list3;
        l1.next=list2;

        list6.next=null;
        list5.next=list6;
        l2.next=list5;
        _21_合并两个有序链表 list=new _21_合并两个有序链表();
//        while (l2!=null){
//            System.out.print(l2.val+" ");
//            l2=l2.next;
//        }
//        System.out.println();
       list.mergeTwoLists(l1,l2);
    }
    public  static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
  }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(-1);
        ListNode r = p;
        if (l1==null) return l2;
        if (l2==null) return l1;
       while (l1!=null&&l2!=null){
           if (l1.val<l2.val){
              p.next=l1;
              l1=l1.next;
           }else{
               p.next=l2;
               l2=l2.next;
           }
           p=p.next;
       }
        if(l1!=null){
            p.next=l1;
        }
        if (l2!=null){
            p.next=l2;
        }
        return r.next;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if (l1==null) return l2;
        if (l2==null) return l1;
        if (l1.val<l2.val){
            l1.next=mergeTwoLists1(l1.next,l2);
            return l1;
        }
        else {
            l2.next=mergeTwoLists1(l1,l2.next);
            return l2;
        }
    }
}

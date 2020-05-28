package leetcode.链表;

public class _725_分隔链表 {
    public static void main(String args[]){
        ListNode list1= new ListNode(1);
        ListNode list2= new ListNode(2);
        ListNode list3= new ListNode(3);
        ListNode list4= new ListNode(4);
        list4.next=null;
        list3.next=list4;
        list2.next=list3;
        list1.next=list2;
        _725_分隔链表 list=new _725_分隔链表();
        list.splitListToParts(list1,3);
    }
    public ListNode[] splitListToParts1(ListNode root, int k) {
        ListNode p=root;
        int length=0,al=0,except;
        while (p!=null){
            length++;
            p=p.next;
        }
        ListNode []ans=new ListNode[k];
        p=root;
        al=length/k;
        except=length%k;
        for(int i=0;i<k;i++){
            ListNode head=new ListNode(0),write=head;
            for(int j=0;j<al+(i<except?1:0);j++){
                write.next=new ListNode(p.val);
                write=write.next;
                if(p!=null) p=p.next;
            }
            ans[i]=head.next;
        }
        return ans;
    }
    public ListNode[] splitListToParts(ListNode root, int k){
        ListNode p=root;
        int len=0;
        while (p!=null){
            len++;
            p=p.next;
        }
        int al=len/k,except=len%k;
        ListNode ans[]=new ListNode[k];
        p=root;
        for(int i=0;i<k;i++){
            ListNode head=new ListNode(0),w=head;
            for(int j=0;j<al+(i<except?1:0);j++){
                w.next=p;
                w=w.next;
                if (p!=null)
                    p=p.next;
            }
            w.next=null;
            ans[i]=head.next;
        }
//        for(int i=0;i<k;i++){
//            while (ans[i]!=null){
//                System.out.print(ans[i].val);
//                ans[i]=ans[i].next;
//            }
//            System.out.println();
//        }
        return  ans;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

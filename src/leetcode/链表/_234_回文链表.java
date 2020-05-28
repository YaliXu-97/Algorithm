package leetcode.链表;
import java.util.ArrayList;
import java.util.List;

public class _234_回文链表 {
    public static void main(String args[]){
        ListNode list1= new ListNode(1);
        ListNode list2= new ListNode(2);
        ListNode list3= new ListNode(2);
        ListNode list4= new ListNode(1);
        list4.next=null;
        list3.next=list4;
        list2.next=list3;
        list1.next=list2;
        _234_回文链表 list=new _234_回文链表();
        list.isPalindrome(list1);
    }
    public boolean isPalindrome1(ListNode head) {
        List<Integer> vals = new ArrayList<>();
        ListNode node=head;
        while (node!=null){
            vals.add(node.val);
            node=node.next;
        }
        int front=0;
        int end=vals.size()-1;
        while (front<end){
            if (!vals.get(front).equals(vals.get(end))){
                return false;
            }
            front++;
            end--;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head){
        ListNode p=head,r=head,q=head.next;
        if (head!=null||head.next!=null) return true;
        while (q!=null&&q.next!=null){
            p=p.next;
            q=q.next.next;
        }
        while (r!=null&&q!=null){
            if (r.val!=q.val) return false;
            else {
                r=r.next;
                q=q.next;
            }
        }
        return true;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

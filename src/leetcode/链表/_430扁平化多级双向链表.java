package leetcode.链表;

import java.util.ArrayDeque;
import java.util.Deque;

public class _430扁平化多级双向链表 {
    public static void main(String args[]){
        Node l1=new Node(1);
        Node l2=new Node(2);
        Node l3=new Node(3);
        Node l4=new Node(4);
        Node l5=new Node(5);
        Node l6=new Node(6);
        Node l7=new Node(7);
        Node l8=new Node(8);
        Node l9=new Node(9);
        Node l10=new Node(10);
        Node l11=new Node(11);
        Node l12=new Node(12);
        l1.next=l2;
        l2.prev=l1;
        l2.next=l3;
        l3.prev=l2;
        l3.next=l4;
        l3.child=l7;
        l4.prev=l3;
        l4.next=l5;
        l5.prev=l4;
        l5.next=l6;
        l6.prev=l5;
        l6.next=null;
        l7.next=l8;
        l8.prev=l7;
        l8.next=l9;
        l8.child=l11;
        l9.prev=l8;
        l9.next=l10;
        l10.prev=l9;
        l10.next=null;
        l11.next=l12;
        l12.prev=l11;
        l12.next=null;
        _430扁平化多级双向链表 list=new _430扁平化多级双向链表();
        list.flatten(l1);
    }
    //利用递归算法
    public Node flatten1(Node head) {
        if (head==null) return head;
        Node prehead=new Node(0);
        prehead.next=head;
        prehead.child=null;
        prehead.prev=null;
        flattenDFS(prehead,head);
        prehead.next.prev=null;
        return prehead.next;
    }
    public Node flattenDFS(Node pre,Node cur){
        if (cur==null)return pre;
        pre.next=cur;
        cur.prev=pre;
        Node r=cur.next;
        Node tail=flattenDFS(cur,cur.child);
        cur.child=null;
        return flattenDFS(tail,r);
    }
    //迭代，利用栈来做
    public Node flatten(Node head){
        if (head==null) return null;
        Node prehead=new Node(0);
        prehead.next=head;
        prehead.child=null;
        prehead.prev=null;
        Node curr,prev=prehead;
        Deque<Node> stack=new ArrayDeque<>();
        stack.push(head);
        while (!stack.isEmpty()){
            curr=stack.pop();
            curr.prev=prev;
            prev.next=curr;
            if (curr.next!=null) stack.push(curr.next);
            if (curr.child!=null){
                stack.push(curr.child);
                curr.child=null;
            }
            prev=curr;
        }
        return prehead.next;
    }
    public  static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
        Node(int x) { val = x; }
    };
}

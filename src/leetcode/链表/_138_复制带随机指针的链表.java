package leetcode.链表;

import java.util.HashMap;
import java.util.Map;

public class _138_复制带随机指针的链表 {
    public static void main(String args[]){
        Node l5=new Node(1,null,null);
        Node l4=new Node(10,l5,null);
        Node l3=new Node(11,l4,null);
        Node l2=new Node(13,l3,null);
        Node l1=new Node(7,l2,null);
        l2.random=l1;
        l3.random=l5;
        l4.random=l3;
        l5.random=l2;
        _138_复制带随机指针的链表 list=new _138_复制带随机指针的链表();
        list.copyRandomList(l1);
    }
    Map<Node,Node> copyList=new HashMap<Node,Node>();
    public Node copyRandomList1(Node head) {
        if (head==null) return head;
        if (this.copyList.containsKey(head)){
            return this.copyList.get(head);
        }
        Node node=new Node(head.val,null,null);
        this.copyList.put(head,node);
        node.next=copyRandomList(head.next);
        node.random=copyRandomList(head.random);
        return node;
    }
    public Node copyRandomList(Node head){
        if (head==null) return head;
        Node ptr=head;
        //新建节点
        while (ptr!=null){
            Node newnode=new Node(ptr.val);
            newnode.next=ptr.next;
            ptr.next=newnode;
            ptr=newnode.next;
        }
        //遍历新旧节点，拆分
        ptr=head;
        //复制random节点
        while (ptr!=null){
            ptr.next.random=(ptr.random==null?null:ptr.random.next);
            ptr=ptr.next.next;
        }
        //复制next节点，还原链表
        Node oldlist=head;
        Node newlist=head.next;
        Node old_head=head.next;
        while (oldlist!=null){
            oldlist.next=oldlist.next.next;
            newlist.next=newlist.next!=null?newlist.next.next:null;
            oldlist=oldlist.next;
            newlist=newlist.next;
        }
        return old_head;
    }
    public static class Node {
        int val;
        Node next;
        Node random;
        public Node() {}
        public Node(int val,Node _next,Node _random) {
            this.val = val;
            this.next = _next;
            this.random = _random;
        }
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}

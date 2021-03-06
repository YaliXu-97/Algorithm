package 链表;

import javax.xml.soap.Node;

public class LinkedList<E> extends AbstractList<E>{
    private Node<E> first;
    private static class Node<E>{
        E element;
        Node<E> next;
        public Node(E element,Node<E> next){
            this.element=element;
            this.next=next;
        }
    }
    @Override
    public void clear() {
        size=0;
        first=null;
    }

    @Override
    public boolean constains(E element) {
        return false;
    }

    @Override
    public void add(E element) {
        add(size,element);
    }

    @Override
    public E get(int index) {
        return node(index).element;
    }

    @Override
    public E set(int index, E element) {
         Node<E> node=node(index);
         E old=node.element;
        return old;
    }

    @Override
    public void add(int index, E element) {
        rangeCheckForAdd(index);
        if(index==0){
            first=new Node<> (element,first);
        }
        else {
            Node<E> prev=node(index-1);
            prev.next=new Node<>(element,prev.next);
        }
        size++;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        Node<E> node=first;
        if (index==0){
            first=first.next;
        }else{
            Node<E> pre=node(index-1);
            node=pre.next;
            pre.next=node.next;
        }
        size--;
        return node.element;
    }

    @Override
    public int indexOf(E element) {
        if (element==null){
            Node<E> node=first;
            for (int i=0;i<size;i++){
                if (node.element==null){
                    return i;
                }
                node=node.next;
            }
        }
        else {
            Node<E>node=first;
            for (int i=0;i<size;i++){
                if (element.equals(node.element)) return i;
                node=node.next;
            }
        }
        return  ELEMENT_NOT_FOUND;
    }

    //获得index之对应的元素
    private Node<E> node(int index){
        rangeCheck(index);
        Node<E> node=first;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    @Override
    public String toString() {
        StringBuilder string=new StringBuilder();
        string.append("size=").append(size).append(",[");
        Node<E> node=first;
        for(int i=0;i<size;i++){
            string.append(node.element);
            if (i!=size-1){
                string.append(",");
            }
            node=node.next;
        }
        string.append("]");
        return string.toString();
    }
}

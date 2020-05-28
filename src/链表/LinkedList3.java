package 链表;

public class LinkedList3<E> extends AbstractList<E>{
    private Node<E> first;
    private Node<E> last;
    private static class Node<E>{
        E element;
        Node<E> prev;
        Node<E> next;
        public Node( Node<E> prev,E element,Node<E> next){
            this.prev=prev;
            this.element=element;
            this.next=next;
        }
    }
    @Override
    public void clear() {
        size=0;
        first=null;
        last=null;
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
        if (index==size){
            Node<E> oldLast=last;
            last=new Node<>(oldLast,element,null);
            if (oldLast==null){
                first=last;
            }
            oldLast.next=last;
        }
        else {
            Node<E> next=node(index);
            Node<E> prev=next.prev;
            Node<E> node=new Node<>(prev,element,next);
            next.prev=node;
            if (prev==null){
                first=node;
            }
            else {
                prev.next=node;
            }
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
        Node<E> node;
        if (index<(size>>1)){
            node=first;
            for(int i=0;i<index;i++){
                node=node.next;
            }
        }
        else {
           node=last;
            for(int i=size-1;i>index;i--){
                node=node.prev;
            }
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

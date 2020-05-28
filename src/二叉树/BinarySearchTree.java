package 二叉树;

public class BinarySearchTree<E extends Comparable> {
    private int size;
    private Node<E> root;
    private Comparator<E> comparator;
    public BinarySearchTree(){
        this(null);
    }
    public BinarySearchTree(Comparator<E> comparator){
        this.comparator=comparator;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void clear(){

    }
    public void add(E element){
        elementNotNullCheck(element);
        if (root==null){
            root=new Node(element,null);
            size++;
            return;
        }
        //添加的不是第一个节点
        Node<E> parent=null;
        Node<E> node=root;
        int cmp=0;
        while (node!=null){
            parent=node;
            cmp=compare(element,node.element);
            if (cmp>0){
                node=node.right;
            }else if (cmp<0){
                node=node.left;
            }else {
                return;
            }
        }
        Node<E> newNode=new Node<>(element,parent);
        if (cmp>0){
            parent.right=newNode;
        }
        else {
            parent.left=newNode;
        }
        size++;
    }
    public void remove(E element){

    }
    public boolean contains(E element){
        return false;
    }
    public int compare(E element1,E element2){
        if (comparator!=null){
            return comparator.compare(element1,element2);
        }
        return ((Comparator<E>)element1).compareTo(element2);
    }
    private void elementNotNullCheck(E element){
        if (element==null){
            throw new IllegalArgumentException("element must not be null");
        }
    }
    public static class Node<E>{
        E element;
        Node<E> left;
        Node<E> right;
        Node<E> parent;
        public Node(E element,Node<E> parent){
            this.element=element;
            this.parent=parent;
        }
    }
}

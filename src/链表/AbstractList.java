package 链表;

public abstract  class AbstractList<E> implements List<E>{
    protected int size;
    //元素的数量
    public int size(){
        return size;
    }
    //是否为空
    public boolean isEmpty(){
        return size==0;
    }
    //是否包含某个元素
    protected boolean contains(E element){
        return indexOf(element)!=ELEMENT_NOT_FOUND;
    }
    //添加元素到尾部
    protected void outOfRange(int index){

        throw new IndexOutOfBoundsException("Index:"+index+",Size: "+size);
    }
    protected void rangeCheck(int index){
        if (index<0||index>=size){
            outOfRange(index);
        }
    }
    protected void rangeCheckForAdd(int index){
        if (index<0||index>size){
            outOfRange(index);
        }
    }

}

package 动态数组;

public class ArrayList<E> {
    //元素的数量
    private int size;
    //所有的元素
    private E[] elements;
    //静态保证内存永远只有一份
    private static final int DEFAULT_CAPACITY=3;
    private static final int ELEMENT_NOT_FOUND=-1;
    //构造函数，如果传值小于10，设为10
    public ArrayList(int capaticy){
        capaticy=capaticy<DEFAULT_CAPACITY?DEFAULT_CAPACITY:capaticy;
        elements= (E[]) new Object[capaticy];//一开始开辟位置的数量
    }
    //无参的构造函数，如果没有传值，那么默认有10个数组元素
    public ArrayList(){
        this(DEFAULT_CAPACITY);
    }
    //清除所有元素
    public void clear(){
        for(int i=0;i<size;i++){
            elements[i]=null;
        }
        size=0;
    }
    //元素的数量
    public int size(){
        return size;
    }
    //是否为空
    public boolean isEmpty(){
        return size==0;
    }
    //是否包含某个元素
    public boolean contains(E element){
        return indexOf(element)!=ELEMENT_NOT_FOUND;
    }
    //添加元素到尾部
    public void add(E element){
        add(size,element);
    }
    //返回index位置对应的元素
    public E get(int index){
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException("Index:"+index+",Size: "+size);
        }
        return elements[index];
    }
    //设置index位置的元素
    public E set(int index,E element){
        rangeCheck(index);
        E old=elements[index];
        elements[index]=element;
        return old;
    }
    //往index的位置添加元素
    public void add(int index,E element){
        rangeCheckForAdd(index);
        ensureCapacity(size+1);
        for (int i=size-1;i>=index;i--){
            elements[i+1]=elements[i];
        }
        elements[index]=element;
        size++;
    }
    //删除index位置对应的元素
    public E remove(int index){
        rangeCheck(index);
        E old=elements[index];
        for (int i=index+1;i<=size-1;i++){
            elements[i-1]=elements[i ];
        }
        size--;
        elements[size]=null;
        return old;
    }
    //查看元素的位置
    public int indexOf (E element){
        if (element==null){
            for (int i=0;i<size;i++){
                if (elements[i]==null){
                    return i;
                }
            }
        }
        else {
            for (int i=0;i<size;i++){
                if (element.equals(elements[i])) return i;
            }
        }

        return ELEMENT_NOT_FOUND;
    }
    private void ensureCapacity(int capacity){
        //oldCapacity是原来的容量
        int oldCapacity=elements.length;
        if (oldCapacity>=capacity) return;
        //新容量是旧容量的1.5倍
        int newCapacity=oldCapacity+(oldCapacity>>1);
        E[] newElements= (E[]) new Object[newCapacity];
        for(int i=0;i<size;i++){
            newElements[i]=elements[i];
        }
        elements=newElements;
        System.out.println(oldCapacity+"扩容为"+newCapacity);
    }
    public void outOfRange(int index){
        throw new IndexOutOfBoundsException("Index:"+index+",Size: "+size);
    }
    public void rangeCheck(int index){
        if (index<0||index>=size){
            outOfRange(index);
        }
    }
    public void rangeCheckForAdd(int index){
        if (index<0||index>size){
            outOfRange(index);
        }
    }

    @Override
    public String toString() {
        StringBuilder string=new StringBuilder();
        string.append("size=").append(size).append(",[");
        for(int i=0;i<size;i++){
            string.append(elements[i]);
            if (i!=size-1){
                string.append(",");
            }
        }
        string.append("]");
        return string.toString();
    }
}

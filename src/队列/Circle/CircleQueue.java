package 队列.Circle;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class CircleQueue<E> {
    private int size;
    private int front;
    private E[] elements;
    private static final int DEFAULT_CAPACITY=10;

    public CircleQueue(){
        elements= (E[]) new Object[DEFAULT_CAPACITY];
    }
    public int size(){
        return size;
    }
    public void clear(){
        for (int i=0;i<size;i++){
          //  elements[index(i)]=null;
        }
        front=0;
        size=0;
    }
    public boolean isEmpty(){

        return size==0;
    }
    public void enQueue(E element){
        elements[(front+size)%elements.length]=element;
        size++;
    }
    public E deQueue(){
        E frontElement=elements[front];
        elements[front]=null;
        front=(front+1)%elements.length;
        size--;
        return frontElement;
    }
    public E front(){
        return elements[front];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("capacity=").append(elements.length).append("size=").append(size).append(",[");
        for(int i=0;i<elements.length;i++){
            if (i!=0){
                stringBuilder.append(",");
            }
            stringBuilder.append(elements[i]);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

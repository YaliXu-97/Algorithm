//package 队列.Circle;
//
//public class CircleDequeue<E> {
//    private int size;
//    private int front;
//    private E[] elements;
//    private static final int DEFAULT_CAPACITY=10;
//
//    public CircleDequeue(){
//
//        elements= (E[]) new Object[DEFAULT_CAPACITY];
//    }
//    public int size(){
//        return size;
//    }
//    public boolean isEmpty(){
//        return size==0;
//    }
//
//    /**
//     * 从尾部入队
//     * @param element
//     */
//    public void enQueueRear(E element){
//        list.add(element);
//    }
//
//    /**
//     * 从头部入队
//     * @param element
//     */
//    public void enQueueFront(E element){
//        list.add(0,element);
//    }
//
//    /**
//     * 从尾部出队
//     * @return
//     */
//    public E deQueueRear(){
//        return list.remove(list.size()-1);
//    }
//
//    /**
//     * 从头部出队
//     * @return
//     */
//    public E deQueueFront(){
//        return list.remove(0);
//    }
//    public E Front(){
//        return list.get(0);
//    }
//    public E rear(){
//        return list.get(list.size()-1);
//    }
//}

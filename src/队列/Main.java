package 队列;

import 队列.Circle.CircleQueue;

public class Main {
    static void test1(){
        //        Queue<Integer> queue=new Queue<>();
//        queue.enQueue(11);
//        queue.enQueue(22);
//        queue.enQueue(33);
//        queue.enQueue(44);
//        while (!queue.isEmpty()){
//            System.out.println(queue.deQueue());
//        }
        Dequeue<Integer> queue =new Dequeue<>();
        queue.enQueueFront(11);
        queue.enQueueFront(22);
        queue.enQueueRear(33);
        queue.enQueueRear(44);
        while (!queue.isEmpty()){
            System.out.println(queue.deQueueFront());
        }
    }
    public static void main(String args[]){
        test2();
    }
    static void test2(){
        CircleQueue<Integer> queue=new CircleQueue<Integer>();
        for(int i=0;i<10;i++){
            queue.enQueue(i);
        }
        for (int i=0;i<5;i++){
            queue.deQueue();
        }
//        for(int i=15;i<20;i++){
//            queue.enQueue(i);
//        }
        System.out.println(queue);
        while (!queue.isEmpty()){
            System.out.println(queue.deQueue());
        }
    }
}

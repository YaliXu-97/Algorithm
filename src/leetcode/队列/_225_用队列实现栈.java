package leetcode.队列;


import jdk.internal.org.objectweb.asm.tree.IincInsnNode;

import java.util.LinkedList;
import java.util.Queue;

public class _225_用队列实现栈 {
   Queue<Integer> inQueue=new LinkedList<>();
   Queue<Integer> outQueue=new LinkedList<>();
   private int top;
    /** Initialize your data structure here. */
    public _225_用队列实现栈() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        outQueue.add(x);
        while (!inQueue.isEmpty()){
            outQueue.add(inQueue.remove());
        }
        Queue<Integer> temp=inQueue;
        inQueue=outQueue;
        outQueue=temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return inQueue.remove();
    }

    /** Get the top element. */
    public int top() {
        return inQueue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return inQueue.isEmpty()&&outQueue.isEmpty();
    }
}

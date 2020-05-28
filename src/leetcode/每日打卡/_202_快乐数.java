package leetcode.每日打卡;

import java.util.*;

public class _202_快乐数 {
    public static void main(String args[]){
        _202_快乐数 list=new _202_快乐数();
        list.isHappy(19);
    }
    //利用hashset检验
    public boolean isHappy1(int n) {
        int sum=0;
        int i;
        Set <Integer> set=new HashSet<>();
        while (n!=1&&!set.contains(n)){
            sum=0;
            set.add(n);
            while (n>0){
                i=n%10;
                n=n/10;
                sum+=i*i;
            }
            n=sum;
        }
        return n==1;
    }
    //利用快慢指针
    public int getNext(int n){
        int sum=0,i;
        while (n>0){
            i=n%10;
            sum+=i*i;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n){
        int slow=n;
        int fast=getNext(n);
        while (fast!=1&&slow!=fast){
            slow=getNext(slow);
            fast=getNext(getNext(fast));
        }
        return fast==1;
    }

}

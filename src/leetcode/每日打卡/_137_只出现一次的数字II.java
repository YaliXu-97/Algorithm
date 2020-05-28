package leetcode.每日打卡;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _137_只出现一次的数字II {
    public int singleNumber(int[] nums) {
        Set<Long> set = new HashSet<>();
        long sum1 = 0,sum2 = 0;
        for (int num : nums) {
            sum1 += num;
            set.add((long)num);
        }
        //Iterator<Integer> it = set.iterator();
//        while (it.hasNext()){
//            sum2+=it.next();
//        }
       for (Long n:set){
           sum2+=n;
       }
        System.out.println((sum2*3-sum1)/2);
        return (int)(sum2*3-sum1)/2;
    }
}

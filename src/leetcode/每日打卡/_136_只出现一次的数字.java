package leetcode.每日打卡;

import java.util.*;

public class _136_只出现一次的数字 {
//    public int singleNumber(int[] nums) {
//        Set<Integer> map=new HashSet<Integer>();
//        for (int i=0;i<nums.length;i++){
//            if (map.contains(nums[i])){
//                map.remove(nums[i]);
//            }else {
//                map.add(nums[i]);
//            }
//        }
//        Iterator<Integer> it = map.iterator();
//        //System.out.println(it.next());
//        return it.next();
//    }
    //这道题最好用异或来做
public int singleNumber(int[] nums) {
    int single=0;
    for (int num:nums){
        single^=num;
    }
    System.out.println(single);
    return single;
}
}

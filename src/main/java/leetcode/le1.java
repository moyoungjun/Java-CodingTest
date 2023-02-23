package leetcode;

import java.util.Arrays;
import java.util.Hashtable;

public class le1 {
    public static void main(String args[]) {
        int nums[] = {1,2,3,6};
        int target = 3;
        int ans[] = new int [2];
        Hashtable<Integer,Integer> hash = new Hashtable<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(hash.containsKey(target-nums[i])){
                 ans[0]=hash.get(target-nums[i]);
                 ans[1]=i;
            }
            hash.put(nums[i],i);
        }

    System.out.println(Arrays.toString(ans));
    }

}

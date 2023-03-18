package programmers;

import java.util.HashSet;

public class pro1_poketmon {
    public static void main(String agrs[]) {
        int [] nums = {2,2,3,3};
        int leng = nums.length/2;
        int answer = 0;
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0; i<nums.length; i ++) {
            hash.add(nums[i]);
        }
        if(leng < hash.size()) System.out.println(answer = leng);
        else System.out.println(leng);
        System.out.println(hash);
    }
}

package leetcode;

import java.util.Arrays;

public class le27_RemoveElement {
    public static void main(String[] args) {
        int [] nums = {3,2,2,3};
        int val = 3;
        int [] ex = new int[]{};
        System.out.println(Arrays.toString(ex));
        int count = 0;
        for(int i=0; i<nums.length;i++) {
            if(nums[i]==val) {
                nums[i] = 51;
                count ++;
            }
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums.length-count);
    }
}

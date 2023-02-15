package leetcode;

public class le1480 {
    public static void main(String args[]){
        int[] nums = {1,2,3,4};

        int [] S = new int[nums.length];
        S[0] = nums[0];
        for(int i=1; i < nums.length; i++) {
            S[i] = nums[i] + S[i-1];
        }

    }
}

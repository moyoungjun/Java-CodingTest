package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class le26_test3 {
    public static void main(String[] args){
        int [] nums = {0,0,1,1,2,3};
        ArrayList<Integer> result = new ArrayList<Integer>();
//        List<Integer> test = Arrays.stream(nums).distinct().boxed().collect(Collectors.toList());
        Arrays.stream(nums).distinct().forEach(result::add);
//        System.out.println(result);
        for(int i = result.size(); i<nums.length; i++){
            result.add(i);
        }
        for(int i=0; i < nums.length; i++){
            nums[i] = result.get(i);
            System.out.println(nums[i]);
        }
    }
}

package programmers;

import java.util.Arrays;
import java.util.Stack;

public class pro2_boat {
    public static void main(String args[]) {
        int [] people = {70, 80, 50,50};
        int limit  = 100;
        Stack<Integer> st = new Stack<>();
        Arrays.sort(people);
        int i =0;
        int count = 0;
        for(int j= people.length-1; i<=j;j--) {
            if(people[i]+people[j] <= limit) {
                i++;
            }
            count++;
        }
        System.out.println(count);


    }
}

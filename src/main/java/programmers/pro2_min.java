package programmers;

import java.util.Arrays;

public class pro2_min {
    public static void main(String args[]){
            int [] A = {1,4,2};
            int [] B = {5,4,4};
            Arrays.sort(A);
            Arrays.sort(B);
            int answer = 0;
            for(int i=0; i<A.length; i++) {
                    answer = A[i]*B[(A.length-1)-i] + answer;
            }
            System.out.println(answer);
    }
}

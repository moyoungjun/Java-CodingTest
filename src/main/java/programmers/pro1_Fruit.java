package programmers;

import java.util.Arrays;

public class pro1_Fruit {
    public static void main(String args[]) {
        int k=4;
        int m=3;
        int [] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        Arrays.sort(score);
        int answer = 0;
        for(int i=0; i<score.length/m; i++) {
            if(i==0) {
                answer = score[score.length - m] * m + answer;
            }
            else {
                answer = score[score.length - (m*(i+1))] * m + answer;
            }
        }
        System.out.println(answer);
    }
}

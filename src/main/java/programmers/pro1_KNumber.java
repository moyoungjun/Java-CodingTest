package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class pro1_KNumber {
    public static void main(String args[]) {
        int [] array = {1,5,2,6,3,7,4};
        int [][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int [] answer = new int[commands.length];
        for(int i=0; i<commands.length;i++) {
            int start = commands[i][0]-1; // 1 3 0
            int end = commands[i][1]-1;   // 4 3 6
            ArrayList<Integer> s = new ArrayList<Integer>();
            for(int j =start; j <=end; j++) {
                s.add(array[j]);
            }
            Collections.sort(s);
            answer[i] = s.get(commands[i][2] - 1);
        }
        System.out.println(Arrays.toString(answer));
    }
}

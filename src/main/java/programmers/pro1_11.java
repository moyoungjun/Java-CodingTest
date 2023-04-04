package programmers;

import java.util.Stack;

public class pro1_11 {
    public static void main(String args[]) {
        int[] answer = {1, 1, 3, 3, 0, 5, 0, 1, 1};
        Stack<Integer> st = new Stack<Integer>();
        int s = -1;

        int [] answers ;
        for(int j: answer) {
            if(j != s) {
                st.push(j);
                s=j;
            }
        }
        answers = st.stream().mapToInt(i->i).toArray();
    }
}

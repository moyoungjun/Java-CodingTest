package programmers;

import java.util.Stack;

public class pro1_7hambugur {
    public static void main(String args[]) {
        int [] ex = new int[]{2,1,1,2,3,1,2,3,1};
        Stack<Integer> st = new Stack<>();
        int count =0 ;
        for(int i =0 ; i<ex.length; i++) {
            st.push(ex[i]);
            int size = st.size();
            if(st.size()>=4) {
                if (st.get(size - 1) == 1 && st.get(size - 2) == 3
                        && st.get(size - 3) == 2 && st.get(size - 4) == 1) {
                    count++;
                    st.pop();
                    st.pop();
                    st.pop();
                    st.pop();
                }
            }
        }
        System.out.println(count);
    }
}

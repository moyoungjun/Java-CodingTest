package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class pro1_distinct {
    public static void main(String args[]) {
        int [] a ={1,1,2,3,4,4,4};
        int [] b = {};
        ArrayList d = new ArrayList<Integer>();
        int index = 0;
        for(int i=0; i < a.length; i++) {
                if(a[i] != a[i+1]) {
                   d.add(index,a[i]);
                   index++;
                }
        }

        System.out.println(d);
    }
}

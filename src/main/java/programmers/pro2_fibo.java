package programmers;

import java.util.Arrays;

public class pro2_fibo {
    public static void main (String args[]) {
        int n = 2;
        int[] fibo = new int[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        int sum = 0;
        for(int i=2; i<=n;i++) {
            sum = fibo[i-2]+fibo[i-1];
            fibo[i] = sum %1234567;
        }
        System.out.println(Arrays.toString(fibo));
        System.out.println(sum);
    }

}

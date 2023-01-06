package leetcode;

public class le70 {
    public static void main(String args[]) {
        int n =2;
        int[] sum = new int[n+1];
        sum[0] =1;
        sum[1]=1;
        for(int i=2;i<=n;i++){

            sum[i] = sum[i-2] + sum[i-1];
        }
        System.out.println(sum[n]);
    }
}

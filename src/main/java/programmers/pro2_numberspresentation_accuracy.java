package programmers;

public class pro2_numberspresentation_accuracy {
    public static void main(String args[]) {
        int n = 15;
        int[] sum = new int[n];
        int count = 1;
        int left = 0;
        for(int i= 1; i<n; i ++){
            sum[i] = sum[i-1] + i;
            if(sum[i] == n){
                count ++;
            }
        }
        for(int i=1; i<n;i++){
            for(int j=i+1; j<n-1;j++) {
                if(sum[j]-sum[i] == n) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

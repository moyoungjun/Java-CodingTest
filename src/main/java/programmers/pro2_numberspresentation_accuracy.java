package programmers;

public class pro2_numberspresentation_accuracy {
    public static void main(String args[]) {
        int n = 15;
        int count = 1;
        for(int i=1; i<=n;i++){
            int sum = i;
            for(int j=i+1; j<=n;j++) {
                sum = sum + j;
                if(sum == n) {
                    count++;
                    break;
                } else if (sum>n) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

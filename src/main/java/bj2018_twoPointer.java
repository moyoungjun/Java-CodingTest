import java.util.Scanner;

public class bj2018_twoPointer {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int start = 1;
        int end = 1;
        int sum = 1;
        int count =1;
        while(end != t){
            if(sum==t){
                end ++;
                count++;
                sum = sum+end;
            } else if(sum>t){
                sum = sum-start;
                start ++;
            } else {
                end ++;
                sum = sum+end;
            }
        }
        System.out.println(count);

    }
}

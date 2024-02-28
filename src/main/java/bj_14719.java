import java.util.Scanner;

public class bj_14719 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int []arr = new int[w+1];
        int ans = 0;
        for(int i=0; i<w;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<w-1; i++) {
            int cur = arr[i];
            int l = 0;
            int r = 0;
            //왼쪽벽
            for(int j=i-1; j >= 0; j--) {
                if(arr[j] > cur) {
                    l = Math.max(l, arr[j]);
                }
            }
            //오른쪽벽
            for(int j=i+1; j<w; j++) {
                if(arr[j] >cur) {
                    r = Math.max(arr[j], r);
                }
            }
            //왼,오른쪽 벽이 현재벽보다 클때 더하기
            if(Math.min(l,r) > cur) {
                ans = ans + (Math.min(l,r) - arr[i]);
            }
        }

    }
}

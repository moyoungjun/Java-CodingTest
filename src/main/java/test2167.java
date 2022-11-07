import java.util.Scanner;

public class test2167 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i =0 ; i<n; i++){
            for(int j =0; j<m; j++){
               arr[i][j] = sc.nextInt();
            }
        }
        int s = sc.nextInt();
        while(s-- >0){
            int sum = 0;
            int o = sc.nextInt();
            int p = sc.nextInt();
            int k = sc.nextInt();
            int w = sc.nextInt();
            for(int q = o-1 ; q<k; q++){
                for(int j=p-1;j<w; j++){
                    sum = arr[q][j]+sum;
                }

            }
            System.out.println(sum);


        }

    }
}

import java.util.Scanner;

public class test2167 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(n);
        int[][] arr = new int[n][m];
        for(int i =0 ; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
               arr[i][j] = sc.nextInt();
            }
        }
        int s = sc.nextInt();
        for(int i =0 ; i < s; i++){
            int o = sc.nextInt();
            int p = sc.nextInt();
            int k = sc.nextInt();
            int w = sc.nextInt();
            int i1 = arr[o][p];
            int i2 = arr[k][w];


        }

    }
}

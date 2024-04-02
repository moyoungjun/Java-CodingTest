import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class bj_1268 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = sc.nextInt();
        int[][] arr = new int[a][5];
        int[][] same = new int [a][5];
        for(int i=0; i < a;i++) {
            for(int j=0; j<5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max =0;
        int leader = 0;
        for(int i=0; i< a;i++) {
            Set<Integer> set = new HashSet<>();
            for(int j=0; j<5;j++) {
                for(int k=0; k <a; k++) {
                    if(i != k && arr[k][j] == arr[i][j]) {
                        set.add(k);
                    }
                }
            }
            if(set.size() > max) {
                leader = i;
                max = set.size();
            }
        }
        System.out.println(leader + 1);
    }
}

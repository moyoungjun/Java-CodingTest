import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj11659  {
    public static void main(String args[])throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringT =
                new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringT.nextToken());
        int quNo = Integer.parseInt(stringT.nextToken());
        long[] S = new long[suNo+1];
        stringT = new StringTokenizer(bufferedReader.readLine());
        //합 배열 S 만들기
        for(int i=1;i<=suNo; i++){
            S[i] = S[i-1] + Integer.parseInt(stringT.nextToken());
        }
        // 질의 범위 받고 구간합 구하기
        for(int q =0; q < quNo; q++){
            stringT = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringT.nextToken());
            int j = Integer.parseInt(stringT.nextToken());
            System.out.println(S[j] - S[i-1]);
        }

    }
}

package codility;

import java.util.Arrays;

public class ArrayLotation {
    public static void main(String args[]) {
        int A[] = {3, 8, 9, 7, 6};
        int B[] = A;
        int temp = 0;
        int K=3;
        for(int i=0; i<K;i++){
            for(int j=B.length-1;j>0;j--){
                temp = B[j-1];
                B[j-1] = B[j];
                B[j] = temp;
            }
        }
    }
}

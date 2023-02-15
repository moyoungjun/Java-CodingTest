package leetcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class le1672 {
    public static void main(String[] args) {
        int [][] accounts = {{1,2,7},{3,2,1}};
        int len =accounts[0].length;
        int len2 = accounts.length;

        int [] re = new int[len2];
        for(int i=0; i<len2;i++){
            for(int j=0; j< len; j++) {
                re[i] = accounts[i][j] + re[i];
            }
        }

        int max =0 ;
        for (int j : re) {
            if (max < j) {
                max = j;
            }
        }


    }
}

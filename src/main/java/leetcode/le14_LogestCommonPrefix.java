package leetcode;

import java.util.Arrays;

public class le14_LogestCommonPrefix {
    public static void main(String args[]) {
        String[] strs = {"bcb","acb","acbd"};

        System.out.println(strs[0].indexOf(strs[1]));
        String pre = strs[0];
        int i=1;
        while(i<strs.length) {
            while(strs[i].indexOf(pre) != 0){
                pre = pre.substring(0,pre.length()-1);
            }
            i++;
        }
        System.out.println(pre);
    }
}

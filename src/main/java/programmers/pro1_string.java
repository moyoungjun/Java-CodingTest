package programmers;

import java.util.Arrays;

public class pro1_string {
    public static void main(String[] args) {
        String s = "try hellow world";
        String s2 ;
        String[] arrays = s.split("");
        int idx = 0;
        System.out.println(Arrays.toString(arrays));
        String answer="";
        for(int i=0 ; i<arrays.length;i++) {
                if(arrays[i].equals(" ")) {
                    idx=0;
                    answer = answer + " ";
                }
                else if(idx%2==0) {
                    answer = answer + arrays[i].toUpperCase() ;
                    idx++;
                }
                else {
                    answer = answer +  arrays[i].toLowerCase();
                    idx++;
                }
                System.out.println(answer);

        }
        System.out.println(Arrays.toString(arrays));
    }
}

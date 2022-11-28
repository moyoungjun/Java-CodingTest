package programmers;

import java.util.ArrayList;
import java.util.Arrays;


public class pro1 {
    public static void main(String[] args){
        int [] score = {10,100,20,150,1,100,200};
        int a =3;
        int b=7;
        int min ;
        int minIndex=0;

        int [] answer = new int[a];
        ArrayList test = new ArrayList();
        for(int i=0; i< score.length; i++){
            if(i<a)
            {
                answer[i] = score[i];
                test.add(answer[0]);

            }
            else {
                if(answer[0] < score[i]){
                    answer[0] = score[i];
                    Arrays.sort(answer);
                }
                test.add(answer[0]);


            }


        }


        System.out.println(test);
    }
}

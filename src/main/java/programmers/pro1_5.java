package programmers;

public class pro1_5 {
    public static void main(String args[]){
        int [] food = {1, 7, 1, 2};
        String answer = "";
        for(int i=1; i < food.length; i++){
            int ite;
            ite = food[i]/2;
            for(int j=0; j < ite; j++){
                answer = answer+i;
            }
        }
        StringBuffer sb = new StringBuffer(answer);
        String reS = sb.reverse().toString();
        System.out.println(answer + "0" + reS);

    }
}

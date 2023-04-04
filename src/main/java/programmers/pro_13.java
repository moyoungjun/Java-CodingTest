package programmers;

public class pro_13 {
    public static void main(String args[]){
        int left = 13;
        int right = 17;
        int left2 = left;
        int sum =0;
        for(int i=0; i <=right-left;i++) {
            int sq = (int)(Math.sqrt(left2));
            if(sq*sq == left2) {
                sum = sum-left2;
            } else {
                sum = sum + left2;
            }
            left2++;
        }
    }
}

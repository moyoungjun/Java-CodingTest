package programmers;

public class pro1_rectangle {
    public static void main(String[] args) {
        int[][] sizes2 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int big = 0;
        int big2 = 0;
        for (int i = 0; i < sizes2.length; i++) {
            if (sizes2[i][0] < sizes2[i][1]) {
                int temp;
                temp = sizes2[i][1];
                sizes2[i][1] = sizes2[i][0];
                sizes2[i][0] = temp;
            }
        }
        for (int i = 0; i < sizes2.length; i++) {
            if (sizes2[i][0] > big) {
                big = sizes2[i][0];
            }
            if (sizes2[i][1] > big2) {
                big2 = sizes2[i][1];
            }
        }
        System.out.println("big:" + big + "big2:" + big2);

    }
}

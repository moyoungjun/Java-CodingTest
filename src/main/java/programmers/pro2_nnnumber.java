package programmers;

public class pro2_nnnumber {
    public static void main(String args[]) {
        int n = 15;

        int x = n+1;

        int start = two(n);
        int end = two(x);
        while(start == end) {
            x++;
            System.out.println(x);
        }
        System.out.println(x);

    }

    public int two(int n) {
        boolean bo = true;
        int sum = 0;
        int i =0;
        while(bo){
            if(n==0) {
                bo=false;
            }
            sum = sum + n%2;
            n = n/2;
            i++;
        }
        return sum;
    }
}

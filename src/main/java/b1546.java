public class b1546 {
    public static void main(String args[]){
        int [] ar = new int[]{40,80,60};
        int sc = 3;
        double sum = 0;
        double max = 0;
        for(int num: ar){
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);
        for(int i=0; i< sc; i ++){
            sum = sum + (ar[i]/max *100);
            System.out.println(sum);
        }
        System.out.println(sum/3);

    }
}

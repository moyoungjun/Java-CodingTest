import java.util.ArrayList;
import java.util.Scanner;

public class bj_1032 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        ArrayList<String> al = new ArrayList<String>();
        for(int i=0; i< t; i++) {
            al.add(sc.next());
        }
        boolean df = true;
        for(int i=0; i<al.get(0).length(); i++) {

            for(int j=0; j<t;j++) {
                if(al.get(j).charAt(i) != al.get(0).charAt(i)){
                    df = false;
                    break;
                }
            }
            if(df) {
                System.out.print(al.get(0).charAt(i));
            } else {
                System.out.print('?');
                df = !df;
            }
        }

    }
}

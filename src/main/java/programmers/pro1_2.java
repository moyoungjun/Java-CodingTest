package programmers;

public class pro1_2 {
    public static void main(String args[]){
        String s = "abracadabra";
        char[] d = s.toCharArray();
        int a=0,b=0,c=0, answer =0 ;
        for(int i=0;i<s.length();i++){
            if(d[c] != d[i]){
                a++;
            }
            else{
                b++;
            } System.out.println("a:"+a+"b:"+b+"c:"+c);
            if(a==b){
                c=i+1;
                a=0;b=0;
                answer ++;
            }
            else if (i==s.length()-1){
                answer ++;
            }
        }
    }

}

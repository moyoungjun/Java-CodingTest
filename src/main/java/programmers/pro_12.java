package programmers;

public class pro_12 {
    public static void main(String[] args) {
        String st = "pPooyY";
        st = st.toLowerCase();
        int pcount = 0;
        int ycount = 0;
        for(int i= 0; i<st.length();i++){
            if(st.charAt(i) =='p') {
                pcount++;
            } else if (st.charAt(i)=='y'){
                ycount++;
            }
        }
        System.out.println("pcount:"+pcount+"ycount:"+ycount);
    }
}

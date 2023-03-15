package leetcode;

public class le58_lengthoflastword {
    public static void main(String args[]) {
        String s = "h wor";
        String[] a = s.split(" ");
        int le = a.length -1;
        System.out.println(a[le].length());
    }
}

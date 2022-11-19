package leetcode;

public class le387 {
    public static void main(String args[]){
        String s = "lleetccode";
        int alphabet[] = new int[26];
        for(int i=0; i<s.length(); i++){
            alphabet[s.charAt(i)-'a']++;
        }
        for(int i=0; i<s.length();i++){
            if(alphabet[s.charAt(i)-'a']==1){
                System.out.println(i);
            }
        }

    }
}

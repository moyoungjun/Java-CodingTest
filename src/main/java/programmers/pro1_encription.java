package programmers;

public class pro1_encription {
    public static void main(String[] args) {
        String s = "a bzc";
        int n = 1;
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                answer = answer + ch;
            }
            if (ch >= 'a' && ch <= 'z') {
                if (ch + n > 'z') {
                    answer = answer + (char) (ch - 26 + n);
                } else {
                    answer = answer + (char) (ch + n);
                }
            } else if( ch>='A' && ch<='Z'){
                if (ch + n > 'Z') {
                    answer = answer + (char) (ch - 26 + n);
                } else {
                    answer = answer + (char) (ch + n);
                }
            }
        }
        System.out.println(answer);

    }
}

package leetcode;

import java.util.Stack;

public class le20_ValidPaerntheses {
    public static void main(String args[]) {
        String s = "{}()";
        int len = s.length();
        boolean ans = true;
        if(len % 2 != 0) {ans= false;}

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < len; i++) {
            char curn = s.charAt(i);

            if(curn == '(' || curn == '{' || curn == '[') {
                stack.push(curn);
            }

            else if(stack.size() == 0) {ans= false;}

            else if(curn == ')') {
                if(stack.pop() != '(') {ans= false;}
            }
            else if(curn == '}') {
                if(stack.pop() != '{') {ans= false;}
            }
            else if(curn == ']') {
                if(stack.pop() != '[') {ans= false;}
            }
        }
        ans= stack.size() == 0;
    }
}

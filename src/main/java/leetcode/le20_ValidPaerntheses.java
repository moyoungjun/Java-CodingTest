package leetcode;

import java.util.Stack;

public class le20_ValidPaerntheses {
    public static void main(String args[]) {
        String s = "(){}";
        Stack<String> stack = new Stack<>();
        stack.push(s);
        System.out.println(stack.get(0));
//        for(int i= s.length()-1; i > 0; i--) {
//            if(s.substring(i - 1, i).equals(stack.elementAt(i))){
//                stack.pop();
//            }
//        }
        System.out.println(stack);
    }
}

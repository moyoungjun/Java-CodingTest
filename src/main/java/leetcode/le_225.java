package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class le_225 {

    private Queue<Integer> que1;

    public static void main(String args[]) {
        le_225 myStack = new le_225();
        System.out.println(myStack.empty());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.pop();
        myStack.push(4);
        myStack.push(5);
        System.out.println(myStack.peek2());
    }


    //생성자 호출
    public le_225 () {
        this.que1 = new LinkedList<>();
    }
    public void push(int x) {
        que1.add(x);
        int size = que1.size();
        while(size>1) {
            que1.add(que1.remove());
            size--;
        }
        System.out.println(que1);
    }

    public int pop() {
        return que1.remove();
    }

    public int top() {
        return 2;
    }

    public int peek2() {
        return que1.peek();
    }
    public boolean empty() {
        return que1.isEmpty();
    }
}

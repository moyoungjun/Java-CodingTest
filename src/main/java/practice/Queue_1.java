package practice;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Queue_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            queue.add(i);
        }
        while(queue.size()>1) {
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());
    }
}

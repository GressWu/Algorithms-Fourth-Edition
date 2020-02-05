package package_stack_queue;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class QueueClass {
    public static void main(String[] args) {
        Queue<Integer> que=new Queue<>();
        while (!StdIn.isEmpty())
        {
            que.enqueue(StdIn.readInt());
        }
        int len=que.size();
        int[] a=new int[len];
        for(int i=0;i<len;i++)
        {
            a[i]=que.dequeue();
        }
        System.out.println(Arrays.toString(a));
    }
}

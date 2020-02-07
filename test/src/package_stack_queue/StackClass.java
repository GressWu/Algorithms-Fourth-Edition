package package_stack_queue;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        while (!StdIn.isEmpty())
        {
            st.push(StdIn.readInt());
        }
        for (Integer integer : st) {
            System.out.println(integer);         //迭代也会按照栈的特性来迭代的
        }
    }
}

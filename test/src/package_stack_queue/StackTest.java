package package_stack_queue;

import edu.princeton.cs.algs4.StdIn;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();
        while (!StdIn.isEmpty())
        {
            String s=StdIn.readString();
            if(!s.equals("-"))
            {
                st.push(s);
            }
            else if(!s.isEmpty())
            {
                System.out.print(st.pop()+" ");
            }
        }
        System.out.println("长度为："+st.size());
    }
}

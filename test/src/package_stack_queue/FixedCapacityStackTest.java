package package_stack_queue;

import edu.princeton.cs.algs4.StdIn;

public class FixedCapacityStackTest {
    public static void main(String[] args) {
        FixedCapacityStack<String> tom = new FixedCapacityStack<>(20);
        while (!StdIn.isEmpty())
        {
            String item=StdIn.readString();
            if(!item.equals("-"))
                tom.push(item);
            else if(!tom.isEmpty())
                System.out.println(tom.pop()+" ");
        }
        System.out.println("现在栈剩下的元素数量："+tom.size());
    }
}

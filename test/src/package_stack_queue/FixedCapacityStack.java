package package_stack_queue;

public class FixedCapacityStack<Item> {
    private Item[] a;
    private int N;                 //size
    public FixedCapacityStack(int cap)
    {
        a=(Item[]) new Object[cap];         //构造方法创建定长泛型数组
    }
    public boolean isEmpty()
    {
        return N==0;                        //判断数组是否为空
    }
    public int size()
    {
        return N;
    }
    public void push(Item item)
    {
        a[N++]=item;                        //入栈
    }
    public Item pop()
    {
        return a[--N];
    }

}

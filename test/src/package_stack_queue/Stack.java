package package_stack_queue;

public class Stack<Item> {
    private Node first;       //这里private已经将Node节点类封装  相当于带头节点
    private int N;//链表长度

    public class Node {          //链表节点
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first.next == null;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        return item;

    }

}

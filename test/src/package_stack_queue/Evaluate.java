package package_stack_queue;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> opt=new Stack<>();
        Stack<Double> vals=new Stack<>();
        Stack<?> sd=new Stack<>();

        while (!StdIn.isEmpty())
        {
            String s=StdIn.readString();
          if(s.equals("("));
          else if(s.equals("+")) opt.push("+");
          else if(s.equals("-")) opt.push("-");
          else if(s.equals("*")) opt.push("*");
          else if(s.equals("/")) opt.push("/");
          else if(s.equals("sqrt")) opt.push("sqrt");
          else if(s.equals(")"))
          {
              String op=opt.pop();
              double v=vals.pop();
              if(op.equals("+")) v+=vals.pop();
             else if(op.equals("+")) v+=vals.pop();
             else if(op.equals("-")) v-=vals.pop();
             else if(op.equals("*")) v*=vals.pop();
             else if(op.equals("/")) v/=vals.pop();
             else if(op.equals("sqrt")) v=Math.sqrt(v);
             vals.push(v);
          }
          else vals.push(Double.parseDouble(s));
        }
        System.out.println(vals.pop());
    }
}

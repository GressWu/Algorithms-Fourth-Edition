package package_stack_queue;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;

public class Bagclass {
    public static void main(String[] args) {
        Bag<Double> nums=new Bag<>();
        while (!StdIn.isEmpty())                                                        //按ctrl+D完成输入
        {
            nums.add(StdIn.readDouble());
        }
        double sum=0;
        double mean;
        double result=0;
        double Std;
        for (Double num : nums) {
           sum+= num;
        }
        mean=sum/nums.size();
        for (Double num : nums) {
            result+=(num-mean)*(num-mean);
        }
        Std=Math.sqrt(result);
      //  System.out.println(sum);
        System.out.println(mean);
        System.out.println(Std);
    }
}

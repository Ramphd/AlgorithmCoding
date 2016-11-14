package stack_array;

import java.util.Stack;

/**
 * Created by hzliyue1 on 2016/11/14,20:18.
 */
public class MyStackTwo {
    
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;
    
    public MyStackTwo() {
        
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }
    
    public void push(int newNum) {
        
        if (this.stackMin.isEmpty()) {
            stackMin.push(newNum);
        } else if (newNum <= this.getMin()) {
            stackMin.push(newNum);
        }else{
            int newMin = this.stackMin.peek();
            this.stackMin.push(newMin);
        }
        this.stackData.push(newNum);
    }
    
    public int pop() {
        
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("ur stack is empty");
        }
        this.stackMin.pop();
        return this.stackData.pop();
    }
    
    public int getMin() {
        
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("ur stack is empty");
        }
        return this.stackMin.peek();
    }
}

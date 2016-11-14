package stack_array;

import java.util.Stack;

/**
 * Created by hzliyue1 on 2016/11/14,19:53.
 * 设计一个栈，可以使用已有的栈的实现，完成pop，push和getMin操作
 */
public class MyStackOne {
    
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;
    
    public MyStackOne() {
        
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }
    
    public void push(int newNum) {
        
        if (this.stackMin.isEmpty()) {
            stackMin.push(newNum);
        } else if (newNum <= this.getMin()) {
            stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }
    
    public int pop() {
        
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("ur stack is empty");
        }
        int value = this.stackData.pop();
        if (value == this.getMin()) {
            this.stackMin.pop();
        }
        return value;
    }
    
    public int getMin() {
        
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("ur stack is empty");
        }
        return this.stackMin.peek();
    }
}

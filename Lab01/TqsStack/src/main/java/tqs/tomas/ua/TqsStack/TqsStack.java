package tqs.tomas.ua.TqsStack;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class TqsStack {
    private ArrayList<Double> stack;
    private Integer MAX_SIZE;
    // [0, 1, 2, 3]
    // TOP: 3 --> last number
    // BOT : 0 --> first number


    public TqsStack(Integer MAX_SIZE) {
        stack = new ArrayList<>();
        this.MAX_SIZE = MAX_SIZE;
    }

    public TqsStack() {
        stack = new ArrayList<>();
    }

    // add an item on the top
    public void push(Double number){
        if (MAX_SIZE != null && MAX_SIZE == stack.size()){
                throw new IllegalStateException();
        }
        stack.add(number);
    }

    // remove the item at the top
    public Double pop(){
        if (stack.size() == 0) {
            throw new NoSuchElementException();
        }
        Double last_num = stack.get(stack.size()-1);
        stack.remove(last_num);
        return last_num;
    }

    // return the item at the top (without removing it)
    public Double peek(){
        if (stack.size() == 0){
            throw new NoSuchElementException();
        }
        return stack.get(stack.size()-1);
    }

    // return the number of items in the stack
    public Integer size(){
        return stack.size();
    }

    // return the number of items in the stack
    public boolean isEmpty(){
        return stack.size() == 0;
    }
}

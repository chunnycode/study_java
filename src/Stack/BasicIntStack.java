package Stack;

import java.util.EmptyStackException;

/*
* Int 배열의 스택을 구현하였다
* 기본적인 스택 구현 연습
* */
public class BasicIntStack {

    private int max;
    private int top;
    private int[] stack;

    public BasicIntStack(int capacity){
        top = 0;
        max = capacity;
        stack = new int[max];
    }


    public boolean isEmpty(){
        return top <= 0;
    }

    public boolean isFull(){
        return top >= max;
    }

    public int push(int x){
        if(isFull()){
            throw new StackOverflowError();
        }
        return stack[top++] = x;
    }

    public int pop(){
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[--top];
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public int indexOf(int x){
        for(int i = top-1; i>=0; i--){
            if(stack[i] == x){
                return i;
            }
        }
        return -1;
    }

    public void clear(){
        top = 0;
    }

    public int capacity(){
        return max;
    }

    public int size(){
        return top;
    }

    public void dump(){
        if(isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            for(int i = 0; i < top; i++){
                System.out.println(stack[i]);
            }
        }
    }

}
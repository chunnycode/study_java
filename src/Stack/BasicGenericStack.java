package Stack;

import java.util.EmptyStackException;

/*
* Int 스택에서 발전시켜
* Generic 을 사용하여 배열로 스택을 구현하였다
* */
public class BasicGenericStack<E> {

    private static final int DEFAULT_SIZE = 16;
    private int top = 0;
    private E[] stack;

    public BasicGenericStack(){
        stack = (E[]) new Object[DEFAULT_SIZE];
    }

    public BasicGenericStack(int capacity){
        stack = (E[]) new Object[capacity];
    }

    public E push(E x) {
        if(isFull()){
            throw new StackOverflowError();
        }
        return stack[top++] = x;
    }

    public E pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        E res = stack[--top];
        stack[top] = null;
        return res;
    }

    public E peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public int indexOf(E x){
        for(int i = top-1; i>=0; i--){
            if(stack[i].equals(x)){
                return i;
            }
        }
        return -1;
    }

    public void clear(){
        for(int i = 0; i < top; i++){
            stack[i] = null;
        }
        top = 0;
    }

    public int capacity(){
        return stack.length;
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

    public boolean isEmpty(){
        return top <= 0;
    }

    public boolean isFull(){
        return top >= stack.length;
    }

}
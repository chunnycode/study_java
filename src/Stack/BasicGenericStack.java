package Stack;

import java.util.EmptyStackException;

/*
* Int 스택에서 발전시켜
* Generic 을 사용하여 배열로 스택을 구현하였다
* */
public class BasicGenericStack<T> implements Cloneable{

    private static final int DEFAULT_SIZE = 16;
    private int top = 0;
    private T[] stack;

    public BasicGenericStack(){
        stack = (T[]) new Object[DEFAULT_SIZE];
    }

    public BasicGenericStack(int capacity){
        stack = (T[]) new Object[capacity];
    }

    public T push(T x) {
        if(isFull()){
            throw new StackOverflowError();
        }
        return stack[top++] = x;
    }

    public T pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        T res = stack[--top];
        stack[top] = null;
        return res;
    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public int indexOf(T x){
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        BasicGenericStack<T> clone = new BasicGenericStack<T>();
        for(int i=0; i<top; i++){
            clone.push(stack[i]);
        }
        return clone;
    }
}
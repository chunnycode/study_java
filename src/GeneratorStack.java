import com.sun.source.tree.ClassTree;

public class GeneratorStack<E> {

    private static final int DEFAULT_SIZE = 16;
    private int top = 0;
    private E[] stack;

    public GeneratorStack(){
        stack = (E[]) new Object[DEFAULT_SIZE];
    }

    public GeneratorStack(int capacity){
        stack = (E[]) new Object[capacity];
    }

    public E push(E x) throws OverflowMyStackException{
        if(isFull()){
            throw new OverflowMyStackException();
        }
        return stack[top++] = x;
    }

    public E pop() throws EmptyMyStackException{
        if(isEmpty()) {
            throw new EmptyMyStackException();
        }
        E res = stack[--top];
        stack[top] = null;
        return res;
    }

    public E peek(){
        if(isEmpty()){
            throw new EmptyMyStackException();
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

    public static class EmptyMyStackException extends RuntimeException {
        public EmptyMyStackException (){ }
    }

    public static class OverflowMyStackException extends RuntimeException {
        public OverflowMyStackException(){ }
    }

}
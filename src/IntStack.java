import com.sun.source.tree.ClassTree;

public class IntStack {

    private int max;
    private int top;
    private int[] stack;

    public IntStack(int capacity){
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

    public int push(int x) throws OverflowIntStackException{
        if(isFull()){
            throw new OverflowIntStackException();
        }
        return stack[top++] = x;
    }

    public int pop() throws EmptyIntStackException{
        if(isEmpty()) {
            throw new EmptyIntStackException();
        }
        return stack[--top];
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyIntStackException();
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


    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException (){ }
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException(){ }
    }

}
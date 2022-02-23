import com.sun.source.tree.ClassTree;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_STACK = {};

    private Object[] stack;
    private int size; // 배열에 담긴 수

    public Stack() {
        this.stack = EMPTY_STACK;
        this.size = 0;
    }

    public Stack(int capacity){
        this.stack = new Object[capacity];
        this.size = 0;
    }


    private void resize(){
        // 빈 배열일때 default 크기로 설정
        if(Arrays.equals(stack, EMPTY_STACK)){
            stack = new Object[DEFAULT_CAPACITY];
            return;
        }

        // 할당된 크기
        int stackCapacity = stack.length;

        // 적재된 데이터가 할당된 크기와 같을 때 = 가득찼을 때
        if(size == stackCapacity) {
            int newSize = stackCapacity * 2; // 두배로 늘림
            stack = Arrays.copyOf(stack, newSize);
            return;
        }

        // 할당된 크기의 절반 미만을 사용할 경우에
        if(size < (stackCapacity / 2)) {
            int newCapacity = (stackCapacity / 2);
            stack = Arrays.copyOf(stack, Math.max(DEFAULT_CAPACITY, newCapacity));// 최소값 DEFAULT_CAPACITY
            return;
        }
    }

    public boolean isFull(){
        return size == stack.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void clear(){
        for (int i=0; i<size; i++){
            stack[i] = null;
        }
        size = 0;
        resize();
    }

    public int size(){
        return size;
    }

    public E push(E elem){
        if(isFull()){
            resize();
        }
        stack[size] = elem;
        size++;
        return elem;
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        E obj = (E) stack[--size];
        stack[size] = null;
        resize();
        return obj;
    }

    public E peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return (E) stack[size - 1];
    }


}
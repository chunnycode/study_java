package Stack;

import java.util.Arrays;
import java.util.EmptyStackException;


/*
* 자동으로 사이즈를 조절하는 스택을 구현
* Generic 스택에서 발전
* */
public class AutoResizingStack<T> implements Cloneable{

    private static final int DEFAULT_CAPACITY = 10;

    private T[] stack;
    private int size = 0; // 배열에 담긴 수

    public AutoResizingStack() {
        this.stack = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public AutoResizingStack(int capacity){
        this.stack = (T[]) new Object[capacity];
    }


    private void resize(){
        // 빈 배열일때 default 크기로 설정
        if(size == 0){
            stack = (T[]) new Object[DEFAULT_CAPACITY];
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

    public T push(T elem){
        if(isFull()){
            resize();
        }
        stack[size] = elem;
        size++;
        return elem;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        T obj = (T) stack[--size];
        stack[size] = null;
        resize();
        return obj;
    }

    public T peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) stack[size - 1];
    }

    public Object clone() throws CloneNotSupportedException {
        AutoResizingStack<T> clone = new AutoResizingStack<T>();
        for(int i=0; i<this.size; i++){
            clone.push(stack[i]);
        }
        return clone;
    }
}
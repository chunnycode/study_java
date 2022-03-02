import java.util.Arrays;
import java.util.EmptyStackException;

public class ImplementedStack<T> implements StackInterface<T> { // Cloneable, Serializable

	private static final int DEFAULT_CAPACITY = 10;
	private static final Object[] EMPTY_STACK = {};

	private T[] stack;
	private int size = 0; // 배열에 담긴 수

	public ImplementedStack(){
		stack = (T[]) new Object[DEFAULT_CAPACITY];
	}

	@Override
	public boolean isFull() {
		return size == stack.length;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void clear() {
		/*for (int i=0; i<size; i++){
			stack[i] = null;
		}*/
		stack = (T[]) new Object[DEFAULT_CAPACITY]; // 재할당을 하게되면 기존 할당된 데이터는 GC의 대상이 된다
		size = 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public T push(T elem) {
		if(isFull()){
			resize();
		}
		stack[size++] = elem;
		return elem;
	}

	@Override
	public T pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		T obj = (T) stack[--size];
		stack[size] = null;
		resize();
		return obj;
	}

	@Override
	public T peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return (T) stack[size - 1];
	}

	private void resize(){
		// 빈 배열일때 default 크기로 설정
		if(Arrays.equals(stack, EMPTY_STACK)){
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


}

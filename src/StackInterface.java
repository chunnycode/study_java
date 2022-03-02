/*
* Stack Interface
*
* */
public interface StackInterface<T>{

	/*
	* 스택이 가득 차면 True, 아니면 False 반환
	* */
	boolean isFull();

	/*
	* 스택이 비었으면 True, 아니면 False 반환
	* */
	boolean isEmpty();

	/*
	* 스택의 모든 요소를 삭제
	* */
	void clear();

	/*
	* 스택에 있는 요소 개수를 반환
	* */
	int size();

	/*
	* 스택의 맨 위에 요소를 추가
	* */
	T push(T elem);

	/*
	* 스택의 맨 위의 요소를 삭제하고 해당 요소를 반환
	* */
	T pop();

	/*
	* 스택의 맨 위의 요소를 반환
	* */
	T peek();

}

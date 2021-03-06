package Clone;

import Stack.AutoResizingStack;
import Stack.BasicGenericStack;
import Stack.BasicIntStack;
import Stack.ImplementedStack;
/*
* Cloneable을 구현한 자료구조를 테스트하는 파일
* Cloneable의 구현은 각 자료형에 구현하였음
* */
public class CloneTest {

	public static void main(String[] args){
		CloneTest test = new CloneTest();
		test.ImplementedStackTest();
	}

	public void ImplementedStackTest(){
		ImplementedStack<String> tmp = new ImplementedStack<>();

		tmp.push("good");
		tmp.push("morning");

		ImplementedStack<String> tmp2 = null;
		try {
//			tmp2 = (AutoResizingStack<String>) tmp.clone();
		} catch( Exception e ) {

		}
		tmp.push("20");
		tmp2.push("there");

		System.out.println(tmp);
		System.out.println(tmp2);
		// 잘 동작함
	}

	public void AutoResizingStackTest(){
		AutoResizingStack<String> tmp = new AutoResizingStack<String>();
		tmp.push("test1");
		tmp.push("test12");
		tmp.push("test13");
		tmp.push("test15");
		AutoResizingStack<String> tmp2 = null;
		try {
			tmp2 = (AutoResizingStack<String>) tmp.clone();
		} catch( Exception e ) {

		}
		tmp.push("20");
		tmp2.push("there");

		System.out.println(tmp);
		System.out.println(tmp2);
		// 잘 동작함.
	}

	public void BasicIntStackTest(){
		BasicIntStack tmp = new BasicIntStack();
		tmp.push(1);
		tmp.push(1);
		tmp.push(1);
		tmp.push(1);
		BasicIntStack tmp2 = null;
		try {
			tmp2 = (BasicIntStack) tmp.clone();
		} catch( Exception e ) {

		}
		tmp.push(2);
		tmp2.push(3);

		System.out.println(tmp);
		System.out.println(tmp2);
		// int 배열로 만든 BasicIntStack Cloneable Override 구현. 잘 동작함.
	}


	public void StringArrayTest(){
		String[] tmp = new String[5];
		tmp[0] = "hi";
		tmp[1] = "h2";
		tmp[2] = "h3";
		tmp[3] = "h5";
		String[] tmp2 = tmp.clone();

		tmp[0] = "bye";
		tmp2[4] = "byebye";

		System.out.println(tmp);
		System.out.println(tmp2);
		// String 배열도 잘 동작함.
	}

	public void intArrayTest(){

		int[] tmp = new int[5];
		tmp[0] = 3;
		tmp[1] = 46;
		tmp[2] = 15;
		tmp[3] = 159;
		int[] tmp2 = tmp.clone();

		tmp[0] = 0;
		tmp2[4] = 7;

		System.out.println(tmp);
		System.out.println(tmp2);
		// int 배열은 복사가 잘 된다.

	}

}

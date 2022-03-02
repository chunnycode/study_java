import java.util.Arrays;

public class Test {

	public static void main(String[] args){

//		ImplementedStack<Integer> iStack = new ImplementedStack<>();
//		ImplementedStack<Integer> sStack = iStack.clone();
//		System.out.println(iStack);

		ImplementedStack<Integer> eStack = new ExtendedStack<>();
		ImplementedStack<Integer> cloneStack = new ExtendedStack<>() ;
//		ExtendedStack<Integer> cloneStack2 = eStack ;

		eStack.push(1);
		eStack.push(2);
		eStack.push(3);

		eStack.pop();

		System.out.println(cloneStack);
	}
}

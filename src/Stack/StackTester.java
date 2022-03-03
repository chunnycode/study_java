package Stack;

public class StackTester {

    public static void main(String[] args){

        AutoResizingStack<Object> autoResizingStack = new AutoResizingStack<>();
        AutoResizingStack<Integer> autoResizingStack2 = new AutoResizingStack<Integer>(100);

        autoResizingStack.push(new Salt(1));
        autoResizingStack.push(new Salt(2));
        autoResizingStack.push(new Salt(3));

        System.out.println("Empty: " + autoResizingStack.isEmpty());
        System.out.println("Full: " + autoResizingStack.isFull());
        System.out.println("peek: " + autoResizingStack.peek());



//		ImplementedStack<Integer> iStack = new ImplementedStack<>();
//		ImplementedStack<Integer> sStack = iStack.clone();
//		System.out.println(iStack);

        ImplementedStack<Integer> eStack = new ExtendedStack<Integer>();
        ImplementedStack<Integer> cloneStack = new ExtendedStack<Integer>() ;
//		ExtendedStack<Integer> cloneStack2 = eStack ;

        eStack.push(1);
        eStack.push(2);
        eStack.push(3);

        eStack.pop();

        System.out.println(cloneStack);
    }

}
import java.util.Scanner;

public class StackTester {

    public static void main(String[] args){

        Stack<Object> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>(100);

        stack.push(new Salt(1));
        stack.push(new Salt(2));
        stack.push(new Salt(3));

        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("peek: " + stack.peek());
    }

}
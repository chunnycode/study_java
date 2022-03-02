/*
import java.util.Scanner;

public class IntStackTester {

    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);
        GeneratorStack s = new GeneratorStack();

        while(true){
            System.out.println("현재 데이터 수 " + s.size() + "/" + s.capacity());
            System.out.println("push(1) pop(2) peek(3) dump(4) indexOf(5) clear(6) isEmpty(7) isFull(8) exit(0)");

            int menu = stdIn.nextInt();
            if(menu == 0) {
                break;
            }

            Object x ;
            switch(menu){
                case 1:
                    System.out.println("push : ");
                    x = stdIn.next();
                    try{
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e){
                        System.out.println("Stack is full");
                    }
                    break;
                case 2:
                    try{
                        System.out.println(s.pop());
                    } catch (IntStack.OverflowIntStackException e){
                        System.out.println("Stack is full");
                    }
                    break;
                case 3:
                    try {
                        x = s.peek();
                        System.out.println("peek : " + x);
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("Stack is empty");
                    }
                    break;
                case 4:
                    s.dump();
                    break;
                case 5:
                    System.out.println("indexOf : ");
                    x = stdIn.next();
                    System.out.println("index : " + s.indexOf(x) );
                    break;
                case 6:
                    s.clear();
                    break;
                case 7:
                    System.out.println(s.isEmpty());
                    break;
                case 8:
                    System.out.println(s.isFull());
                    break;
            }

        }

    }

}*/

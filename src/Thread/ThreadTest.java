package Thread;

public class ThreadTest {

    public static void main(String[] args){

        ThreadTest tt = new ThreadTest();
        tt.makeThread();

    }

    public void makeThread(){

        MyThread t1 = new MyThread();

        Runnable r = new MyRunnableThread();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

    }


}

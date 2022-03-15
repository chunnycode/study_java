package Thread;

public class MyThread extends Thread{


    public MyThread(){

    }

    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(getName());
        }
    }

}

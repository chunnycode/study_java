package Queue.Interface;

import Queue.QueueNode;

import java.util.Queue;

public class MyQueue<T> {
    QueueNode<T> front;
    QueueNode<T> rear;

    public MyQueue(){
        front = null;
        rear = null;
    }

    public boolean isEmpty(){
        if( front == null && rear == null ){
            return true;
        }
        return false;
    }

    public void enqueue(T value){
        QueueNode<T> queueNode = new QueueNode<>(value);
        if(isEmpty()){
            front = queueNode;
            rear = queueNode;
        } else {
            front.setNextNode(queueNode);
            front = queueNode;
        }
    }

    public QueueNode<T> dequeue(){
        if(isEmpty()){
            System.out.println("Empty");
            return null;
        } else {
            QueueNode<T> dequeue = rear;
            rear = rear.getNextNode();
            return dequeue;
        }
    }

    public QueueNode<T> peek(){
        if(isEmpty()){
            System.out.println("Empty");
            return null;
        } else {
            return rear;
        }
    }

}

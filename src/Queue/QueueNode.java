package Queue;

public class QueueNode<T> {
    T value;
    QueueNode<T> nextNode;
    public QueueNode(T value){
        this.value = value;
        nextNode = null;
    }

    public T getValue(){
        return value;
    }

    public QueueNode<T> getNextNode(){
        return nextNode;
    }

    public void setNextNode(QueueNode<T> nextNode){
        this.nextNode = nextNode;
    }

}

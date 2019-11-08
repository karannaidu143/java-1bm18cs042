import java.util.*;
class queue{
    int queue[] = new int[20];
    Scanner s = new Scanner(System.in);
    int rear = -1;
    int front = -1;
    void enqueue(){
        if((rear+1)<20){
            System.out.println("Enter the integer to put to queue - ");
            queue[++rear] = s.nextInt();
            if(front = -1)  front = 0;
        }
        else{
            System.out.println("Queue array full!!")
        }
    }
    void dequeue{
        if(
    }
}

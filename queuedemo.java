import java.util.*;
class Queue{
    int queue[] = new int[20];
    Scanner s = new Scanner(System.in);
    int rear = -1;
    int front = 0;
    void enqueue(){
        if((rear+1)<20){
            System.out.println("Enter the integer to put to queue - ");
            queue[++rear] = s.nextInt();
        }
        else{
            System.out.println("Queue array full!!");
        }
    }
    void dequeue(){
        if(rear >= front){
            System.out.println("The dequeued element is " + queue[front++]);
            if(front > rear){
                front = 0;
                rear = -1;
            }
        }
        else{
            System.out.println("The Queue is empty");
            return;
        }
    }
    void display(){
        if(rear >= front){
            System.out.println("Elements in Queue - ");
            for(int i = front; i <= rear ; i++){
                System.out.print("\t" + queue[i]);
            }
            System.out.print("\n");
        }
        else
            System.out.println("Queue is empty!!");
    }
}
class queuedemo{
    public static final String ANSI_RESET = "\u001B[0m"; // ANSI Escape code to reset the IO Output color to default
    public static final String ANSI_RED = "\u001B[31m";  // ANSI Escape code to change the IO Output color to Red
    public static void main(String args[]){
        Queue q = new Queue();
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println(ANSI_RED + "1. Enqueue\n2. Dequeue\n3. Display\n4. Exit " + ANSI_RESET);
        do{
            System.out.println("Choose operation - ");
            choice = sc.nextInt();
            switch(choice){
                case 1: q.enqueue();
                        break;
                case 2: q.dequeue();
                        break;
                case 3: q.display();
                        break;
                case 4: return;
            }
        }while(choice != 4);
    }
}

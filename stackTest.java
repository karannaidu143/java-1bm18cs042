import java.util.*;
interface Stack{
    void push();
    void pop();
    Scanner s = new Scanner(System.in);
};
class stastack implements Stack{
    int top = -1;
    int size = 5;
    int stack[] = new int[size];
    stastack(){
        System.out.println("Initialized a stack with size 5");
    }
    public void push(){
        int inp;
        System.out.println("Enter the element to push to Static Stack - ");
        inp = s.nextInt();
        if(top == (size -1)){
            System.out.println("Stack full");
        }
        else
            stack[++top] = inp;
    }
    public void pop(){
        if(top == -1){
            System.out.println("Stack empty");
        }
        else
            System.out.println("Popped element is " + stack[top--]);
    }
}
class dynstack implements Stack {
    int top = -1;
    int size = 5;
    int stack[] = new int[size];

    dynstack() {
    }

    public void push() {
        if (top == (size - 1)) {
            System.out.println("The number of elements in the stack exceeded, hence creating a new stack with double the size");
            int stacktemp[] = new int[(size * 2)];
            size = size * 2;
            for (int i = 0; i <= top; i++) {
                stacktemp[i] = stack[i];
            }
            System.out.println("Enter the element to be pushed - ");
            stacktemp[++top] = s.nextInt();
            stack = stacktemp;
        } else {
            System.out.println("Enter the element to be pushed - ");
            stack[++top] = s.nextInt();
        }
    }
    public void pop() {
        if (top == -1) {
            System.out.println("Stack empty");
        } else {
            System.out.println("Popped element is " + stack[top--]);
        }
    }
}
class stackTest {
    public static void main(String args[]) {
        int choice, choice1, done;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter whether to work with Static or Dynamic Stack-\n1. Static\n2. Dynamic");
        choice = sc.nextInt();
        stastack sst = new stastack();
        dynstack dst = new dynstack();
        do {
            System.out.println("Enter the operation -\n1. Push\n2. Pop\n3. Display\n4. Exit");
            choice1 = sc.nextInt();
            if (choice == 1) {
                switch (choice1) {
                    case 1:
                        sst.push();
                        break;
                    case 2:
                        sst.pop();
                        break;
                    case 3:if(sst.top != -1) {
                                for (int j = 0; j <= sst.top; j++) {
                                    System.out.print(sst.stack[j] + "  ");
                                }
                                System.out.print("\n");
                           }
                           else
                                System.out.println("Stack Empty");
                           break;
                    case 4: return;
                }
            } else if (choice == 2) {
                switch (choice1) {
                    case 1:
                        dst.push();
                        break;
                    case 2:
                        dst.pop();
                        break;
                    case 3:if(dst.top != -1) {
                                for (int j = 0; j <= dst.top; j++) {
                                    System.out.print(dst.stack[j] + "  ");
                                }
                                System.out.print("\n");
                            }
                            else
                                System.out.println("Stack Empty");
                            break;
                    case 4: return;
                }
            }
        } while (choice1!= 4);
    }
}

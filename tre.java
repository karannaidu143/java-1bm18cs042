class t1 implements Runnable{
Thread t,u;
t1(){
t=new Thread(this,"t1");

t.start();


}
public void run(){
while(true){
System.out.println(Thread.currentThread().getName());

try{
 Thread.sleep(10000);
}
catch(InterruptedException e)
{
System.out.println("bms thread ideal");
 }
 }
 }
} 
class t2 implements Runnable{
Thread t,u;
t1(){
t=new Thread(this,"t1");

t.start();


}
public void run(){
while(true){
System.out.println(Thread.currentThread().getName());

try{
 Thread.sleep(2000);
}
catch(InterruptedException e)
{
System.out.println("bms thread ideal");
 }
 }
 }
} 
class tre{
public static void main(String argg[])
{   
t1 obj=new t1();
t2 obj=new t2();
}
}





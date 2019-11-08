package see;
import cie.student;
import java.util.*;



class external extends student{
int a[]=new int [5];
int marks;
void print(int marks[5])
{
super.print();
for(int i=0;i<5;i++)
{

System.out.println("your  internal marks are in this sem"+marks[i]);
}
}
}


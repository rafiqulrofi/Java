package superclass2;

class A
{ 
    int h,l,w;
    
    A(int a,int b,int c)
    {      
       h=a;
       l=b;
       w=c;
    }
            
    void display()
    {
        System.out.println(+h+" "+l +" "+w);
    }
}
class B extends A
{
    int z;
    B(int a,int b,int c,int d)
    {
        super(a,b,c);
        z=d;
        System.out.println(+h+" "+l+" "+w+" "+z);
    }
            
}
  

public class Superclass2 {

   
    public static void main(String[] args) {
    B b=new B(10,20,30,40);
        
    }
    
}/*
class A {
int i, j;
A(int a, int b) {
i = a;
j = b;
}
// display i and j
void show() {
System.out.println("i and j: " + i + " " + j);
}
}
// Create a subclass by extending class A.
class B extends A {
int k;
B(int a, int b, int c) {
super(a, b);
k = c;
}
// overload show()
void display() {
System.out.println(+ k);
}
}
public class Superclass2 {

   
public static void main(String[] args) {
B subOb = new B(1, 2, 3);
subOb.display();// this calls show() in B
subOb.show(); // this calls show() in A
}
}*/
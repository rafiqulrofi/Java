
package interfaces2;
/*****************************************************
interface A

{
    public int i=20;
    public void add();
    public void sub();
}
class B implements A
{
    B()
    {
        System.out.println(i);
    }

    
    public void add()
    {
        
      System.out.println(+i);
    }
    public void sub()
    {
        
    }
 
    
}

/************************************************************/
/*
abstract class A{  // A a = new A() // error
    int i=20;
    void add()
    {
       System.out.println("hello");
    }
    
     //void add(){}
     void sub(){}
}
 class B extends A{
    
    
    void add()
    {
        //i=30;
        System.out.println("Hello world"+i); //abstract by defualt variable not final
    }
    void sub()
    {
      System.out.println("Hello world");
    }
     
}



public class Interfaces2 {

    
    public static void main(String[] args) {
        B b=new B();
        b.add();
        b.sub();
   
    }
    
}
*/
interface A{
    public void add();
    public void sub();
}
interface B extends A{
    public void prod();
}
interface C extends A{
    public void div();
}
class D implements B,C{
    public void add(){
        System.out.println("I am in D");
    }
    public void sub(){
        System.out.println("I am in D");
    }
    public void prod(){
        System.out.println("I am in D");
    }
    public void div(){
    System.out.println("I am in D");
    }
    
}

public class Interfaces2 {

    
    public static void main(String[] args) {
       D d=new D();
       d.add();
       d.div();
       d.prod();
       d.sub();
   
    }
    
}
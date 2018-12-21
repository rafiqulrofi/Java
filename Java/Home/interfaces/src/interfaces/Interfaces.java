
package interfaces;

/******************* Case 1 ********************/
/*
interface A{
    public int i=10;
    public void add();
    public void sub();
}
class B implements A{
    public void add(){
        System.out.println("hello");
        //i=20; // you cant change variable declared in interface cause its by default final
        System.out.println(+i);
    }
   public void sub(){}
   public void mul(){}
}
*/

/******************* Case 2 ********************/

abstract class A{  // A a = new A() // error
    int i=20;
   // void add()
    //{
    //    System.out.println("hello");
    //}
    
     void add(){}
     void sub(){}
}
 class B extends A{
    void add()
    {
        System.out.println("Hello world");
         
    }
   // void sub()
    //{
    //    System.out.println("Hello world");
   // }
}

/***************** Case 3 **********************/
/*
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
*/
/******************** Case 4 ***************************/
/*
interface A{
    public int i=10;
    public void add();
    public void sub();
}
interface B extends A{
    public int i=20;
    public void prod();
}
interface C extends A{
    public int j=30;
    public void div();
}
class D implements B,C{
    public void add(){
        System.out.println("I am in D"+i); // ambiguous situation
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
*/
/* 
// Methods in an interface cant be final
interface A{
    final void add();    
}
*/

public class Interfaces {

   
    public static void main(String[] args) {
   
    }
    
}

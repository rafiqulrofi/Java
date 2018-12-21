
package A;

class A
{
    int i;
    int x;
    A(){}
    A(int p)
    {
        i=p;
        System.out.println("A is calling"+i);
    }
}

class B extends A
{
  int i;
  B(){};
  B(int q)
  {
      
        super(300);
        i=q;
        super.i=100;
        System.out.println("B is calling");
  }
   void display()
    {
        System.out.println(super.i);
        System.out.println(i);
    }
}
class C extends B{
    int i;
    C()
    
    {
        super(20);
       
        System.out.println("C is calling");
    }
    void display()
    {
        System.out.println(i);
        System.out.println(super.i);
    }
}
 


public class A {
    
  

   
    public static void main(String[] args) {
    B b=new B(10);
    b.display();
    C c=new C();
    }
    
}

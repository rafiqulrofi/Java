
package superclass;

class A
{
    int i=1;
    A()
    {
        //System.out.println("A is calling "+i);
    }
    
    void display()
    {
        System.out.println("A is calling "+i);
    }
}

class B extends A
{
    int j=2;
    B()
    {
        super.i=10;
        
        //System.out.println("B is calling "+j+" "+super.i);
    }
    void display()
    {
     System.out.println("B is calling "+j+" "+super.i);
    }
}
class C extends B
{
    int k=3;
    C()
    {
       super.j=20;
       //System.out.println("C is calling "+k+" "+super.j);
       
    }
    void display()
    {
         System.out.println("B is calling "+k+" "+super.j);
    }
}
public class Superclass {

    
    public static void main(String[] args) {
  /*  C c=new C();
    c.k=30;
    c.i=2;
    c.j=3;
    
    */
        A a=new A();
        B b=new B();
        C c=new C();
        A r;
        r=a;
        r.display();
        r=b;
        r.display();
        r=c;
        r.display();
              
    
            
    }
    
}


package tree;

import static tree.A.i;
import static tree.B.j;


  class A
    {
         static int i=0;
    A()
    {
        
        
    }
    void display()
    {
        System.out.println("A has "+i+ "child");
    } 
    
  }

class B extends A
{
    static int j=0;
    B()
    {
       i++;
    }
    
    void display()
    {
        System.out.println("B has "+j+ "child"); 
    }          
            
}

class C extends A
{
    static int k=0;
    
    C()
    {
        i++;
    }
    
    void display()
    {
         System.out.println("C has "+k+ "child");
    }    
}

class D extends B{
    static int l=0;
    D()
    {
        i--;
        j++;
    }
    void display()
    {
        System.out.println("D has "+l+" child");
    }
}

class E extends B{
    static int m=0;
    E()
    {
        i--;
        j++;
    }
    void display()
    {
        System.out.println("E has "+m+" child");
    }
}

class F extends C{
    static int n=0;
    F()
    {
        i--;
        j++;
    }
    void display()
    {
        System.out.println("F has "+n+" child");
    }
}

class G extends C{

    static int m=0;
    G()
    {
       i--;
       k++;
    }
    void display()
    {
         System.out.println("G has "+m+ "child");
    }
}
class H extends D
{
    static int O=0;
    H()
    {
       j--;
       l++;
    }
    void display()
    {
         System.out.println("H has "+O+ "child");
    }
}

public class Tree {

  
    
    public static void main(String[] args) {
         A a =new A();
         B b = new B();
         C c=new C();
         D d=new D();
         E e=new E();
         F f=new F();
         G g=new G();
         H h=new H();
         a.display();
         b.display();
         c.display();
         d.display();
         e.display();
         f.display();
         g.display();
         h.display();
         
   
    }
    
}

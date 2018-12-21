
package tree2;

//import static tree2.D.m;

//import static tree2.A.i;
//import static tree2.B.j;


class A{
    static int i=0;
    A()
    {
        
    }
    void display()
    {
        System.out.println("A has "+i+" child");
    }
}
class B extends A{
    static int j=0;
    B()
    {
        i++;
    }
    void display()
    {
        System.out.println("B has "+j+" child");
    }
}

class C extends A{
    static int k=0;
    C()
    {
        i++;
    }
    void display()
    {
        System.out.println("C has "+k+" child");
    }
}
class D extends B{
    static int m=0;
    D()
    {
        i--;
        j++;
    }
    void display()
    {
        System.out.println("D has "+m+" child");
    }
}
class F extends B{
    static int l=0;
    F()
    {
        i--;
        j++;
    }
    void display()
    {
        System.out.println("F has "+l+" child");
    }
}
class H extends D{
    static int p=0;
    H()
    {
        j--;
        m++;
    }
    void display()
    {
        System.out.println("H has "+p+" child");
    }
}
class R extends H{
    static int U=0;
    R()
    {
        m--;
        p++;
    }
    void display()
    {
        System.out.println("R has "+U+" child");
    }
}

public class Tree2 {

   
    public static void main(String[] args) {
         A a =new A();
         B b = new B();
         C c=new C();
         D d=new D();
         F f=new F();
         H h=new H();
         R r=new R();
        
        
         a.display();
         b.display();
         c.display();
         d.display();
         f.display();
         h.display();
         r.display();
         
    }
    
}

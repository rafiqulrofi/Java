
package protibondi;



class Z
{
    static int i=0;
    Z()
    {
        
    }
    
    void display()
    {
        System.out.println("Z has "+i+" child");
    }
}

class X extends Z
{
    static int j=0;
    X()
    {
        i++;
    }
    void display()
    {
        System.out.println("X has "+j+" child");
    }
}

class Y extends X
{
    static int k=0;
    Y()
    {
        j++;
        i--;
        
    }
    void display()
    {
        System.out.println("Y has "+k+" child");
    }
}


class R extends X
{
    static int l=0;
    R()
    {
        j++;
        i--;
        
    }
    void display()
    {
        System.out.println("R has "+l+" child");
    }
}

class A extends R
{
    static int m=0;
    A()
    {
        l++;
        j--;
    }
    void display()
    {
        System.out.println("A has "+m+" child");
    }
}

class B extends A
{
    static int n=0;
    B()
    {
        m++;
        l--;
    }
    void display()
    {
        System.out.println("B has "+n+" child");
    }
}


class K extends B
{
    static int O=0;
    K()
    {
        n++;
        m--;
    }
    void display()
    {
        System.out.println("K has "+O+" child");
    }
}

public class Protibondi {

    
    public static void main(String[] args) {
        
        Z z=new Z();
        X x=new X();
        Y y=new Y();
        R r=new R();
        A a=new A();
        B b=new B();
        K k=new K();
        
        z.display();
        x.display();
        y.display();
        r.display();
        a.display();
        b.display();
        k.display();
    
    }
    
}


package inheritence;


class A
{
    int a;
   A()
   {
       System.out.println("Create A");
       
    
      
   }
  
}

class B extends A
{
    int b;
    B()
    {
        System.out.println("Create B");
    }
}

class C extends A
{
    int c;
    C()
    {
        System.out.println("Create C");
    }
}

class D extends B
{
    int d;
    D()
    {
        System.out.println("Create D");
    }
}

class E extends B
{
    int e;
    E()
    {
        System.out.println("Create E");
    }
}

class F extends C
{
    int f;
    F()
    {
        System.out.println("Create F");
    }
}

class G extends C
{
    int g;
    G()
    {
        System.out.println("Create G");
       
    }
}

    

    

public class Inheritence {

    
    public static void main(String[] args) {
        
       A a= new A();
       B b=new B();
       C c =new C();
       D d =new D();
       E e=new E();
       F f= new F();
       G g=new G();
       g.g=200;
       f.f=100;
       e.e=50;
       
      // System.out.println(a.a);
       
   
    }
    
}

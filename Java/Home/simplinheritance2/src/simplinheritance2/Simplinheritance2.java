
package simplinheritance2;

/*class A
{
    int i;
    A()
    {
    i=0;
    }
    void display()
    {
        System.out.println("A is calling "+i);
    }
    
}

class B extends A
{
    int j;
    B()
    {
    j=0;
    }
    void display()
    {
        System.out.println("A is calling "+i);
    }
}
*/
class A{
    int i;
    void display(){
        System.out.println("Creating A "+i);
    }
}
/*class B extends A{
    int j;
    B(){
        System.out.println("Creating B");
    }
}
class C extends B{
    int k;
    C(){
        System.out.println("Creating C");
    }
}*/
 



 
public class Simplinheritance2 {

   
    public static void main(String[] args) {
    /*A a =new A();
    B b =new B();
    a=b;
    a.i=10;
    a.display();
    b.display();*/
    
   // C c= new C();
        A a=new A();
        a.i=20;
        a.display();
    
    }
    
}


package callbyvalue;

class A{
   int i;
}

public class Another {
       void set(A p){
           p.i=20;
           
       }
    public static void main(String[] args){
        A a=new A();
        A b=new A();
        // A  type objects a,b
        Another m=new Another();
        a.i=100;
        m.set(a); // call by reference, a is an object
        System.out.println(a.i);
        
    }    
}


package simpleinheritancs;

class A
 {
    
    
    int i=0,j=0;
   
    
  A(int x, int y)
  {
     i=x;
     j=y;
    
  }  
  
  void display()
          {
             System.out.println("i and j "+i+" "+j) ;
          }
}
public class Simpleinheritancs {

   
    public static void main(String[] args) {
        A a=new A(10, 20);
        
        a.display();
        
   
    }
    
}


package method;

import java.util.*;

    

public class Method {

  int h;
  int l;
  int w;
  Method(){
      h=0;
      w=0;
      l=0;
  }
  
  void input(int a, int b, int c){
      h=a;
      l=b;
      w=c;
      
  }

void volum(){
    System.out.println("Volume: ");
    System.out.println(h*l*w);
}
    
    public static void main(String[] args) {
   Method m= new Method();
  m.input(10,20,30);
   m.volum();
        
    }
    
}

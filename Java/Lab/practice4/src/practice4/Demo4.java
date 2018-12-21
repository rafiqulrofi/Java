
package practice4;
import java.util.*;

public class Demo4 {

   class add{
      public void addition(calculator C)
      {
          C.result = C.a+C.b;
      }
} 

   class sub{
       public void subtsction(Calculator C)
       {
           C.result = C.a-C.b;
       }
   }

  public class calculator{
      public int a,b,result=0;
  }
  public void input()
  {
      Scanner s=new Scanner (System.in);
      a = s.nextInt();
      b = s.nextInt();
  }
  public void display()
  {
      System.out.println(result);
  }
    public static void main(String[] args) {
        Calculator C= new Calculator();
        C.input();
        add a=new add();
        a.addtion(C);

    }
    
}

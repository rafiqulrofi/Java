
package practiceb2;

import java.util.*;
public class Demo2 {
    public int x1,x2,y1,y2;
    
    public Demo2()
    {
        x1=x2=y1=y2=0;
    }
    
    public void input(int a1,int b1,int a2,int b2)
    {
        x1=a1;
        y1=b1;
        x2=a2;
        y2=b2;
    }
    
    public double dist()
    {
       return Math.sqrt (Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
    }      
            
            


    public static void main(String[] args) {
      
         Demo2 d=new Demo2();
         Scanner s= new Scanner (System.in);
         int a1,b1,a2,b2;
         a1=s.nextInt();
         b1=s.nextInt();
         
         a2=s.nextInt();
         b2=s.nextInt();
         
         d.input(a1, b1, a2, b2);
         System.out.println(d.dist());
    }
         
        
    
    }
    



package practiceb3;

import java.util.*;
public class Demio3 {
    public int x1,x2,y1,y2,r;
    
    public Demio3()
    {
        x1=x2=y1=y2=r=0;
    }
    
    public void input(int a1,int b1,int a2,int b2,int r)
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
      
         Demio3 d=new Demio3();
         Scanner s= new Scanner (System.in);
         int a1,b1,a2,b2,r;
         a1=s.nextInt();
         b1=s.nextInt();
         
         a2=s.nextInt();
         b2=s.nextInt();
         
         r=s.nextInt();
         
         d.input(a1, b1, a2, b2,r);
         
         System.out.println(d.dist());
         
         
         if(r>d.dist())
         {
           System.out.println("Inside Circle");
         }
         
         else if(r<d.dist())
                 {
                     System.out.println("out Side");
                 }
                 
          else
                 {
                     System.out.println("on");
                 }
                 
                     
                 
    }
         
        
    
    }
    


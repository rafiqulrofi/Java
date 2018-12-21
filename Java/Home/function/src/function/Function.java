
package function;

import java.util.*;
public class Function {

    public int add(int a,int b)
    {
        return a+b;
    }
    
    public int sub(int a,int b)
    {
        return a-b;
    }
    
    public int mul(int a,int b)
    {
        return a*b;
    }
    
    public float div(int a,int b)
    {
        if(b!=0)
        {
            return(float) a/b;
        }
        else
        {
            System.out.println(ERROR MATH);
            return -1;
        }
    }
    
    public static void main(String[] args) {
     
        int x,y;
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        
        Function p=new Function();
        System.out.println(p.add(x,y));
        System.out.println(p.sub(x,y));
        System.out.println(p.mul(x,y));
        System.out.println(p.div(x,y));
    }
    
}

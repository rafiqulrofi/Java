
package returnvalue;

import java.util.*;
public class Returnvalue {
 
    double width;
    double hight;
    double lenth;
    
    Returnvalue()
    {
        width=0;
        hight=0;
        lenth=0;
    }
    void input(double hight,double lenth, double width)
    {
        this.hight=hight;
        this.lenth=lenth;
        this.width=width;
    
    }
    double valume()
    {
        return (width*hight*lenth);
    }
    
    
    
    
    public static void main(String[] args) {
   
    Returnvalue r=new Returnvalue();
    
    double vol;
    r.input(12,20,30);
    
    vol=r.valume();
    
    System.out.println(+vol);
    
  
   
    
    
    }
    
}

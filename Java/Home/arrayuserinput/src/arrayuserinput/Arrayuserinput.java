
package arrayuserinput;

import java.util.*;
public class Arrayuserinput {

    
    public static void main(String[] args) {
      
    Scanner s=new Scanner (System.in);
    int i;
    int array[]=new int[5];
    
    System.out.println("Enter Integer value: ");
    for(i=0;i<5;i++)
    {
        array[i]=s.nextInt();
    }
    System.out.println("Integer value is: ");
    for(i=0;i<5;i++)
    {
        System.out.println(array[i]);
    }
       
    }
    
}


package oddeven;

import java.util.*;
public class Oddeven {

   
    public static void main(String[] args) {
   int i;
   int odd_sum=0, even_sum=0;
   Scanner s=new Scanner(System.in);
   int size=s.nextInt();
   int array[]=new int [size];
   
   for(i=0;i<size;i++)
   {
       array[i]=s.nextInt();
       if(array[i]%2==0)
       {
           even_sum=even_sum+array[i];
       }
       else
       {
           odd_sum=odd_sum+array[i];
       }
   }
   
   if(odd_sum>even_sum)
   {
       System.out.println("Odd dominating");
   }
   else if(even_sum>odd_sum)
   {
           System.out.println("Even dominating");
   }
   
   else
   {
       System.out.println("Neutral dominating");
   }
  
   
    }
    
}

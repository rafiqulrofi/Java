
package userinput2;

import java.util.*;
public class Userinput2 {

   
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        int array[]=new int[5];
        for(int i=0;i<5;i++)
        {
            array[i]=r.nextInt();
        }
    System.out.println("Output is:");
    
    for(int i=0;i<5; i++)
    {
        System.out.println(array[i]);
    }
}
}

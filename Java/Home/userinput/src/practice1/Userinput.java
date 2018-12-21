// how to take input from keyboard
package practice1;
import java.util.*;
public class Practice1 {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int array[]=new int [5];
        for(int i=0;i<5;i++)
        {
            array[i]=s.nextInt();
        }
        System.out.print("Output is:");
        for(int i=0;i<5;i++)
        {
            System.out.println(array[i]);
        }
    }
    
}

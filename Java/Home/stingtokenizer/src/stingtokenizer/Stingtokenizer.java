
package stingtokenizer;

import java.util.*;

public class Stingtokenizer {

  /************* sentence count**********************/ 
    
    public static void main(String[] args) {
       /* 
        String s= "Hello World.This is CSE.";
        StringTokenizer st =new StringTokenizer(s,".");
        
       while(st.hasMoreTokens())
       {
           System.out.println(st.nextToken());
       }
        
    }
   */


/*******************word count*********************/
    
    String s= "Hello World.This is CSE.";
        StringTokenizer st =new StringTokenizer(s," | .");
        
       while(st.hasMoreTokens())
       {
           System.out.println(st.nextToken());
       }
        
    }
}
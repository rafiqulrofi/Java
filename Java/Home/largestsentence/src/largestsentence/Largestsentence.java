
package largestsentence;

import java.util.StringTokenizer;


public class Largestsentence {

    
    public static void main(String[] args) {
        
        String s="Hello World. Hello CSE uap.This is section B.we are bangladeshi";
        // step 1: fist i am seperating sentences 
        StringTokenizer ss=new StringTokenizer(s,".");
        int arr[]=new int [1000];
        int index=0; // index will represent the sentence index
        while(ss.hasMoreTokens())
        {
            // now i am seperating words in a single sentence
            StringTokenizer sw = new StringTokenizer(ss.nextToken()," ");
            arr[index]=sw.countTokens();
            
            index++;
        }
        int max=arr[0];
        int max_index=0;
        for(int i=0;i<index;i++)
        {
            if(arr[i]>=max)
            {
                max=arr[i];
                max_index=i;
            }
        }
        
        StringTokenizer sm=new StringTokenizer(s,".");
        int j=0;
        while(sm.hasMoreTokens())
        {
            if(j==max_index)
            {
                System.out.println(sm.nextToken());
                break;
            }
            sm.nextToken();
            j++;
        }
        
    }
    
    
}

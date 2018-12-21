package file;

import java.util.*;
import java.io.*;

public class File {

    public static void main(String[] args) throws IOException{
        try{
         BufferedReader br=new BufferedReader(new FileReader("read.txt"));
         StringTokenizer st=null;
         String s=new String();
         while((s=br.readLine())!=null)
         {
             st=new StringTokenizer(s," ");
             while(st.hasMoreTokens())
             System.out.println(st.nextToken());
         }
        br.close();
        
        
        }catch(Exception e)
        {
            System.out.println("File missing");
        }
    }
    
}


package ctque;


public class Ctque {

    public final int p =20;
    public static int m=10;

    public static void main(String[] args) {
   
      byte b=0;           // line 1
      b=(byte) ((byte)b+2);
      System.out.println(b); //  line 2
      b=(byte) (b-(byte)2);
      System.out.println(b);//   line 3
      b=(byte)(2-2);
      System.out.println(b);//   line 4
      int q;                  // line 5
      //q=p;                  // line 6
      q=m; // line 7

    
    }
    
}

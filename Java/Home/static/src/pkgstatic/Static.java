package pkgstatic;
public class Static {
    public static int i=30;
    public static void set(int p)
    {
        i=p;
    }
    public static void main(String[] args) {
      //Static s=new Static();
      //s.i=20;
        set(200);
        System.out.println(i);
    }
    
}

package finalvar;

public class Finalvar {
    static int j=20;
    //static final  int i=40;
    static final  int i=40;
    void set(int p)
    {
        j=p+i;
        
    }
    
    public static void main(String[] args) {
               Finalvar f=new Finalvar();
               f.set(100);
               System.out.println(f.j+f.i); // 140+40 =180
// TODO code application logic here
    }
    
}

package callbyvalue;

class Callbyreference{
    
    public void seti(Callbyvalue cv) // this is taking an obejct
    {
        cv.i=40;
       
    }
}
public class Callbyvalue {
    int i;
    public void seti(int i){   // this is taking a single value
        this.i=i;
        i=30;
    }
    public static void main(String[] args) {
        int i=20;
        Callbyvalue cv=new Callbyvalue();
        cv.seti(i);
        System.out.println(i);
        cv.seti(30);
        System.out.println(cv.i);
        Callbyreference cf=new Callbyreference();
        cf.seti(cv);
        System.out.println(cv.i);
    }
    
}

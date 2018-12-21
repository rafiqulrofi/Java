package Callbyvalue2;

class Callbyvalue2{
    
    public void seti(Callbyvalue2 cv) // this is taking an obejct
    {
        cv.i=40;
    }
}
public class callbyvalue2 {
    int i;
    public void seti(int i){   // this is taking a single value
        //this.i=i;
        i=30;
    }
    public static void main(String[] args) {
        int i=20;
        Callbyvalue2 cv=new Callbyvalue2();
        cv.seti(i);
        System.out.println(i);
        //cv.seti(30);
        //System.out.println(cv.i);
        Callbyvalue2 cf=new Callbyvalue2();
        //cf.seti(cv);
       // System.out.println(cv.i);
    }
    
}

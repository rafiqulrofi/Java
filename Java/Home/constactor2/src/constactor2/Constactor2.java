
package constactor2;


public class Constactor2 {

    int h;
    int l;
    int w;
    Constactor2()
    {
        h=30;
        l=20;
        w=10;
    }
    void display()
    {
        System.out.println("Volume of area: ");
        System.out.println(h*l*w);
    }
    public static void main(String[] args) {
        
    Constactor2 c= new Constactor2();
     
     c.display();
    
    }
    
}

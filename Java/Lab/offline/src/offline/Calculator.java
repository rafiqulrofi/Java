package offline;
import java.util.*;
class Add{
    public void addition(Calculator c)
    {
        c.result = c.a+c.b;
    }
}
class Sub{
    public void subtraction(Calculator c)
    {
        c.result = c.a-c.b;
    }
}
class Pro{
    
    public void Product(Calculator c){
        c.result=c.a* c.b;
    
    }

}
class Div{
    
    public void Division(Calculator c){
        c.result=c.a /c.b;
    
    }

}
public class Calculator {
    public double a,b,result;
    public Calculator()
    {
        a=b=result=0;
    }
    public void input()
    {
        Scanner s=new Scanner(System.in);
        a= s.nextInt();
        b= s.nextInt();
    }
    public void display()
    {
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.input();
        Add a=new Add();
        a.addition(c);
        c.display();
        Sub s=new Sub();
        s.subtraction(c);
        c.display();
        Pro p=new Pro ();
        p.Product(c);
        c.display();
        Div d=new Div ();
        d.Division(c);
        c.display();
    }
    
}

package nested;

public class A {
    int i;
    B b=new B();
    public class B{
        int j;
        B()
        {
            j=10;
            i=20;
            System.out.println(j);
            System.out.println(i);
        }
    }
    A()
    {
        //B b=new B();
        b.j=20;
    }
    void setbj(int k)
    {
        //B b=new B();
        b.j=k;
    }
    
    public static void main(String[] args) {
        A a=new A();
        a.setbj(20);
    //    a.b.j=20;
    }
    
}

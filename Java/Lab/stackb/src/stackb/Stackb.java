package stackb;
public class Stackb {
    public int top;
    public int s[]=new int [3]; // size of the stack is 3
    public Stackb()
    {
        top=0;
    }
    public void push(int item)
    {
        if(top<3)
        {
            s[top] =item;
            top++;
        }
        else
        {
            System.out.println("Stack full");
        }
    }
    public int pop()
    {
        if(top>0)
        {
        top--;
        return s[top];
        }
        else
        {
            System.out.println("Stack empty");
            return -1;
        }
    }
    
    
    public static void main(String[] args) {
          Stackb p=new Stackb(); //  default constructor
          p.push(10);
          p.push(20);
          p.push(30);
        //  p.push(40);
          System.out.println(p.pop());
          System.out.println(p.pop());
          System.out.println(p.pop());
          System.out.println(p.pop());
    }
    
}

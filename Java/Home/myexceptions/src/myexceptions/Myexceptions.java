package myexceptions;

public class Myexceptions {

    public static void main(String[] args) {
        int i,j;
        int a[]=new int[5];
        i=5;
        j=0;
        try{
            System.out.println(i/j);
            a[2]=20;
        }
        //catch(Exception e){
        //    System.out.println(e);
        //}
        catch(ArithmeticException e){
            System.out.println("Divide by Zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array limit crossed");
        }
        finally{
            System.out.println("I must execute");
        }
    }
    
}

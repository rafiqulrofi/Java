package thread2;
/* Creating Thread by exteding thread */

class MyThread extends Thread {
    Thread t;
    public MyThread(String s)
    {
        t=new Thread(this,s);
        System.out.println(" is creating");
        start();
    }
    public void run() {
      try {
         for(int i = 1; i <=5; i++) {
            System.out.println("Thread: " + t.getName()+": value: " + i);
            Thread.sleep(500);
         }
     } catch (InterruptedException e) {
     }
     System.out.println("Thread "+t.getName()  + " exiting.");
   }
}

public class Main {

    public static void main(String[] args) {
        MyThread t1=new MyThread("Thread1");
        MyThread t2=new MyThread("Thread2");
        
    }

}

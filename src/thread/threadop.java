package thread;

public class threadop {
    public static void main(String[] args) {
        System.out.println("program satrted");
        int x = 56+78;
        System.out.println("sum is :"+x);
         Thread t =Thread.currentThread();
        System.out.println("current running threat is"+t.getName());
        t.setName("naryan");
     try {
         Thread.sleep(5000);
     }
     catch (Exception e)
     {
         System.out.println(e);
     }
        System.out.println("current running threat is"+t.getName());
        System.out.println("program ended");
        userThread k = new userThread();
        Thread m = new Thread(k);
        m.start();
    }


}

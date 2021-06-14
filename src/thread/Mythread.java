package thread;

public class Mythread  implements Runnable{
    public void run() {
        System.out.println("hello");
        for (int i = 0; i <10; i++) {
            System.out.println(i);
            try
            {
                Thread.sleep(2000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }

    }
    public static void main(String[] args)
    {
        Mythread m = new Mythread();
        Thread t = new Thread(m);
        t.start();
        AnotherThread a = new AnotherThread();
        a.start();

    }
}



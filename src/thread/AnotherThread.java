package thread;

public class AnotherThread extends Thread
{
    public void run()
    {
    for (int i=10;i>0;i--)
    {
        System.out.println(i);
        try
        {
            sleep(2000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    }
}

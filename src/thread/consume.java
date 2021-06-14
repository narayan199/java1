package thread;

public class consume extends Thread{
    public comapny c;
    consume(comapny c)
    {
        this.c=c;
    }
    @Override
    public void run() {
        int i =1;
        while (true)
        {
            this.c.consume_item(i);
            try {
                Thread.sleep(2000);
            }
            catch (Exception e)
            {
                System.out.println("error");
            }
            i++;
        }
    }
}

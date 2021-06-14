package thread;

public class producer extends Thread{
    comapny c;
    producer(comapny c)
    {
        this.c =c;
    }
    public void run()
    {
        int i =1;
        while (true)
        {
            this.c.produce_item(i);
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

package thread;

public class comapny {
    int n ;
     synchronized public void produce_item(int n ) {
    this.n=n;
        System.out.println("produced"+this.n);
    }
    synchronized  public int  consume_item(int n) {
        this.n=n;
        System.out.println("consumed"+this.n);
        return this .n;
    }

    public static void main(String[] args) {
        comapny m = new comapny();
        producer p= new producer(m);
        consume c=new consume(m);
        p.start();
        c.start();
    }
}

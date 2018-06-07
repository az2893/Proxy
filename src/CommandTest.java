public class CommandTest {

    public static void main(String[] args) {
        Barbecuer b=new Barbecuer();
        Waiter waiter= new Waiter();
        Command yrc=new KaoYangRouChuan(b);

        waiter.setOrder(yrc);
        Command jc= new KaoJiChi(b);
        waiter.setOrder(jc);

            waiter.Notify();
    }
}

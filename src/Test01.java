

public class Test01
{

    public static void main(String[] args)
    {
        Singleton3 singleton=Singleton3.getInstance();
        System.out.println("counter1="+singleton.counter1);
        System.out.println("counter2="+singleton.counter2);
    }
}

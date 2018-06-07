public class Test {

    public static void main(String[] args) {
        SchoolGril girl=new SchoolGril();
        girl.name="河洛";
        Proxy proxy= new Proxy(girl);
        proxy.GiveDolls();
        proxy.GiveFlower();
        proxy.GiveChocolate();
    }


}

public class AdapteTest {

    public static void main(String[] args) {
        Player p1= new Forwards("卢卡哇");
        Player p2=new Translator("宫城良田");
        Player p3= new Guards("三井");

        p1.attack();
        p2.defense();
        p3.attack();
    }
}

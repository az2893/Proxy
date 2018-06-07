public class ZhongJieZheTest {


    public static void main(String[] args) {
        UniteNations1 s=new UniteNations1();
        USA c1= new USA(s);
        Irap c2= new Irap(s);
        s.setColleague1(c1);
        s.setColleague2(c2);

        c1.Declare("不准研制核武器，否则我们要发动战争了");

        c2.Declare("我们没有核武器，也不怕侵略");
    }
}

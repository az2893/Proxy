public class Pursuit implements GiveGift {
    //追求者类

    public Pursuit(SchoolGril schoolGril) {
        this.schoolGril = schoolGril;
    }

    SchoolGril schoolGril;

    @Override
    public void GiveDolls() {
        System.out.println(schoolGril.name+"送你洋娃娃");
    }

    @Override
    public void GiveFlower() {
        System.out.println(schoolGril.name+"送你小花花");
    }

    @Override
    public void GiveChocolate() {
        System.out.println(schoolGril.name+"送你巧克力");
    }
}

public class Proxy implements  GiveGift {
    Pursuit boy;
    public Proxy(SchoolGril girl){
        boy = new Pursuit(girl);
    }
    @Override
    public void GiveDolls() {
        boy.GiveDolls();
    }

    @Override
    public void GiveFlower() {
        boy.GiveFlower();
    }

    @Override
    public void GiveChocolate() {
        boy.GiveChocolate();
    }
}

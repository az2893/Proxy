public class Translator extends Player {

    Center center= new Center(name);
    public Translator(String name) {
        super(name);
       // Center center= new Center(name);
    }

    @Override
    public void attack() {
        center.jingong();
    }

    @Override
    public void defense() {
        center.fangyu();
    }
}

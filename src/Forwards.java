public class Forwards extends Player {
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(this.name+"前锋进攻");
    }

    @Override
    public void defense() {
        System.out.println(this.name+"前锋防御");
    }
}

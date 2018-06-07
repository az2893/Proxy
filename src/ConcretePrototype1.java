public class ConcretePrototype1 extends  Prototype {
    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype Clone() throws CloneNotSupportedException {
        System.out.println("111111111");
        return (Prototype)this.clone();
    }
}

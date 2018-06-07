public abstract class Component {

    public Component(String name) {
        this.name = name;
    }

    protected String name;

    public abstract void add(Component c);
    public abstract void Remove(Component c);
    public abstract void Display(int level);

}

public  abstract class Observer {
    public Observer(String name, Secretary secretary) {
        this.name = name;
        this.secretary = secretary;
    }

    public String name;
    public Secretary secretary;

    public abstract  void Update();
}

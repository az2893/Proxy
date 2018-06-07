public class SleepObserver extends Observer {
    public SleepObserver(String name, Secretary secretary) {
        super(name, secretary);
    }

    @Override
    public void Update() {
        System.out.println(this.name+"别睡觉了，老板回来了");
    }
}

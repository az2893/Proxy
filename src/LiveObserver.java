public class LiveObserver extends Observer {
    public LiveObserver(String name, Secretary secretary) {
        super(name, secretary);
    }
    public void Update(){
        System.out.println( this.name+"别看直播了，老板刚刚回来了");
    }
}

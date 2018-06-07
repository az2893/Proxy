public class TestObserver {


    public static void main(String[] args) {
        //前台
        Secretary secretary= new Secretary();

        //刷抖音的同事
        Observer ob1=new StockObserver("温婉",secretary);
        Observer ob2=new StockObserver("莉哥",secretary);
        Observer ob3=new LiveObserver("Jony J",secretary);
        Observer ob4= new SleepObserver("azhe",secretary);

        secretary.Attach(ob1);
        secretary.Attach(ob2);
        secretary.Attach(ob3);
        secretary.Attach(ob4);

        //老板回来了
        secretary.notify2();
    }
}

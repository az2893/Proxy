public class StockObserver extends Observer{


    public StockObserver(String name, Secretary secretary) {
        super(name, secretary);
    }


    public void Update(){
        System.out.println( this.name+"别拍抖音了，老板刚刚回来了");
    }
}

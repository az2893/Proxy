public class Irap extends Country {
    public Irap(UnitedNations mediator) {
        super(mediator);
    }
    public void Declare(String message){
        mediator.Declare(message,this);
    }
    public void GetMessage(String message){
        System.out.println("伊拉克获得对方信息"+ message);
    }

}

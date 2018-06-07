import java.util.ArrayList;
import java.util.List;

public class Secretary {
    private List<Observer> observerList= new ArrayList<Observer>();

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    private String action;

    //增加

    public void Attach(Observer observer)
    {
        observerList.add(observer);
    }

    //通知
    public void notify2(){
        for ( Observer observer:observerList) {
            observer.Update();
        }
    }


}

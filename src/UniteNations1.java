public class UniteNations1 extends  UnitedNations {

    public USA getColleague1() {
        return colleague1;
    }

    public void setColleague1(USA colleague1) {
        this.colleague1 = colleague1;
    }

    private USA colleague1;

    public Irap getColleague2() {
        return colleague2;
    }

    public void setColleague2(Irap colleague2) {
        this.colleague2 = colleague2;
    }

    private Irap colleague2;


    public UniteNations1( ) {

    }

    @Override
    public void Declare(String message, Country colleague) {
        if(colleague==colleague1){
            colleague2.GetMessage(message);
        }
        else
        {
            colleague1.GetMessage(message);
        }
    }
}

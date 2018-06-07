

public class NoonStatus  extends Status {
    @Override
    public void WriteProgram(Work w) {
        if(w.Hour<14){
            System.out.println("不行了 要睡着了");
        }
        else
        {
            w.status=new AfterNoonStatus();
            w.writeProgram();
        }
    }
}

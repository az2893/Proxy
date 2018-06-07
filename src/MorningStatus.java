

public class MorningStatus extends Status {
    @Override
    public void WriteProgram(Work w) {
        if(w.Hour<12){
            System.out.println("现在写程序的状态一级棒");
        }
        else{
            w.status=new NoonStatus();
            w.writeProgram();
        }
    }
}

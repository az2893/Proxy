public class AfterNoonStatus extends Status
{
    @Override
    public void WriteProgram(Work w) {
        if(w.Hour<18){
            System.out.println("状态又恢复了一波。。。。。。");
        }
        else{
            w.status=new EveningStatus();
            w.writeProgram();
        }
    }
}

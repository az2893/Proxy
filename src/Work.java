public class Work {
    public int Hour;
    public Status status;

    public Work( ) {
       this.status=new MorningStatus();
    }

    public void writeProgram( ){
        status.WriteProgram(this);
    }

}

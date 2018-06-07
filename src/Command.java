public abstract class Command {
    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    protected  Barbecuer receiver;

    public abstract void ExcuteCommand();

}

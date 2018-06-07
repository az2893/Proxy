public class KaoYangRouChuan extends Command {
    public KaoYangRouChuan(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void ExcuteCommand() {
        receiver.kaoyangrouchuan();
    }
}

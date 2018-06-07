public class KaoJiChi extends Command {
    public KaoJiChi(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void ExcuteCommand() {
        receiver.jichi();
    }
}

public class MementoTest {

    public static void main(String[] args) {
        //boss qian

        GameRole gameRole= new GameRole(100,100,100);
        gameRole.showStats();

        //save

        RoleStateCaretaker s=new RoleStateCaretaker();
        s.setMemento(gameRole.saveStats());

        // da boss

        gameRole.figth();
        gameRole.showStats();

        //recovery

        gameRole.recoveryState(s.getMemento());
        gameRole.showStats();
    }

}

public abstract class Player {
    public Player(String name) {
        this.name = name;
    }

    public String name;

    public abstract void attack();

    public abstract void defense();
}

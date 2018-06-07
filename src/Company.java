public abstract class Company {

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public abstract void add(Company c);
    public abstract void remove(Company c);
    public abstract void disPlay(int level);
    public abstract void LineOfDuty(String str);//履行的职责

}

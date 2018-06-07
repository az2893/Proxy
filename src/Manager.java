

public abstract class Manager {

    public Manager(String name) {
        this.name = name;
    }

    protected  String name;

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    protected Manager superior;

    public abstract void RequestApplications(Request request);

}

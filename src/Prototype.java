public abstract  class Prototype implements Cloneable{

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    public abstract Prototype Clone() throws CloneNotSupportedException;

}

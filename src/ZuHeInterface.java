public abstract class ZuHeInterface {

    public ZuHeInterface getZ() {
        return z;
    }

    public void setZ(ZuHeInterface z) {
        this.z = z;
    }

    private ZuHeInterface z;

    public ZuHeInterface(ZuHeInterface z) {
        this.z = z;
    }

    public abstract void add(ZuHeInterface z);
    public abstract void remove(ZuHeInterface z);
    public abstract void print();
}

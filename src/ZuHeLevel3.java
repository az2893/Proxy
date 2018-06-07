public class ZuHeLevel3 extends ZuHeInterface {
    public ZuHeLevel3(ZuHeInterface z) {
        super(z);
    }

    @Override
    public void add(ZuHeInterface z) {

    }

    @Override
    public void remove(ZuHeInterface z) {

    }

    @Override
    public void print() {
        System.out.println("我是叶子节点"+this.getZ());
    }
}

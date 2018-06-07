import java.util.ArrayList;
import java.util.List;

public class ZuHelevel2 extends  ZuHeInterface {

    private List<ZuHeInterface> list= new ArrayList<ZuHeInterface>();

    public ZuHelevel2(ZuHeInterface z) {
        super(z);
    }


    @Override
    public void add(ZuHeInterface z) {
        list.add(z);
    }

    @Override
    public void remove(ZuHeInterface z) {
        list.remove(z);
    }

    @Override
    public void print() {
        System.out.println("我是爸爸 我先输出"+this.getZ());
        for (ZuHeInterface zuHeInterface:list) {
            zuHeInterface.print();
        }

    }

}

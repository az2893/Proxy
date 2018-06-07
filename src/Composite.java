import java.util.ArrayList;
import java.util.List;

public class Composite extends  Component {

    private List<Component> children= new ArrayList<Component>();
    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void Remove(Component c) {
        children.remove(c);
    }

    @Override
    public void Display(int level) {
        System.out.println("--"+this.name+" 当前是"+level+"级元素");
        for (Component c:children) {
            c.Display((level+1));
        }
    }
}

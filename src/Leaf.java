public class Leaf extends Component {


    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("Can not add to leaf");
    }

    @Override
    public void Remove(Component c) {
        System.out.println("Can not remove from leaf");
    }

    @Override
    public void Display(int level) {
        System.out.println(new String ("－－－－")+name+(level));
    }
}

public class ComponentTest {
    public static void main(String[] args) {
        Composite root=new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite copm= new Composite("Composite X");
        copm.add(new Leaf("Leaf XA"));
        copm.add(new Leaf("Leaf XB"));

        root.add(copm);

       // root.Display();
        Composite comp2= new Composite("Composite XY");
        comp2.add(new Leaf("Left XYA"));
        comp2.add(new Leaf("Left XYB"));
        copm.add(comp2);

        root.add(new Leaf("Left C"));

        root.Display(1);
    }
}

public class TestPrototype {

    public static void main(String[] args) throws CloneNotSupportedException {
//        ConcretePrototype1 c= new ConcretePrototype1("I");
////        ConcretePrototype1 c1= (ConcretePrototype1)c.Clone();
////        System.out.println(c1.getId());



        Resume s= new Resume("AcRush");
        s.SetPersonalInfo("男","27");
        s.SetWorkExperience("2006-2010","stinghua university");

        Resume b=(Resume)s.Clone();
        b.SetWorkExperience("2010","google");

        s.Display();
        b.Display();
    }
}

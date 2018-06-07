import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends  Company {
    private List<Company> companyList=new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
            companyList.add(c);
    }

    @Override
    public void remove(Company c) {
        companyList.remove(c);
    }

    @Override
    public void disPlay(int level) {
        System.out.println("当前是"+level+"级"+this.getName());
        for (Company c:companyList) {
            c.disPlay(level+1);
        }
    }

    @Override
    public void LineOfDuty(String str) {
        for (Company c:companyList) {
            c.LineOfDuty(str);
        }
    }
}

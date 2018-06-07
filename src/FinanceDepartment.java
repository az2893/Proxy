public class FinanceDepartment extends  Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void disPlay(int level) {
        System.out.println(this.getName()+"第"+level+"级");
    }

    @Override
    public void LineOfDuty(String str) {
        System.out.println(this.getName()+"主要管理财务情况");

    }
}

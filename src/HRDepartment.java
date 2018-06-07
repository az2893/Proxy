public class HRDepartment extends  Company {
    public HRDepartment(String name) {
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
        System.out.println(this.getName()+"管理人员招聘与离职");

    }
}

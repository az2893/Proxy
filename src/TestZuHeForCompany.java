public class TestZuHeForCompany {

    public static void main(String[] args) {
        ConcreteCompany c= new ConcreteCompany("大中华区总公司");
        c.add(new HRDepartment("总公司人事部"));
        c.add(new FinanceDepartment("总公司财务部"));
        ConcreteCompany subcompany= new ConcreteCompany("北京分公司");
        subcompany.add(new HRDepartment("北京分公司人事部"));
        subcompany.add(new ConcreteCompany("海淀区办事处"));
        c.add(subcompany);
        c.disPlay(1);
        c.LineOfDuty("z");
    }

}

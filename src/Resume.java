public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience;
    public Resume(String name){
        this.name=name;
        workExperience= new WorkExperience();
    }
    private Resume (WorkExperience workExperience){
        this.workExperience=(WorkExperience)workExperience.Clone();
    }
    public void SetPersonalInfo(String sex,String age){
        this.sex=sex;
        this.age=age;
    }
    public void SetWorkExperience(String timeArea,String company){
        workExperience.setTimeArea(timeArea);
        workExperience.setCompany(company);
    }
    public void Display(){
        System.out.println(name+"  "+sex+"   "+age);
        System.out.println("工作经验:"+workExperience.getTimeArea()+"   "+workExperience.getCompany());
    }
    public Object Clone() {

            Resume obj= new Resume(workExperience);
            obj.name=this.name;
            obj.sex=this.sex;
            obj.age=this.age;
            //
            return obj;


    }



}

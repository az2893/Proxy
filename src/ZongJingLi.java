public class ZongJingLi extends  Manager {

    public ZongJingLi(String name) {
        super(name);
    }

    @Override
    public void RequestApplications(Request request) {
        if(request.getRequestType().equals("请假")) {
            System.out.println(name + "批准" + request.getRequestContent());
        }
        else if(request.getRequestType().equals("加薪")  && request.getNumber()<=500){
            System.out.println(name + "同意" + request.getRequestContent());
        }
        else if(request.getRequestType().equals("加薪") && request.getNumber()>500){
            System.out.println("再说吧");
        }
    }
}

public class ZongJian extends Manager {
    @Override
    public void RequestApplications(Request request) {
        if(request.getRequestType().equals("请假") && request.getNumber()<= 5){
            System.out.println(name+"批准"+request.getRequestContent());
        }
        else{
            if(superior!=null)
                superior.RequestApplications(request);
        }
    }

    public ZongJian(String name) {
        super(name);
    }
}

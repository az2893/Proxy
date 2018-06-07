public class CommonManage extends  Manager {
    public CommonManage(String name) {
        super(name);
    }

    @Override
    public void RequestApplications(Request request) {
            if(request.getRequestType().equals("请假") && request.getNumber()<=2){
                System.out.println(name+"批准"+request.getRequestContent());
            }
            else{
                if(superior != null)
                    superior.RequestApplications(request);
            }
    }
}

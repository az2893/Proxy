public class ZeRenLianTest {

    public static void main(String[] args) {
        CommonManage jinli=new CommonManage("金立");
        ZongJian zj=new ZongJian("李总监");
        ZongJingLi zjl=new ZongJingLi("总经理");
        jinli.setSuperior(zj);
        zj.setSuperior(zjl);

        Request request=new Request();
        request.setRequestType("请假");
        request.setRequestContent("我，请假，6天");
        request.setNumber(2);
        jinli.RequestApplications(request);
        //总结
        /**
         * 先设置好上下级关系
         *
         * 总最底层开始处理请求，如果满足则执行结束，如果不满足，转到上级继续执行。
         * */
    }
}

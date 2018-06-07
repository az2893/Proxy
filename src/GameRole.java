public class GameRole {

    public GameRole(int shengmingli, int gongjili, int fangyuli) {
        this.shengmingli = shengmingli;
        this.gongjili = gongjili;
        this.fangyuli = fangyuli;
    }

    int shengmingli;
    int gongjili;
    int fangyuli;

    public void showStats(){
        System.out.println("当前角色生命力为："+this.shengmingli);
        System.out.println("当前角色攻击力为："+this.shengmingli);
        System.out.println("当前角色防御力为："+this.shengmingli);
    }
    // save
    public RoleStateMemento saveStats(){

        return new RoleStateMemento(this.shengmingli,this.gongjili,this.fangyuli);
    }
    //recovery
    public void recoveryState(RoleStateMemento roleStateMemento){
        this.shengmingli=roleStateMemento.shengmingli;
        this.gongjili=roleStateMemento.gongjili;
        this.fangyuli=roleStateMemento.fangyuli;
    }

    public void figth(){
        this.shengmingli=1;
        this.gongjili=1;
        this.fangyuli=0;
    }


}

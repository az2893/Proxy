public class Guards extends  Player {
    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(this.name+"后卫冲啊！！！！！宫城良田附体 你给我上！");
    }

    @Override
    public void defense() {
        System.out.println(this.name+"溜溜球之无敌溜溜球，先溜为敬");

    }
}

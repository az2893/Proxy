public class Boy {
    public Boy(String toName, String name, String wuti) {
        this.toName = toName;
        this.name = name;
        this.wuti = wuti;
        this.send();
    }

    //receiver
    public String toName;

    public String name;

    public String wuti;

    public void send(){
        System.out.println(name+"送了一个"+wuti+" 给"+toName);
    }
}

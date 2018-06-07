public class Fund  {
    Stock1 s1;
    Stock2 s2;
    Stock3 s3;

    public Fund(){
        s1=new Stock1();
        s2=new Stock2();
        s3=new Stock3();
    }
    public void mathodA(){

        s1.buy();
        s2.buy();
    }
    public void mathodB(){
        s1.sell();
        s3.buy();
    }
}

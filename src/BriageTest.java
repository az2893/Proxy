public class BriageTest {

    public static void main(String[] args) {
        HandsetBrand ab;
                ab=new HandsetBrandN();
        ab.setSoft(new HandsetGame());
        ab.run();

        ab.setSoft(new HandsetAddressList());
        ab.run();

        ab= new HandsetBrandM();
        ab.setSoft(new HandsetAddressList());
        ab.run();
        ab.setSoft(new HandsetMp3());
        ab.run();

    }
}

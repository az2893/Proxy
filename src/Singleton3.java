public class Singleton3 {


        private static  Singleton3 singleton=new Singleton3();
        public static int counter1;
        public static int counter2=0;

        private Singleton3()
        {
            counter1++;
            counter2++;
        }
        public static Singleton3 getInstance()
        {
            return singleton;
        }

}

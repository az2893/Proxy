public class Singleton {

    private static Singleton singleton;
    public  static int count=0;
    private Singleton(){
            ++count;
    }
    public static Singleton getSingleton(){
        if(singleton==null) {
            synchronized (Singleton.class) {
                if (singleton == null)

                    singleton = new Singleton();
            }
        }
        return singleton;
    }
}

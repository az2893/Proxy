import static java.lang.Thread.sleep;

public class SingletonTest implements Runnable{

    public static void main(String[] args) {
//        Singleton s1=Singleton.getSingleton();
//        Singleton s2= Singleton.getSingleton();
//        //Singleton s3= new Singleton();
//        if(s1.equals(s2)){
//            System.out.println("两个对象是相同对象");
//        }
//        else{
//            System.out.println("两个对象是不同对象");
//        }
        SingletonTest s=new SingletonTest();
          Thread t= new Thread(s);
          Thread t2= new Thread(s);
          t.start();
          t2.start();
//        Runnable task = ()->{
//            String threadName = Thread.currentThread().getName();
//            Singleton s1 = Singleton.getSingleton();
//            System.out.println("线程 " + threadName + "\t => " + s1.hashCode());
//        };
//        // 模拟多线程环境下使用 Singleton 类获得对象
//        for(int i=0;i<1000;i++){
//            new Thread(task,"" + i).start();
//        }


    }

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(Singleton.getSingleton().hashCode()+"     "+Singleton.count);
         //   System.out.println(i);
            try {
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

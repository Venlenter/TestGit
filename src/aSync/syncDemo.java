package aSync;

public class syncDemo {
    public static void main(String[] args) {
        MyExecutor myExecutor = new MyExecutor();
        try {
            //myExecutor.fun();
            System.out.println("你先睡着，我先回家啦");
        } catch (Exception e) {
            throw new RuntimeException("业务程序报错了");
        }
        System.out.println("接口执行完了");
    }
}

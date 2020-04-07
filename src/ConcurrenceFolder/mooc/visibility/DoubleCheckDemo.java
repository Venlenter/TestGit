package ConcurrenceFolder.mooc.visibility;

/**
 * doubleCheckDemo
 *
 * @author venlenter
 * @Description:
 * @since unknown, 2020-03-21
 */
public class DoubleCheckDemo {
    private volatile String token = "";
    public String getToken() {
        if (token.isEmpty()) {
            synchronized (DoubleCheckDemo.class) {
                if (token.isEmpty()) {
                    //做相应的token逻辑
                    token = "ABCDE";
                }
            }
        }
        return token;
    }

    public static void main(String[] args) {
        DoubleCheckDemo demo = new DoubleCheckDemo();
        new Thread(() -> System.out.println(demo.getToken())).start();
        new Thread(() -> System.out.println(demo.getToken())).start();
    }
}

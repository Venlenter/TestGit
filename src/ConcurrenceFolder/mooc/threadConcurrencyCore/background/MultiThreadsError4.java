package ConcurrenceFolder.mooc.threadConcurrencyCore.background;

/**
 * MultiThreadsError4
 *
 * @author venlenter
 * @Description: 初始化未完毕，就this赋值
 * @since unknown, 2020-05-12
 */
public class MultiThreadsError4 {
    static Point point;

    public static void main(String[] args) throws InterruptedException {
        new PointMaker().start();
        Thread.sleep(105);
        if (point != null) {
            System.out.println(point);
        }
    }
}

class Point {
    private final int x, y;

    Point(int x, int y) throws InterruptedException {
        this.x = x;
        //这里先行给point赋值this，此时外部拿到point对象只有x，没有y的值
        MultiThreadsError4.point = this;
        Thread.sleep(100);
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class PointMaker extends Thread {
    @Override
    public void run() {
        try {
            new Point(1, 1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

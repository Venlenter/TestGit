package interfaceClass;

/**
 * 调用静态内部类，输出数组的最大值和最小值
 */
public class ArrayAlg {
    //静态内部类
    public static class Pair {
        private double first;
        private double second;

        Pair(double f, double s) {
            first = f;
            second = s;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }
    }

    public static Pair minmax(double[] values) {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (double v : values) {
            if (min > v) min = v;
            if (max < v) max = v;
        }
        return new Pair(min, max);
    }
}

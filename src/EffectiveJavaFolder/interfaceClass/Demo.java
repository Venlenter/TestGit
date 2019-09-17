package EffectiveJavaFolder.interfaceClass;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException, IndexOutOfBoundsException, Exception{
        throw new EOFException("Hello World");

        /*try {
            FileInputStream fileInputStream = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
        /*double[] d = new double[20];
        for (int i = 0; i < d.length; i++) {
            d[i] = 100 * Math.random();
        }
        ArrayAlg.Pair p = ArrayAlg.minmax(d);
        System.out.println("min= " + p.getFirst());
        System.out.println("max= " + p.getSecond());*/

        /*ArrayList<String> friends = new ArrayList<>();
        friends.add("Mary");
        friends.add("Harry");

        new ArrayList<String>() {{ add("Mary"); add("Harry"); }};*/

        /*TalkingClock clock = new TalkingClock(1000, true);
        clock.start(1000, true);
        JOptionPane.showMessageDialog(null, "Quit");
        System.exit(0);*/

        /*ActionListener listener = new TimePrinter();
        //ms,10s
        Timer t = new Timer(2000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit?");
        System.exit(0);*/
        //最终修改测试
        //第四次push

        //测试rebase1+2
    }
}

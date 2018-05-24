package interfaceClass;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Demo {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start(1000,true);
        JOptionPane.showMessageDialog(null, "Quit");;
        System.exit(0);

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

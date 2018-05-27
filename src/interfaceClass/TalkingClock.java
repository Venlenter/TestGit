package interfaceClass;

import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * 定时器
 */
public class TalkingClock {
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    //匿名内部类
    public void start(int interval, final boolean beep) {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                System.out.println("At the tone, the time is " + now);
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer t = new Timer(interval, listener);
        t.start();
    }
    //局部内部类
    /*public void start(int interval, boolean beep) {
        class TimePrinter implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                Date now = new Date();
                System.out.println("At the tone, the time is " + now);
                if (beep) Toolkit.getDefaultToolkit().beep();
                doNothing();
            }
        }
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }*/
    private void doNothing() {}
}

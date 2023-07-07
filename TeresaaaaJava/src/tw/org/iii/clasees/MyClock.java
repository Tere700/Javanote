package tw.org.iii.clasees;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class MyClock implements Runnable {
    @Override
    public void run() {
        while (true) {
            // 更新时钟的显示
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    // 在此处更新时钟的显示
                    // 例如，myClock.setText("更新后的时钟显示");
                }
            });

            try {
                Thread.sleep(1000); // 每秒更新一次时钟
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
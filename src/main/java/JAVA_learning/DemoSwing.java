package JAVA_learning;

import javax.swing.*;
import java.awt.*;

public class DemoSwing {

    public void addComponentsToPane(Container pane) {

        //宣告定義元件與對應處理事件...
        JLabel jLabel = new JLabel("哈囉");

        //在 Pane 畫面中加入元件，pane.add(...);
        pane.add(jLabel);
    }

    private DemoSwing() {
        JFrame frame = new JFrame("Bitch!!!!!!!!!!!!!!!!!!!!!!");

        // 獲取螢幕解析度
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        // 設定視窗大小佔螢幕四分之一
        frame.setSize(dimension.width/2, dimension.height/2);

        //設定視窗顯示在螢幕畫面中間位置
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//設定關閉可以關掉程式

        //在 Pane 畫面中加入元件
        addComponentsToPane(frame.getContentPane());
        //frame.pack();
        frame.setVisible(true);
    }

    //最一開始程式進入點
    public static void main(String[] args) {
        //使用 invokeLater 確保 UI 在排程執行緒內
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DemoSwing();
            }
        });
    }
}
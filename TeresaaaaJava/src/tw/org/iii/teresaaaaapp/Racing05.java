package tw.org.iii.teresaaaaapp;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Racing05 extends JFrame {
	
    private static final int TRACK_LENGTH = 900; // 賽道長度
    private JPanel trackPanel;
    private JButton startButton;
    private JLabel[] carLabels;
    private BackgroundPanel backgroundPanel;
    private int[] carPositions;
    private boolean running;
    private int rank;
    
    
    
    public Racing05() {

 

        setTitle("賽車遊戲");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 建立賽道面板
        trackPanel = new BackgroundPanel();
        trackPanel.setLayout(new BoxLayout(trackPanel, BoxLayout.Y_AXIS));
        backgroundPanel = new BackgroundPanel();
        trackPanel.add(backgroundPanel);

        // 建立賽車標籤
        
        carLabels = new JLabel[8];
        carLabels [0] = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("1.png")));
        carLabels [1] = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("2.png")));
        carLabels [2] = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("3.png")));
        carLabels [3] = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("4.png")));
        carLabels [4] = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("5.png")));
        carLabels [5] = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("6.png")));
        carLabels [6] = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("7.png")));
        carLabels [7] = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("8.png")));
        for (int i = 0; i < carLabels.length; i++) {
        	carLabels[i].setName("Car" + (i+1));
            trackPanel.add(carLabels[i]);
        }
        

        // 建立開始按鈕
        startButton = new JButton("開始");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startRace();
            }
        });       
       
       
        // 將元件加入視窗
        
        JPanel button = new JPanel(new FlowLayout());
       
        button.add(startButton);
        add(trackPanel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        setSize(1250,900);
        setResizable(false);
        setLocationRelativeTo(null); // 置中顯示視窗
        setVisible(true);
    }
    
    private void startRace() {
        startButton.setEnabled(false);
        rank=0;
        carPositions = new int[8]; //初始化車子的位置
        running = true;
        Thread raceThread = new Thread() {
            @Override
            public void run() {
                while (running) {
                    moveCars();
                    try {
                        Thread.sleep(30+ (int)(Math.random()*45)); // 休眠10毫秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        raceThread.start();
     
    }

    
    private void moveCars() {
    	for (int i = 0; i < carPositions.length; i++) {
        	carPositions[i] += (int) (Math.random() * 25); // 賽車每次前進的距離
            if (carPositions[i] >= TRACK_LENGTH ) { //終點線的位置
                rank++;
                stopRace();
                String carName = carLabels[i].getName();
                JOptionPane.showMessageDialog(this, carName + " 到達終點！");
           
            	
            }
            carLabels[i].setLocation(carPositions[i], carLabels[i].getY());
        }
    }


    private void stopRace() {
    	running = false;
    	startButton.setEnabled(true);
        JOptionPane.showMessageDialog(this, "賽車到達終點！");
    }


    private class BackgroundPanel extends JPanel { //加入背景
    	  	
    		private BufferedImage image;

    	    public BackgroundPanel() {
    	        try {                
    	        	image = ImageIO.read(getClass().getClassLoader().getResource("8893.jpg"));
    	        } catch (IOException ex) {
    	            System.out.println(ex);
    	        }
    	     }

    	     @Override
    	     public void paintComponent(Graphics g) {
    	         super.paintComponent(g); 
    	         g.drawImage(image, 0, 0, null); 
    	     }

    	}
    
    public static void main(String[] args) {
    			new Racing05();
            }
        ;
   }


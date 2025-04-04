package main;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MainPanel extends JPanel implements Runnable {


    Thread mainThread;
    Window window;

    public MainPanel(Window window){
        this.window = window;
        setPreferredSize(new Dimension(window.getWidth(), window.getHeight()));
        setBackground(Color.black);
        setDoubleBuffered(true);
    }

    public void startThread(){
        mainThread = new Thread(this);
        mainThread.start();
    }

    @Override
    public void run() {
        update();
        repaint();
    }
    

    private void update(){
    
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        System.out.println("paint component");
        g2.setColor(Color.GREEN);
        g2.fillRect(window.getWidth()/2 - 50, window.getHeight()/2 - 50, 100, 100);

        g2.dispose();
    }
}

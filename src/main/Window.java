package main;

import javax.swing.JFrame;

public class Window extends JFrame{
    
    MainPanel mainPanel = new MainPanel(this);

    public void setUpWindow(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Physics Engine");

        add(mainPanel);
        pack();

        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
    }


    public MainPanel getMainPanel(){
        return mainPanel;
    }
}

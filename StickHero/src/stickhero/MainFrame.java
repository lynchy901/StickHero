/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickhero;

import javax.swing.JFrame;

/**
 *
 * @author nml5182
 */
public class MainFrame extends JFrame {
    SplashScreen splashScreenPanel = new SplashScreen();
    MainMenu mainMenuPanel = new MainMenu();
    Characters charactersPanel = new Characters();
    HighScores highScorePanel = new HighScores();
    GamePanel gamePanel = new GamePanel();
    
    public MainFrame() {
        initComponents();
        showSplashScreen();
        
        
    }
    
    public void initComponents() {
        this.setVisible(true);
        this.add(splashScreenPanel);
    }
    
    public void showSplashScreen() {
        
        splashScreenPanel.setVisible(true);
        
        try {
            Thread.sleep(4000); //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        splashScreenPanel.setVisible(false);
    }   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickhero;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author nml5182
 */
public class MainFrame extends JFrame {
    private SplashScreen splashScreenPanel;
    private MainMenu mainMenuPanel;
    private Characters charactersPanel;
    private HighScores highScorePanel;
    private GamePanel gamePanel;
    private Instructions instructionPanel;
    private Hero hero;
    
    public MainFrame() {
        initComponents();
        showSplashScreen();
        showMainMenu();
        
        
    }
    
    public void initComponents() {
        
        splashScreenPanel = new SplashScreen();
        mainMenuPanel = new MainMenu(this);
        charactersPanel = new Characters();
        highScorePanel = new HighScores();
        hero = new Hero(1);
        gamePanel = new GamePanel(this, hero);
        instructionPanel = new Instructions();
        
        
        
        this.setVisible(true);
        this.setSize(1200, 1200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(splashScreenPanel);
    }
    
    public void showSplashScreen() {
        
        splashScreenPanel.setVisible(true);
        
        try {
            Thread.sleep(0); //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        splashScreenPanel.setVisible(false);
    }
    
    public void showMainMenu() {
        
        this.add(mainMenuPanel);
        mainMenuPanel.setBackground(Color.red);
        mainMenuPanel.setVisible(true);
    }
    
    public void showCharacterUI() {
        this.add(charactersPanel);
        charactersPanel.setBackground(Color.yellow);
        charactersPanel.setVisible(true);
    }
    
    public void showGamePanel() {
        this.add(gamePanel);
        gamePanel.setVisible(true);
    }
    
    public void showHighScore() {
        this.add(highScorePanel);
        highScorePanel.setBackground(Color.yellow);
        charactersPanel.setVisible(true);
    }
    
    public void showInstructionsPanel() {
        this.add(instructionPanel);
        gamePanel.setBackground(Color.yellow);
        charactersPanel.setVisible(true);
    }
}

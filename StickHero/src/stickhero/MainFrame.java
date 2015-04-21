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
    private GameOver gameOverPanel;
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
        highScorePanel = new HighScores();
        gameOverPanel = new GameOver(this);
        hero = new Hero(1);
        gamePanel = new GamePanel(this, hero);
        charactersPanel = new Characters(this,hero);
        instructionPanel = new Instructions();
        
        
        
        this.setVisible(true);
        this.setSize(1280, 720);
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
        this.remove(gameOverPanel);
        gamePanel.setVisible(true);
        gamePanel.initCharacter();
        System.out.println(hero.getCharacterNumber());
    }
    
    public void showHighScore() {
        this.add(highScorePanel);
        highScorePanel.setBackground(Color.yellow);
        charactersPanel.setVisible(true);
    }
    
    public void showInstructionsPanel() {
        this.add(instructionPanel);
        gamePanel.setBackground(Color.yellow);
        instructionPanel.setVisible(true);
    }
    
        public void showGameOver() {
        this.add(gameOverPanel);
        this.remove(gamePanel);
        gameOverPanel.setBackground(Color.black);
        gameOverPanel.setVisible(true);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickhero;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
        highScorePanel = new HighScores(this);
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
        this.add(getSplashScreenPanel());
    }
    
    public void showSplashScreen() {
        
        getSplashScreenPanel().setVisible(true);
        
        try {
            Thread.sleep(0); //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        getSplashScreenPanel().setVisible(false);
    }
    
    public void showMainMenu() {
        
        this.add(getMainMenuPanel());
        getMainMenuPanel().setBackground(Color.red);
        getMainMenuPanel().setVisible(true);
    }
    
    public void showCharacterUI() {
        this.add(getCharactersPanel());
        getCharactersPanel().setBackground(Color.yellow);
        getCharactersPanel().setVisible(true);
    }
    
    public void showGamePanel() {
        this.add(getGamePanel());
        this.remove(getGameOverPanel());

        System.out.println(hero.getCharacterNumber());
    }
    
    public void showHighScore() {
        this.add(getHighScorePanel());
        getHighScorePanel().setBackground(Color.yellow);
        getCharactersPanel().setVisible(true);
    }
    
    public void showInstructionsPanel() {
        this.add(getInstructionPanel());
        getGamePanel().setBackground(Color.yellow);
        getInstructionPanel().setVisible(true);
    }
    
        public void showGameOver() {
        this.add(getGameOverPanel());
        this.remove(getGamePanel());
        getGameOverPanel().setBackground(Color.black);
        getGameOverPanel().setVisible(true);
    }
        
        public GamePanel getGamePanelCntl() {
            return this.getGamePanel();
        }

    /**
     * @return the splashScreenPanel
     */
    public SplashScreen getSplashScreenPanel() {
        return splashScreenPanel;
    }

    /**
     * @return the mainMenuPanel
     */
    public MainMenu getMainMenuPanel() {
        return mainMenuPanel;
    }

    /**
     * @return the charactersPanel
     */
    public Characters getCharactersPanel() {
        return charactersPanel;
    }

    /**
     * @return the highScorePanel
     */
    public HighScores getHighScorePanel() {
        return highScorePanel;
    }

    /**
     * @return the gamePanel
     */
    public GamePanel getGamePanel() {
        return gamePanel;
    }

    /**
     * @return the gameOverPanel
     */
    public GameOver getGameOverPanel() {
        return gameOverPanel;
    }

    /**
     * @return the instructionPanel
     */
    public Instructions getInstructionPanel() {
        return instructionPanel;
    }

    public void switchPanel(JPanel p1, JPanel p2) 
    {
        this.remove(p1);
        this.add(p2);
        validate();
        repaint();
        
    }
}

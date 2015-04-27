package stickhero;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameOver extends JPanel implements ActionListener
{
    private JPanel imagePanel = new JPanel();
    private JLabel imageLabel = new JLabel();
    private JLabel textLabel = new JLabel();
    JButton mainMenu, playAgain, saveScore;
    private Image gameOverImage = Toolkit.getDefaultToolkit().getImage("Images/gameOver.jpg");
    private ImageIcon gameOverIcon = new ImageIcon(gameOverImage);
    MainFrame parentMainFrame;

    
    public GameOver(MainFrame frame)
    {    
        this.setLayout(null);
        setBackground(Color.black);
        
        imageLabel.setIcon(gameOverIcon);
        imageLabel.setBounds(0,0,1137,720);
        this.add(imageLabel);
        
        mainMenu = new JButton("MainMenu");
        mainMenu.addActionListener(this);
        mainMenu.setBounds(1137 , 100, 153, 100);
        this.add(mainMenu);
        
        playAgain = new JButton("Play Again?");
        playAgain.addActionListener(this);
        playAgain.setBounds(1137 , 300, 153, 100);
        this.add(playAgain);
        
        saveScore = new JButton("saveScore");
        saveScore.addActionListener(this);
        saveScore.setBounds(1137 , 500, 153, 100);
        this.add(saveScore);
        
        this.add(textLabel);
        this.parentMainFrame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == mainMenu)
        {
            parentMainFrame.switchPanel(this,parentMainFrame.getMainMenuPanel());
        }
        if (e.getSource() == playAgain)
        {
            parentMainFrame.getGamePanel().reloadPanel();
            parentMainFrame.switchPanel(this,parentMainFrame.getGamePanel());

        }
        if (e.getSource() == saveScore)
        {
            try
            {
                writeScore();
            }
            catch (IOException ex)
            {
                Logger.getLogger(GameOver.class.getName()).log(Level.SEVERE, null, ex);
            }
            parentMainFrame.switchPanel(this,parentMainFrame.getHighScorePanel());
        }
    }
    
    public void writeScore() throws IOException {
        System.out.println(parentMainFrame.getGamePanelCntl().getScore());
        try
        {
            FileOutputStream out = new FileOutputStream("scores.txt", true);
            PrintStream userInfo = new PrintStream(out);

            String lineEntered = "" + parentMainFrame.getGamePanelCntl().getScore();
            userInfo.println(lineEntered);
        }
        catch (Exception e)
        {
      	    e.printStackTrace();
        }
        parentMainFrame.getHighScorePanel().readScores();
    }
}

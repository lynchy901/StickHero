package stickhero;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    
    public GameOver(MainFrame parentMainFrame)
    {    
        this.setLayout(null);
       this.initComponents(); 
       this.parentMainFrame = parentMainFrame;
       this.setSize(1280, 720);
    }
    
    public void initComponents()
    {
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
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == mainMenu)
        {
            parentMainFrame.showMainMenu();
        }
        if (e.getSource() == playAgain)
        {
            parentMainFrame.showGamePanel();
        }
        if (e.getSource() == saveScore)
        {
            System.out.println("thisdoesntdoanythingyetlol");  
        }
    }
    
    
}

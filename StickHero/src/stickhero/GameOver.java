package stickhero;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameOver extends JPanel 
{
    private JPanel imagePanel = new JPanel();
    private JLabel imageLabel = new JLabel();
    private JLabel textLabel = new JLabel();
    private Image gameOverImage = Toolkit.getDefaultToolkit().getImage("Images/gameOver.jpg");
    private ImageIcon gameOverIcon = new ImageIcon(gameOverImage);

    
    public GameOver()
    {    
       this.initComponents(); 
       this.setSize(1200, 1200);
    }
    
    public void initComponents()
    {
        imageLabel.setIcon(gameOverIcon);
        imagePanel.add(imageLabel);
        imagePanel.add(textLabel);

        this.add(imagePanel);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickhero;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author nml5182
 */
public class SplashScreen extends JPanel {
    private JPanel imagePanel = new JPanel();
    private JLabel imageLabel = new JLabel();
    private JLabel textLabel = new JLabel();
    private ImageIcon theSplashImage;
    
    
    public SplashScreen(){
    
       this.initCustomComponents(); 
        
       this.setSize(1200, 800);
       
       //this.setLocationRelativeTo(null);
    
    
}
    
    public void initCustomComponents(){
        
            theSplashImage = new ImageIcon("Images/stickHero.jpg");
            
            imageLabel.setIcon(theSplashImage);
            
            imagePanel.add(imageLabel);
            imagePanel.add(textLabel);
            
            this.add(imagePanel);
            
            
    }
}

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
    private JLabel textLabel = new JLabel("Stick Hero");
    private ImageIcon theSplashImage;
    
    
    public SplashScreen(){
    
       this.initCustomComponents(); 
        
       this.setSize(400, 300);
       
       //this.setLocationRelativeTo(null);
    
    
}
    
    public void initCustomComponents(){
        
            theSplashImage = new ImageIcon("SplashScreenImage.jpg");
            this.setBackground(Color.red);
            
            imageLabel.setIcon(theSplashImage);
            
            imagePanel.add(imageLabel);
            imagePanel.add(textLabel);
            
            this.add(imagePanel);
            
            
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickhero;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author nml5182
 */
public class HighScores extends JPanel implements ActionListener{
    public int highScore1,highScore2,highScore3,highScore4,highScore5;
    public JLabel scores,highScoreView1,highScoreView2,highScoreView3,highScoreView4,highScoreView5;
    
    public JButton mainMenu;
    public MainFrame parentMainFrame;

    public HighScores(MainFrame parentMainFrame )
    {
        setLayout(null);
        
        this.parentMainFrame = parentMainFrame;
        
        this.add(scores = new JLabel("High Scores!"));
        scores.setBounds(300,100,100,50);
        
        this.add(highScoreView1 = new JLabel("Score1"));
        highScoreView1.setBounds(200,200,400,50);
        
        this.add(highScoreView2 = new JLabel("Score2"));
        highScoreView2.setBounds(200,250,400,50);
        
        this.add(highScoreView3 = new JLabel("Score3"));
        highScoreView1.setBounds(200,300,400,50);
        
        this.add(highScoreView4 = new JLabel("Score4"));
        highScoreView1.setBounds(200,350,400,50);
        
        this.add(highScoreView5 = new JLabel("Score5"));
        highScoreView1.setBounds(200,400,400,50);
        
        this.add(mainMenu = new JButton("Main Menu")); 
        mainMenu.setBounds(300, 500, 100, 100);
        
        mainMenu.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object event = e.getSource();
        if (event == mainMenu)
        {
            parentMainFrame.switchPanel(this,parentMainFrame.getMainMenuPanel());
        }
    }
    
}

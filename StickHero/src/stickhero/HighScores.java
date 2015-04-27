/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickhero;

import java.awt.Color;
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
    public int scoreArray[] = {highScore1,highScore2,highScore3,highScore4,highScore5};
    public JLabel scores,highScoreView1,highScoreView2,highScoreView3,highScoreView4,highScoreView5;
    
    public JButton mainMenu;
    public MainFrame parentMainFrame;

    public HighScores(MainFrame parentMainFrame )
    {
        setLayout(null);
        setBackground(Color.yellow);
        
        this.parentMainFrame = parentMainFrame;
        
        highScore1 = 20;
        highScore2= 12;
        highScore3=5;
        highScore4 = 42;
        highScore5 = 1;
        
        this.add(scores = new JLabel("High Scores!"));
        scores.setBounds(300,100,100,50);
        
        this.add(highScoreView1 = new JLabel("Score1 = " +highScore1));
        highScoreView1.setBounds(200,200,400,50);
        
        this.add(highScoreView2 = new JLabel("Score2 = " + highScore2));
        highScoreView2.setBounds(200,250,400,50);
        
        this.add(highScoreView3 = new JLabel("Score3 = " +highScore3));
        highScoreView3.setBounds(200,300,400,50);
        
        this.add(highScoreView4 = new JLabel("Score4 = "+highScore4));
        highScoreView4.setBounds(200,350,400,50);
        
        this.add(highScoreView5 = new JLabel("Score5 = "+highScore5));
        highScoreView5.setBounds(200,400,400,50);
        
        this.add(mainMenu = new JButton("Main Menu")); 
        mainMenu.setBounds(300, 500, 100, 100);
        mainMenu.addActionListener(this);
        
        sortScoreBubble(scoreArray);        
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
    
    public final int[] sortScoreBubble(int [] array)
    {
        int temp;
        
        for(int i=0;i<array.length-1;i++)
        {
            for(int j = 1;j<array.length-i;j++)
            {
                if(array[j-1] > array[j])
                {
                    temp = array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }
        highScore1 = array[0];
        highScore2 = array[1];
        highScore3 = array[2];
        highScore4 = array[3];
        highScore5 = array[4];
        setScoreText();
        return array;        
    }
    
    public void setScoreText()
    {
        highScoreView1 = new JLabel("Score1 = " +highScore1);
        highScoreView2 = new JLabel("Score2 = " + highScore2);
        highScoreView3 = new JLabel("Score3 = " +highScore3);
        highScoreView4 = new JLabel("Score4 = "+highScore4);
        highScoreView5 = new JLabel("Score5 = "+highScore5);
        
    }
}

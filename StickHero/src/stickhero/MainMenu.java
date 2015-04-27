/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickhero;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author nml5182
 */
public class MainMenu extends JPanel implements ActionListener{
    private JLabel stickHeroLabel;
    private JButton instructionsButton;
    private JButton soundButton;
    private JButton characterButton;
    private JButton highScoreButton;
    private JButton playButton;
    private JLabel artworkLabel;
    private MainFrame parentMainFrame;
    
    public MainMenu(MainFrame newMainFrame) 
    {
        parentMainFrame = newMainFrame;
        initComponents();
    }
    
    public void initComponents() {
        
        this.setLayout(new GridLayout(0,1));
        stickHeroLabel = new JLabel("Welcome to Stick Hero");
        stickHeroLabel.setHorizontalAlignment(SwingConstants.CENTER);
        playButton = new JButton("Play");
        instructionsButton = new JButton("Instructions");
        soundButton = new JButton("Sound");
        characterButton = new JButton("Character");
        highScoreButton = new JButton("High Score");
        artworkLabel = new JLabel("Artwork");
        artworkLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        this.add(stickHeroLabel);
        this.add(playButton);
        this.add(instructionsButton);
        this.add(soundButton);
        this.add(characterButton);
        this.add(highScoreButton);
        this.add(artworkLabel);
        
        characterButton.addActionListener(this);
        
        highScoreButton.addActionListener(this);
        
        instructionsButton.addActionListener(this);
        
        playButton.addActionListener(this);       
    }


    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object event = e.getSource();
        if(event == characterButton)
        {
            parentMainFrame.switchPanel(this, parentMainFrame.getCharactersPanel());
        }
        if (event == instructionsButton)
        {
            parentMainFrame.switchPanel(this,parentMainFrame.getInstructionPanel());
        }
        if (event == highScoreButton)
        {
            parentMainFrame.switchPanel(this, parentMainFrame.getHighScorePanel());
        }
        if (event == playButton)
        {
            parentMainFrame.switchPanel(this, parentMainFrame.getGamePanel());
        }
    }
}

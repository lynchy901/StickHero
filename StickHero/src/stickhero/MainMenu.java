/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickhero;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author nml5182
 */
public class MainMenu extends JPanel {
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
        
        characterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theCharacterButtonActionPerformed(evt);
            }
        });
        
        highScoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theHighScoreButtonActionPerformed(evt);
            }
        });
        
        instructionsButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                theInstructionsButtonActionPerformed(evt);
            }
        });
        
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                thePlayButtonActionPerformed(evt);
            }
        });    
        
    }
    
    public void theCharacterButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        parentMainFrame.showCharacterUI();        
    }
    
    public void theInstructionsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        parentMainFrame.showInstructionsPanel();        
    }
    
    public void theHighScoreButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        parentMainFrame.showHighScore();        
    }
    
    public void thePlayButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        parentMainFrame.showGamePanel();        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickhero;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
    private JLabel artworkLabel;
    
    public MainMenu() {
        initComponents();
    }
    
    public void initComponents() {
        stickHeroLabel = new JLabel("Welcome to Stick Hero");
        instructionsButton = new JButton("Instructions");
        soundButton = new JButton("Sound");
        characterButton = new JButton("Character");
        highScoreButton = new JButton("High Score");
        artworkLabel = new JLabel("Artwork");
    }
}

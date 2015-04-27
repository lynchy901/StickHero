/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickhero;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author nml5182
 */
public class Instructions extends JPanel implements ActionListener{  
    private JTextArea instructions = new JTextArea();
    private JButton back = new JButton("Back");
    private MainFrame parentMainFrame;
    
    public Instructions(MainFrame MainFrame) {
        parentMainFrame = MainFrame;
        this.add(instructions);
        this.add(back);
        back.addActionListener(this);
        instructions.setText("To play stick hero, hold the space bar and let go of it when you think it is long enough to land on the other side.");
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            parentMainFrame.switchPanel(this,parentMainFrame.getMainMenuPanel());
        }
    }
    
    
}
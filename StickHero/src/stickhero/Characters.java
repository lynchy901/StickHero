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

public class Characters extends JPanel implements ActionListener
{
    JLabel characters;
    private int characterChosen = 1;
    JButton mainMenu;
    JButton character1;
    JButton character2;
    JButton character3;
    JButton character4;
    
    public Characters()
    {
        characters = new JLabel("Character");
        mainMenu = new JButton();   
        character1 = new JButton();
        character1.addActionListener(this);
        character2 = new JButton();
        character2.addActionListener(this);
        character3 = new JButton();
        character3.addActionListener(this);
        character4 = new JButton();
        character4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object event = e.getSource();
        if (event == character1)
        {
            characterChosen = 1;
        }
        if (event == character2)
        {
            characterChosen = 2;
        }
        if (event == character3)
        {
            characterChosen = 3;
        }
        if (event == character4)
        {
            characterChosen = 4;
        }
    }
    

    
    
    
}

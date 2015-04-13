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
    JLabel characters,hero1,hero2,hero3,hero4,chosenHero;
    private int characterChosen = 1;
    Hero heroCharacter;
    JButton mainMenu;
    JButton character1;
    JButton character2;
    JButton character3;
    JButton character4;
    
    public Characters()
    {
        this.setLayout(null);
        heroCharacter = new Hero(characterChosen);
        
        characters = new JLabel("Character");
        characters.setBounds(550, 30, 100, 50);
        this.add(characters);
        
        mainMenu = new JButton("Main Menu");   
        mainMenu.setBounds(550,750,100,50);
        mainMenu.addActionListener(this);
        this.add(mainMenu);
        
        character1 = new JButton("Choose Hero 1");
        character1.setBounds(550,150,200,50);
        this.add(character1);
        character1.addActionListener(this);        


        character2 = new JButton("Choose Hero 2");
        character2.setBounds(550,250,200,50);
        character2.addActionListener(this);
        this.add(character2);
                
        character3 = new JButton("Choose Hero 3");
        character3.setBounds(550,350,200,50);
        character3.addActionListener(this);
        this.add(character3);
        
        character4 = new JButton("Choose Hero 4");
        character4.setBounds(550,450,200,50);
        character4.addActionListener(this);
        this.add(character4);
        
        hero1 = new JLabel();
        hero1.setIcon(heroCharacter.displayHeroImgIcon(1));
        hero1.setBounds(50,150,100,100);
        this.add(hero1);
 
        
        hero2 = new JLabel();
        hero2.setIcon(heroCharacter.displayHeroImgIcon(2));
        hero2.setBounds(50,250,100,100);
        this.add(hero2);
        
        hero3 = new JLabel();
        hero3.setIcon(heroCharacter.displayHeroImgIcon(3));
        hero3.setBounds(50,350,100,100);
        this.add(hero3);
        
        hero4 = new JLabel();
        hero4.setIcon(heroCharacter.displayHeroImgIcon(4));
        hero4.setBounds(50,450,100,100);
        this.add(hero4);
        
        chosenHero = new JLabel();
        chosenHero.setBounds(100,550,100,100);
        this.add(chosenHero);

    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object event = e.getSource();
        if (event == character1)
        {
            characterChosen = 1;
            chosenHero.setIcon(heroCharacter.displayHeroImgIcon(characterChosen));
        }
        if (event == character2)
        {
            characterChosen = 2;
            chosenHero.setIcon(heroCharacter.displayHeroImgIcon(characterChosen));

        }
        if (event == character3)
        {
            characterChosen = 3;
            chosenHero.setIcon(heroCharacter.displayHeroImgIcon(characterChosen));
        }
        if (event == character4)
        {
            characterChosen = 4;
            chosenHero.setIcon(heroCharacter.displayHeroImgIcon(characterChosen));
        }
    }
}

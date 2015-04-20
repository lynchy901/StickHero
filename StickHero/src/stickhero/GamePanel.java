/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickhero;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author nml5182
 */
public class GamePanel extends JPanel implements KeyListener,ActionListener {
    
    private MainFrame parentMainFrame;
    private JButton building1;
    private JButton building2;
    private Point bridgeStart,buildingEnd;
    private int bridgeWidth = 10;
    private Hero hero;
    
    private int i;
    int counter = 0;
    
    Timer extender;
    Timer playerMove;
    
    private Rectangle bridge;
    
    Boolean bool;
    
    public GamePanel(MainFrame newMainFrame, Hero newHero) {
        parentMainFrame = newMainFrame;
        hero = newHero;
        initComponents();
    }
    
    public void initComponents() {
        this.setLayout(null);
        
        building1 = new JButton();
        building2 = new JButton();
        
        building1.setSize(new Dimension(100, 200));
        building2.setSize(new Dimension(100, 200));
        
        building1.setLocation(new Point(200, 800));
        building2.setLocation(new Point(800, 800));
        
        extender = new Timer(10,this);
        playerMove = new Timer(10, this);

        
        this.add(hero);
        this.add(building1);
        this.add(building2);
        this.setBackground(Color.red);
        
        this.addKeyListener(this);
        this.setFocusable(true);
        getBuildingData();
        bridge = new Rectangle(bridgeStart.x,bridgeStart.y,10,10);   
        initCharacter();
        
    }
    
    public void getBuildingData() {
        bridgeStart = new Point(building1.getLocation().x + building1.getSize().width - 10, building1.getLocation().y);
        buildingEnd = new Point(building2.getLocation().x + building2.getSize().width - 10, building2.getLocation().y);

    }

       public void initCharacter()
    {
        hero.setIcon(hero.displayHeroImgIcon(hero.getCharacterNumber()));
        hero.setBounds(bridge.x - 100, bridge.y - 110, 100, 100);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.requestFocusInWindow();
        g.setColor(Color.black);
        g.fillRect(bridge.x, bridge.y, bridgeWidth, i);
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        Graphics g = this.getGraphics();
//        g.fillRect(bridge.x, bridge.y,bridge.width,bridge.height);
        
        if (e.getKeyCode() == 32) 
        {
            bool = true;
            
        }
        if (bool) {
//            i++;
            extender.start();
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        if (e.getKeyCode() == 32) {
            bool = false;
            tiltBridge();
            extender.stop();
            playerMove.start();
            counter = 0;
            
            
//            bridge = new Rectangle(bridgeStart.x,bridgeStart.y,10,10);
//            i = 0;
            System.out.println("false");
        }
    }
    
    public void tiltBridge() {
        int temp = bridgeWidth;
        bridgeWidth = i;
        i = temp;
        bridge.x = bridgeStart.x + 10;
        bridge.y = bridgeStart.y - 10;
        System.out.println("tilt bridge");
        repaint();
       

    }
    
//    public void moveHero() {
//        for (int x = 0; x < 10; x++) 
//        {
//            hero.setLocation(hero.getX() + moveDistance, hero.getY());
//        }
//    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == extender)
        {
            i+=5;
            bridge.y-=5;
            System.out.println("boop" + extender.toString());
            repaint();
        }
        else if(e.getSource() == playerMove)
        {
            if (hero.getX() < bridgeStart.x + bridgeWidth - 50)
            {
                System.out.println("true, bridge width = " + bridgeWidth);
                hero.setLocation(hero.getX() + 5, hero.getY());
            } else {
                
                checkForFailure();
                
            }
            
            
            
        }
    }
    
    
    
    public boolean checkForFailure() {
        
        boolean flag;
        
        if (!checkForBridge() || !checkForPlatform()) {
           int counter = 0;
            
            System.out.println("You have lost");
            hero.setLocation(hero.getX(), hero.getY() + 1);
            
            if (counter > 80) {
                playerMove.stop();
            }
            
            counter+=5;
            
            flag = true;
        } else {
            //System.out.println("you are ok");
            flag = false;
        }
        
        return flag;
    }
    
    
    public boolean checkForPlatform() { 
        boolean flag = false;
        
        if (hero.getX() + 50 >= building2.getX() && hero.getX() + 50 <= building2.getX() + building2.getWidth()) {
            flag = true;
        }
        
        return flag;
    }
    
    public boolean checkForBridge() {
        boolean flag = false;
        
        if (hero.getX() + 50 >= bridgeStart.x && hero.getX() + 50 <= bridgeStart.getX() + bridgeWidth) {
            flag = true;
        }
        
        return flag;
    }
}

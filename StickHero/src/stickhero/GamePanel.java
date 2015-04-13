/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickhero;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author nml5182
 */
public class GamePanel extends JPanel implements KeyListener {
    
    private MainFrame parentMainFrame;
    private JButton building1;
    private JButton building2;
    
    public GamePanel(MainFrame newMainFrame) {
        parentMainFrame = newMainFrame;
        initComponents();
    }
    
    public void initComponents() {
        this.setLayout(null);
        
        building1 = new JButton();
        building2 = new JButton();
        
        building1.setSize(new Dimension(100, 500));
        building2.setSize(new Dimension(100, 500));
        
        building1.setLocation(new Point(200, 500));
        building2.setLocation(new Point(800, 500));
        
        this.add(building1);
        this.add(building2);
        this.setBackground(Color.red);
        
        this.addKeyListener(this);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getSource());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

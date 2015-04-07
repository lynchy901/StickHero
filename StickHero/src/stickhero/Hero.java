package stickhero;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

/**
 *
 * @author Stephen
 */
public class Hero extends Rectangle 
{
    private int heroX;
    private int heroY;
    private Image heroImg;
    private Image heroImg1= Toolkit.getDefaultToolkit().getImage("Images/heroImg1.png");
    private Image heroImg2= Toolkit.getDefaultToolkit().getImage("Images/heroImg2.png");
    private Image heroImg3= Toolkit.getDefaultToolkit().getImage("Images/heroImg3.png");
    private Image heroImg4= Toolkit.getDefaultToolkit().getImage("Images/heroImg4.png");

    public Hero( int characterNumber)
    {
        changeCharacterImg(characterNumber);
    }
    
//    public void hero()
//    {    }
//    
    public void setHeroX(int x)
    {
        heroX = x;
    }

    public void setHeroY(int y)
    {
        heroY = y;
    }
    
    public Rectangle createRectangle()
    {
        this.x = heroX;
        this.y = heroY;
        this.setBounds(x,y,20,20);
        return this;
    }
    
    public Image getHeroImg()
    {
        if (heroImg == null)
        {
            heroImg = Toolkit.getDefaultToolkit().getImage("images/heroImg1.png");
            return heroImg;
        }
        else
        {
             return heroImg;
        }
    }

    public Image changeCharacterImg(int characterNumber)
    {
        switch(characterNumber)
        {
            case 1:
                return heroImg1;
            case 2:
                return heroImg2;
            case 3: 
                return heroImg3;
            case 4:
                return heroImg4;
            default:
                return heroImg1;
        }
    }
    
    public void setHeroImg(Image img)
    {
        heroImg = img;        
    }
    
}

package stickhero;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

/**
 *
 * @author Stephen
 */
class Hero extends Rectangle 
{
    private int heroX;
    private int heroY;
    private Image heroImg;
    
    public void hero(int x, int y)
    {
        this.heroX = x;
        this.heroY = y;
    }
    
    public void hero()
    {    }
    
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
            heroImg = Toolkit.getDefaultToolkit().getImage("images/defaultHero.png");
            return heroImg;
        }
        else
        {
             return heroImg;
        }
    }
    
    public void setHeroImg(Image img)
    {
        heroImg = img;        
    }
    
}
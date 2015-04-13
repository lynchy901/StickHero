package stickhero;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Stephen
 */
public class Hero extends Rectangle 
{
    private int heroX;
    private int heroY;
    private ImageIcon heroImg;
    private Image heroImg1= Toolkit.getDefaultToolkit().getImage("Images/heroImg1.png");
    private Image heroImg2= Toolkit.getDefaultToolkit().getImage("Images/heroImg2.png");
    private Image heroImg3= Toolkit.getDefaultToolkit().getImage("Images/heroImg3.png");
    private Image heroImg4= Toolkit.getDefaultToolkit().getImage("Images/heroImg4.png");
    private ImageIcon heroImgIcon1= new ImageIcon(heroImg1);
    private ImageIcon heroImgIcon2= new ImageIcon(heroImg2);
    private ImageIcon heroImgIcon3= new ImageIcon(heroImg3);
    private ImageIcon heroImgIcon4= new ImageIcon(heroImg4);    

    public Hero( int characterNumber)
    {
        changeCharacterImg(characterNumber);
    }
  
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
    
    public ImageIcon getHeroImgIcon()
    {
        if (heroImg == null)
        {
            heroImg = heroImgIcon1;
            return heroImg;
        }
        else
        {
             return heroImg;
        }
    }
    public ImageIcon displayHeroImgIcon(int chosen)
    {
        switch(chosen)
        {
            case 1:
                return heroImgIcon1;
            case 2:
                return heroImgIcon2;
            case 3: 
                return heroImgIcon3;
            case 4:
                return heroImgIcon4;
            default:
                return heroImgIcon1;
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
    
    public void setHeroImg(ImageIcon img)
    {
        heroImg = img;        
    }

    public ImageIcon getHeroImgIcon1() {
        return heroImgIcon1;
    }

    public ImageIcon getHeroImgIcon2() {
        return heroImgIcon2;
    }

    public ImageIcon getHeroImgIcon3() {
        return heroImgIcon3;
    }

    public ImageIcon getHeroImgIcon4() {
        return heroImgIcon4;
    }
    
}

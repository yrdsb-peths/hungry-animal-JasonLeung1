import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Jason Leung 
 * @version September 2024
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,343,201);
        elephant.setLocation(468,85);
        Label label = new Label("Use  \u2190 and \u2192  to Move", 50);
        addObject(label,220,214);
        label.setLocation(291,223);
        label.setLocation(283,225);
        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2,284,307);
        label2.setLocation(300,300);
        label.setLocation(342,217);
        label.setLocation(342,217);
        label.setLocation(342,217);
        label.setLocation(363,206);
        label.setLocation(362,212);
        label.setLocation(351,222);
        label.setLocation(351,222);
        label.setLocation(274,216);
        label2.setLocation(276,296);
        label.setLocation(294,254);
        label2.setLocation(308,292);
        label2.setLocation(306,339);
        label.setLocation(350,259);
        titleLabel.setLocation(228, 97);
        label.setLocation(310,283);
        label2.setLocation(305,350);
        label.setLocation(311,263);
        label2.setLocation(293,290);
        label2.setLocation(192,329);
        label.setLocation(330,240);
    }
}

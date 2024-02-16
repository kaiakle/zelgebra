import javax.swing.JFrame;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 * Level select
 */
public class MenuUI extends AbstractUI
{
    private final int WIDTH = 900, HEIGHT = 600;
    private ArrayListJButton ArrayList<Level> levels
    private 
    public MenuUI()
    {
        super(WIDTH, HEIGHT);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void displayLevels(Graphics g)
    {
        
    }
    
    public static void main(String[] args)
    {
        ArrayList<Level> l = new ArrayList<>();
        
        MenuUI m = new MenuUI();
        m.setVisible(true);
    }
}

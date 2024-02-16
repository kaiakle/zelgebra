import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Includes swing elements Settings, Stats, and other generic ui features
 */
public /*abstract*/ class AbstractUI extends JPanel
{
    private JButton settingsButton, statsButton;
    public AbstractUI()
    {
        
    }

    //test main method when set to non-abstract
    public static void main(String[] args)
    {
        AbstractUI aui = new AbstractUI();
        aui.setVisible(true);
    }
}

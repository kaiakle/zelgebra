import java.util.ArrayList;
import java.util.Collection;

public class Game
{
    public ArrayList<Level> levels;
    public Player player;
    //public Stats stats;
    public int level;
    public int score;
    public double difficulty;
    public MenuUI m;
    public Game()
    {
        levels = new ArrayList<Level>();
        levels.add(new Level(new GraphingProblem(), "Yo yo", "ParabolaSample", 1));
        levels.add(new Level(new GraphingProblem(), "Cheese", "ParabolaSample", 2));
        player = new Player();
        //stats = new Stats();
        level = 0;
        score = 0;
        difficulty = .3;
        m = new MenuUI();
        m.setVisible(true);
    }
    public static void main(String[] args)
    {
        Game g = new Game();
        g.printLevels();
    }
    public void printLevels()
    {
        for(Level level : levels)
        {
            System.out.println(level);
        }
    }
}
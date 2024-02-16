 import java.util.ArrayList;

public class Level extends AbstractUI 
{
    private String name, description;
    private int number;

    public Level(String name, String description, int number)
    {
        super
        this.name = name;
        this.description = description;
        this.number = number;
    }
    public static void main(String[] args)
    {
        
    }

    @Override
    public String toString()
    {
        return number + ":\t" + name + ";\t" + description;
    }
}

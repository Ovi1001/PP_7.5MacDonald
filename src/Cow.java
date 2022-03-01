public class Cow extends Animal
{
    //Instance variables
    private String name;

    //Constructors
    public Cow(String sound, String type, String name)
    {
        super(sound, type);
        this.name = name;
    }

    //Getters
    public String getName()
    {
        return name;
    }
}

public class Chicken extends Animal
{
    //Instance Variables
    private int age;

    public Chicken(String type, int age)
    {
        super("", type);
        this.age = age;
        if (age < 4)
        {
            this.sound = "peep";
        }
        else
        {
            this.sound = "cheep";
        }
    }
}

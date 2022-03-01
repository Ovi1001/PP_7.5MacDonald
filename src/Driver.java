public class Driver
{
    public static void main(String[] args)
    {
        Animal pig = new Pig("oink", "pig");
        Animal cow = new Cow("moo", "cow", "Pepsi");
        Animal youngChick = new Chicken("chick", 3);
        Animal oldChick = new Chicken("chicken", 7);
        Farmer farmer = new Farmer("Farm in Alaska");

        Animal[] farm = {pig, cow, youngChick, oldChick};
        System.out.println(farmer.singSong(farm));

    }
}

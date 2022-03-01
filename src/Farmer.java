public class Farmer
{
    //instance variables
    private String locationOfSinging;

    //constructors
    public Farmer(String locationOfSinging)
    {
        this.locationOfSinging = locationOfSinging;
    }

    //brain methods
    public String singSong(Animal[] farm)
    {
        String song = "";
        String cowName = "";
        for (Animal i : farm)
        {
            if (i.getType().equals("cow"))
            {
                cowName += " named " + ((Cow)i).getName();
            }
            song += "Old MacDonald had a farm. E-I-E-I-O." +
                    "\nAnd on that farm he had a " + i.getType() + cowName + ". E-I-E-I-O." +
                    "\nWith a " + i.getSound() + " " + i.getSound() + " here" +
                    "\nAnd a " + i.getSound() + " " + i.getSound() + " there" +
                    "\nHere an " + i.getSound() +
                    "\nThere an " + i.getSound() +
                    "\nEverywhere an " + i.getSound() + " " + i.getSound() + "." +
                    "\nOld MacDonald had a farm. E-I-E-I-O." + "\n\n";
            cowName = "";
        }
        return song;
    }

}

package dogs;

public class Beagle extends Dog{
    private static final String breed = "Beagle";

    public Beagle(String name) {
        super(name, breed);
    }

@Override
    public void feed() {
        happiness = this.getHappiness() + 2;
    }

@Override
    public void play(int hour) {
        happiness = this.getHappiness() + (hour * 2);
    }
}

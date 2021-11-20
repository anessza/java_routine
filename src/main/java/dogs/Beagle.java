package dogs;

public class Beagle extends Dog{

    public Beagle(String name) {
        super(name);
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

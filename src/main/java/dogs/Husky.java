package dogs;

public class Husky extends Dog {
    public Husky(String name) {
        super(name);
    }

@Override
    public void feed() {
        happiness = this.getHappiness() + 4;
    }
@Override
    public void play(int hour) {
        happiness = this.getHappiness() + (hour * 3);

    }
}

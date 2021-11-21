package dogs;

public class Husky extends Dog {
    private static final String breed = "Husky";

    public Husky(String name) {
        super(name,breed );
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

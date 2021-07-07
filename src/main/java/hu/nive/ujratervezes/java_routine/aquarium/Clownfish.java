package hu.nive.ujratervezes.java_routine.aquarium;

public class Clownfish extends Fish {

    public Clownfish(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void feed(Fish fish) {
        this.weight = fish.getWeight() + 1;
    }

    @Override
    public boolean hasMemoryLoss() {
        return false;
    }
}

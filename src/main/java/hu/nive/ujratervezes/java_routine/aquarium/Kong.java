package hu.nive.ujratervezes.java_routine.aquarium;

public class Kong extends Fish{
    public Kong(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    void feed(Fish fish) {
        this.weight = fish.getWeight() + 2;
    }

    @Override
    public boolean hasMemoryLoss() {
        return false;
    }
}

package hu.nive.ujratervezes.java_routine.aquarium;

public class Tang extends Fish {
    public Tang(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public boolean hasMemoryLoss() {
        return true;
    }

    @Override
    void feed(Fish fish) {
        this.weight = fish.getWeight() + 1;
    }
}

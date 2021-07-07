package hu.nive.ujratervezes.java_routine.aquarium;

public abstract class Fish {

    protected String name;
    protected int weight;
    protected String color;
    protected boolean shortTermMemoryLoss;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public abstract boolean hasMemoryLoss();

    public abstract void feed(Fish fish);

    String status(Fish fish){
        String status = fish.getName() + ", weight: " + fish.getWeight() + ", color: " + fish.getColor() + ", short-term memory loss: " + fish.hasMemoryLoss();
        return status;
    }

}


package hu.nive.ujratervezes.java_routine.aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    List<Fish> aquarium = new ArrayList<>();

    public Aquarium() {
        this.aquarium = aquarium;
    }

    public List<Fish> getAquarium() {
        return aquarium;
    }

    public List<String> getStatus() {
        List<String> aquariumStatus = new ArrayList<>();

        for (Fish fish : aquarium) {
            aquariumStatus.add(fish.status(fish));

        }
        return aquariumStatus;
    }

    public void addFish(Fish fish) {
        this.aquarium.add(fish);
    }

    public void removeFish() {
        int j = aquarium.size()-1;

        for( int i = j; i > -1; i-- )
        {
            if(aquarium.get(i).getWeight() > 10)
            {
                aquarium.remove(i);
            }
        }
    }
    public void feedAll() {
        for (Fish item : aquarium){
            item.feed(item);
        }
    }
}

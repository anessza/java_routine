package dogs;
/*
Legyen egy Kennel osztály, mely nyilvántartja a kutyákat. A következő metódusokat implementáld:

   - void addDog(Dog dog) - hozzáaad egy kutyát
    -feedAll() - összes kutya feed() metódusát meghívja
    -Dog findByName(String name) - kikeresi a kutyát név alapján, kivételt dob, ha nem találja
    -void playWith(String name, int hours) - a paraméterként megadott kutyát kikeresi, és meghívja
    a play() metódusát az átadott hours paraméterrel
    -List<String> getHappyDogNames(int minHappiness) - visszaadja azon kutyák neveit,
    melyeknek boldogsága nagyobb, mint a paraméterként átadott érték

 */

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    List<Dog> dogs = new ArrayList<>();

    public List<Dog> getDogs() {
        return dogs;
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void feedAll() {
        for (Dog dog : dogs) {
            dog.feed();
        }
    }

    public Dog findByName(String name) {
        try {
            Dog foundDog = null;
            for (Dog dog : dogs) {
                if (dog.getName().equals(name)) {
                    foundDog = dog;
                }
            }
            if (foundDog == null) {
                System.out.println(name + " kutya nem tagja a Kennelnek.");
                throw new IllegalArgumentException("Can't find dog");
            }

            return foundDog;
        }
        catch (Exception e){
            throw new IllegalArgumentException("Can't find", e);
        }
    }

    public void playWith(String name, int hour) {
       Dog foundDog = findByName(name);
        foundDog.play(hour);
    }

    public void feedADog(String name) {
        Dog foundDog = findByName(name);
        foundDog.feed();
    }

    public List<String> getHappyDogNames(int happinessRate) {
        List<String> mostHappinestDogs = new ArrayList<>();
        for (Dog dog : dogs) {
            if (dog.getHappiness() > happinessRate) {
                mostHappinestDogs.add(dog.getName());
            }
        }
        return mostHappinestDogs;
    }

    @Override
    public String toString() {
        return "Kennel{ DOGS: "+ "\n" + dogs +
                '}';
    }
}



package dogs;
/*
Legyen egy Dog ősosztályod, annak egy name és happiness attribútuma. Az osztályt ne lehessen példányosítani!
A konstruktora paraméterül kapja meg a kutya nevét!
A happiness értéke 0 legyen! Legyenek az attribútumokhoz getterek!
Legyen egy void feed() és egy void play(int hours) metódusa is, de ezek ne legyenek implementálva.

Legyen két leszármazottja, a Beagle és a Husky! Konstruktornak meg lehessen adni a nevet!
Ha meghívod a Beagle feed() metódusát, akkor a boldágságértéke kettővel nőjjön!
Ha a play() metódusát, akkor a paraméterként átadott órák száma szorozva kettővel nőjjön a boldogságértéke!

Ha meghívod a Husky feed() metódusát, akkor a boldágságértéke néggyel nőjjön!
Ha a play() metódusát, akkor a paraméterként átadott órák száma szorozva hárommal nőjjön a boldogságértéke!

Legyen egy Kennel osztály, mely nyilvántartja a kutyákat. A következő metódusokat implementáld:

    void addDog(Dog dog) - hozzáaad egy kutyát
    feedAll() - összes kutya feed() metódusát meghívja
    Dog findByName(String name) - kikeresi a kutyát név alapján, kivételt dob, ha nem találja
    void playWith(String name, int hours) - a paraméterként megadott kutyát kikeresi, és meghívja a play() metódusát az átadott hours paraméterrel
    List<String> getHappyDogNames(int minHappiness) - visszaadja azon kutyák neveit, melyeknek boldogsága nagyobb, mint a paraméterként átadott érték

Ez két feladatnak számít, első a Dog, Husky Beagle és Kennel osztályok létrehozása, és a Kennel osztály első két metódusa egy feladat. A másik három metódus még egy feladatnak számít.
 */

public abstract class Dog {
    private String name;
    public int happiness;
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.happiness = 0;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

    public abstract void feed();

    public abstract void play(int hours);

    @Override
    public String toString() {
        return
                name + "(" +
                breed + ") " +
                "happiness = " + happiness +
                        ";" + "\n";
    }
}

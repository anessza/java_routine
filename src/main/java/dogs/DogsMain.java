package dogs;

public class DogsMain {
    public static void main(String[] args) {

        Kennel kennel = new Kennel();

        Beagle beagle = new Beagle("Bigli");
        kennel.addDog(beagle);
        Husky husky = new Husky("Morzsi");
        kennel.addDog(husky);
        Husky husky2 = new Husky("Zokni");
        kennel.addDog(husky2);

        kennel.playWith("Morzsi", 4);
        kennel.feedAll();
        System.out.println(kennel.getHappyDogNames(3));
        System.out.println(kennel.getDogs());


    }
}

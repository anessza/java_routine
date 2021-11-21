package dogs;


public class DogsMain {
    public static void main(String[] args) {

 /*       UseFiles useFiles = new UseFiles();
        Kennel kennel = useFiles.readDogsFile();
        Husky husky = new Husky("Hopihe");
        kennel.addDog(husky);
        UseFiles.writeDogsFile(husky);
        Beagle beagle = new Beagle("Stefi");
        kennel.addDog(beagle);
        UseFiles.writeDogsFile(beagle);

        kennel.playWith("Mazsi", 4);
        kennel.feedAll();

        System.out.println(kennel.getHappyDogNames(3));
        System.out.println(kennel);*/
        Menu menu = new Menu();
        menu.menu();


    }
}

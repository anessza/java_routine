package dogs;


public class DogsMain {
    public static void main(String[] args) {

        UseFiles useFiles = new UseFiles();
        Kennel kennel = useFiles.readDogsFile();

        kennel.playWith("Mazsi", 4);
        kennel.feedAll();

        System.out.println(kennel.getHappyDogNames(3));
        System.out.println(kennel);


    }
}

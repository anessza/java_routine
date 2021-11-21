package dogs;

import java.util.List;


public class DogsMain {
    public static void main(String[] args) {

        Kennel kennel = new Kennel();
        List<Dog> dogList;



        kennel.playWith("Morzsi", 4);
        kennel.feedAll();
        System.out.println(kennel.getHappyDogNames(3));
        System.out.println(kennel.getDogs());


    }
}

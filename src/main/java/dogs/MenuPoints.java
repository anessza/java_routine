package dogs;

import java.util.List;
import java.util.Scanner;

import static dogs.ListBy.NAME;
import static dogs.UseFiles.listDogsBy;

public class MenuPoints {
    UseFiles useFiles = new UseFiles();

    //* 1. menu: read dogs.txt
    public void readFile(){
        Kennel kennel = useFiles.readDogsFile();
        System.out.println(kennel);
    }

    //* 2. menu: Make dogs.txt
    public void makeFile(){
        useFiles.makeDogFile();
    }

    //* 3. menu: Add dog to Kennel
    public void addDogToKennel(){
        Kennel kennel = useFiles.readDogsFile();
        System.out.println("Add meg a kutya nevét : \n");
        Scanner be1 = new Scanner(System.in);
        String dogName = be1.nextLine();
        Scanner be2 = new Scanner(System.in);
        System.out.println("Add meg a kutya fajtáját : \n");
        String breed = be2.nextLine();

        if (breed.equals("Beagle")) {
            Beagle beagle = new Beagle(dogName);
            kennel.addDog(beagle);
            UseFiles.writeDogsFile(beagle);
        }

        if (breed.equals("Husky")) {
            Husky husky = new Husky(dogName);
            kennel.addDog(husky);
            UseFiles.writeDogsFile(husky);
        }
        System.out.println(kennel);
    }

    //* 4. menu: List dogs by ...
    public void listDogsByParameters(){
        Kennel kennel = useFiles.readDogsFile();
        System.out.println("Mi alapján szeretnéd kilistázni a kutyusokat (NAME, BREED vagy HAPPINESS)? : \n");
        Scanner be1 = new Scanner(System.in);
        String listBy = be1.nextLine();
        System.out.println("Milyen értékkel rendelkezzen a lista? : \n");
        Scanner be2 = new Scanner(System.in);
        String word = be2.nextLine();
        if (listBy.equals("NAME")){
            List<Dog> listDogs = listDogsBy(kennel, word, NAME);
            System.out.println(listDogs);
        }
        if (listBy.equals("BREED")){
            List<Dog> listDogs = listDogsBy(kennel, word, ListBy.BREED);
            System.out.println(listDogs);
        }
        if (listBy.equals("HAPPINESS")){
            List<Dog> listDogs = listDogsBy(kennel, word, ListBy.HAPPINESS);
            System.out.println(listDogs);
        }

        System.out.println();
    }

    //* 5. menu: Find Dog
    public void findDog(){
        Kennel kennel = useFiles.readDogsFile();
        System.out.println("Add meg a keresett kutya nevét : \n");
        Scanner be1 = new Scanner(System.in);
        String dogName = be1.nextLine();
        kennel.findByName(dogName);
        System.out.println(dogName + " kutya tagja a Kennelnek." );
    }

    //* 6. menu: Feed a dog
    public void feedADog(){
        Kennel kennel = useFiles.readDogsFile();
        System.out.println("Melyik kutyát szeretnéd megetetni? : \n");
        Scanner be1 = new Scanner(System.in);
        String dogName = be1.nextLine();
        kennel.feedADog(dogName);
        useFiles.rewriteKennelInDogsFile(kennel);
    }

    //* 7. menu: Feed all dogs
    public void feedAllDogs(){
        Kennel kennel = useFiles.readDogsFile();
        kennel.feedAll();
        useFiles.rewriteKennelInDogsFile(kennel);
    }

    //* 8. menu: Play a dog
    public void playADog(){
        Kennel kennel = useFiles.readDogsFile();
        System.out.println("Melyik kutyát szeretnél játszani? : \n");
        Scanner be1 = new Scanner(System.in);
        String dogName = be1.nextLine();
        System.out.println("Hány órát fogtok játszani? : \n");
        Scanner be2 = new Scanner(System.in);
        int hour = be2.nextInt();
        kennel.playWith(dogName, hour);
        useFiles.rewriteKennelInDogsFile(kennel);
    }

    //* 9. menu: Find most happinest dog(s)
    public void mostHappinestDogs(){
        Kennel kennel = useFiles.readDogsFile();
        System.out.println(kennel.getHappyDogNames(3));
    }

}

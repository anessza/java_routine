package dogs;

import java.util.Scanner;

public class Menu {
    public void menu() {

        UseFiles useFiles = new UseFiles();

        int muvelet = -1;
        Scanner be = new Scanner(System.in);
while (muvelet != 0){
            System.out.println("1.)Read dogs.txt");
            System.out.println("2.)Make dogs.txt");
            System.out.println("3.)Add dog to Kennel");
            System.out.println("4.)List Kennel");
            System.out.println("5.)Find Dog");
            System.out.println("6.)Feed a dog");
            System.out.println("7.)Feed all dogs");
            System.out.println("8.)Play a dog");
            System.out.println("9.)Find most happinest dog(s)");
            System.out.println("Hint other key to end game");

            muvelet = be.nextInt();

            if (muvelet < 1 || muvelet > 9) {
                System.out.println("Érvénytelen művelet.");
            }

            else {
                switch (muvelet) {
                    case 1 -> {
                        Kennel kennel = useFiles.readDogsFile();
                        System.out.println(kennel);
                    }
                    case 2 -> useFiles.makeDogFile();

                    case 3 -> {
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
                    case 4 -> {
                        Kennel kennel = useFiles.readDogsFile();
                        System.out.println(kennel.toString());
                    }
                    case 5 -> {
                        Kennel kennel = useFiles.readDogsFile();
                        System.out.println("Add meg a keresett kutya nevét : \n");
                        Scanner be1 = new Scanner(System.in);
                        String dogName = be1.nextLine();
                        kennel.findByName(dogName);
                    }
                    case 6 -> {
                        Kennel kennel = useFiles.readDogsFile();
                        System.out.println("Melyik kutyát szeretnéd megetetni? : \n");
                        Scanner be1 = new Scanner(System.in);
                        String dogName = be1.nextLine();
                        kennel.feedADog(dogName);
                        useFiles.rewriteKennelInDogsFile(kennel);
                    }
                    case 7 -> {
                        Kennel kennel = useFiles.readDogsFile();
                        kennel.feedAll();
                        useFiles.rewriteKennelInDogsFile(kennel);
                    }
                    case 8 -> {
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
                    case 9 -> {
                        Kennel kennel = useFiles.readDogsFile();
                        System.out.println(kennel.getHappyDogNames(3));
                    }
                }
            }
        }
    }
}

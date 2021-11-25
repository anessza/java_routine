package dogs;

import java.util.Scanner;

public class Menu {
    public void menu() {

        MenuPoints menuPoints = new MenuPoints();

        int muvelet = -1;
        Scanner be = new Scanner(System.in);
while (muvelet != 0){
            System.out.println("1.)Read dogs.txt");
            System.out.println("2.)Make dogs.txt");
            System.out.println("3.)Add dog to Kennel");
            System.out.println("4.)List dog by breed");
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
                    case 1 -> menuPoints.readFile();
                    case 2 -> menuPoints.makeFile();
                    case 3 -> menuPoints.addDogToKennel();
                    case 4 -> menuPoints.listDogsByParameters();
                    case 5 -> menuPoints.findDog();
                    case 6 -> menuPoints.feedADog();
                    case 7 -> menuPoints.feedAllDogs();
                    case 8 -> menuPoints.playADog();
                    case 9 -> menuPoints.mostHappinestDogs();
                }
            }
        }
    }
}

package dogs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;

public class UseFiles {

    public static final String SEPARATOR = " ";

    public Kennel readDogsFile() {
        Path file = Path.of("dogs.txt");

        Kennel kennel = new Kennel();

        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;

            while ((line = br.readLine()) != null) {
                int i = line.indexOf(SEPARATOR);

                String breed = line.substring(0, i);
                String dogName = line.substring(i+1);

                if (breed.equals("Beagle")) {
                    Beagle beagle = new Beagle(dogName);
                    kennel.addDog(beagle);
                }

                if (breed.equals("Husky")) {
                    Husky husky = new Husky(dogName);
                    kennel.addDog(husky);
                }
            }
        }
        catch(FileNotFoundException fnfe){
            System.out.println("Can't find file: " + fnfe.getMessage());
        }
        catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
        return kennel;
    }

public static void writeDogsFile(Dog dog){
    RandomAccessFile dogs;
    try
    {
        dogs = new RandomAccessFile("dogs.txt","rw");
        dogs.seek( dogs.length());
        dogs.writeBytes(dog.getName() + SEPARATOR + dog.getBreed() + "\n");
        dogs.close();
    }
    catch( IOException e ){
        System.out.println("HIBA");
    }
}

}

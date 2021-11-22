package dogs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.lang.Integer.parseInt;

public class UseFiles {

    public static final String SEPARATOR = " ";
    public static final String SEPARATOR2 = "+";

    public Kennel readDogsFile() {
        Path file = Path.of("dogs.txt");

        Kennel kennel = new Kennel();

        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;

            while ((line = br.readLine()) != null) {
                int i = line.indexOf(SEPARATOR);
                int j = line.indexOf(SEPARATOR2);

                String breed = line.substring(0, i);
                String dogName = line.substring(i+1, j);
                int happiness = parseInt(line.substring(j+1));

                if (breed.equals("Beagle")) {
                    Beagle beagle = new Beagle(dogName);
                    kennel.addDog(beagle);
                    beagle.happiness = happiness;
                }

                if (breed.equals("Husky")) {
                    Husky husky = new Husky(dogName);
                    kennel.addDog(husky);
                    husky.happiness = happiness;
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
        dogs.writeBytes(dog.getBreed() + SEPARATOR + dog.getName() + SEPARATOR2 + '0' + "\n");
        dogs.close();
    }
    catch( IOException e ){
        System.out.println("HIBA");
    }
}
    public void makeDogFile()
    {
        RandomAccessFile file;

        try
        {
            file = new RandomAccessFile("dogs.txt","rw");
            file.close();
        }
        catch( IOException e )
        {
            System.err.println("HIBA");
        }
    }


    public void rewriteKennelInDogsFile(Kennel updatedKennel) {
        RandomAccessFile dogs;
        try
        {
            dogs = new RandomAccessFile("dogs.txt","rw");
            dogs.setLength(0);
            int j = updatedKennel.dogs.size();
            for (int i=0; i<j; i++) {
                dogs.writeBytes(updatedKennel.dogs.get(i).getBreed() + SEPARATOR + updatedKennel.dogs.get(i).getName() + SEPARATOR2 + updatedKennel.dogs.get(i).getHappiness() + "\n");
            }
            dogs.close();
        }
        catch( IOException e ){
            System.out.println("HIBA");
        }

    }
}

package dogs;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class UseFiles {

    Kennel kennel = new Kennel();
    public static final String SEPARATOR = " ";

    public List<Dog> readDogsFile(BufferedReader reader) {

        Path file = Path.of("dogs.txt");
        List<Dog> dogs = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;

            while ((line = br.readLine()) != null) {
                int i = line.indexOf(SEPARATOR);
                String type = line.substring(0, i);
                String dogName = line.substring(i+1);

                if (type.equals(Beagle)) {
                    Beagle beagle = new Beagle(dogName);
                    kennel.addDog(beagle);
                }

                else if (type.equals(Husky)) {
                    Husky husky = new Husky(dogName);
                    kennel.addDog(husky);
                }
            }
            return dogs;

        }
        catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
    }



}

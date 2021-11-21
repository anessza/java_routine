package dogs;

import java.io.BufferedReader;
import java.io.IOException;
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

                String type = line.substring(0, i);
                String dogName = line.substring(i+1);

                if (type.equals("Beagle")) {
                    Beagle beagle = new Beagle(dogName);
                    kennel.addDog(beagle);
                }

                if (type.equals("Husky")) {
                    Husky husky = new Husky(dogName);
                    kennel.addDog(husky);
                }
            }
            return kennel;

        }
        catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
    }



}

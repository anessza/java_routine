package hu.nive.ujratervezes.java_routine.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DaVinciCode {
    int encode(String file, char code) {

        if (!(code=='0') && !(code == '1') && !(code == 'x' )) throw new IllegalArgumentException("input code is wrong");

        Path path = Path.of(file);
        try (BufferedReader br = Files.newBufferedReader(path)) {

            String line;

            List<Character> numberOfCode = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (code == line.charAt(i) ) numberOfCode.add(line.charAt(i));
                }
            }

            return numberOfCode.size();
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
    }
}

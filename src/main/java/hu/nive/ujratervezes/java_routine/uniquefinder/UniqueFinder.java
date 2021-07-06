package hu.nive.ujratervezes.java_routine.uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {
    public List<Character> uniqueChars(String s) {
        if (s == null) throw new IllegalArgumentException("empty string");

        List<Character> uniqueChars = new ArrayList<>();
        for (int i=0; i<s.length(); i++) {
            if (!uniqueChars.contains(s.charAt(i))) uniqueChars.add(s.charAt(i));
        }
        return uniqueChars;
    }
}
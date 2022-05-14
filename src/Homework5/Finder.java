package Homework5;

import java.util.Objects;
import java.util.Set;

public class Finder {
    public static boolean check(Human humanToCheck, Set<Human> humanSet) {
        boolean result = false;

        for (Human h : humanSet) {
            if (
//                    h.getUser_name().equals(humanToCheck.getUser_name()) &&
                            h.getName().equals(humanToCheck.getName()) &&
                            h.getBirthday().equals(humanToCheck.getBirthday()) &&
                            h.getCountry().equals(humanToCheck.getCountry()) &&
                            h.getSalary().equals(humanToCheck.getSalary())
            ) {
                result = true;
                break;
            }
        }

        return result;
    }
}

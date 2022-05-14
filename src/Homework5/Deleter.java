package Homework5;

import java.util.Set;

public class Deleter {
    public static boolean delete_check(Human humanToDelete, Set<Human> humanSet) {
        boolean result = false;

        for (Human h : humanSet) {
            if (h.getUser_name().equals(humanToDelete.getUser_name())) {
                result = true;
                break;
            }
        }
        return result;
    }
}

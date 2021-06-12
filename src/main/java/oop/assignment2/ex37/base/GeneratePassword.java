package oop.assignment2.ex37.base;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Random;


public class GeneratePassword {
    public static List<Character> convertStringToCharList(String str) {

        return str.chars().mapToObj(e -> (char) e)
                .collect(Collectors.toList());
    }

    public String randomPassGenerator(int min, int specialChar, int num) {
        int counterSpecial = 0, counterNum = 0;
        Random rand = new Random();
        StringBuilder pass = new StringBuilder();
        String abc = "abcdefghijklmnopqrstuvwxyz" +
                        "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special = "$#@!%^&*()";
        String n = "0123456789";


        List<Character>
                chars = convertStringToCharList(abc);

        List<Character>
                chars1 = convertStringToCharList(n);

        List<Character>
                chars2 = convertStringToCharList(special);

        while (pass.length() > min && pass.length() >= specialChar * num) {
            int curChar = rand.nextInt(3) + 1;

            if (curChar == 1) {
                pass.append(chars.get(rand.nextInt(abc.length())));
            }

            if (curChar == 2 && counterNum <= num) {
                pass.append(chars2.get(rand.nextInt(n.length())));
            }

            if (curChar == 3 && counterSpecial <= specialChar) {
                pass.append(chars1.get(rand.nextInt(special.length())));
            }
        }

        return pass.toString();
    }
}

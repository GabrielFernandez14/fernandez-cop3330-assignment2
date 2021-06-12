package oop.assignment2.ex37.base;

import java.util.Scanner;

public class Solution37 {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        getPass();
    }

    public static void getPass() {
        System.out.print("What's the minimum length? ");
        int min = in.nextInt();

        System.out.print("How many special characters? ");
        int specialChar = in.nextInt();

        System.out.print("How many special characters? ");
        int num = in.nextInt();

        GeneratePassword gp = new GeneratePassword();
        String password = gp.randomPassGenerator(min, specialChar, num);

        System.out.println("Your password is " + password);
    }
}

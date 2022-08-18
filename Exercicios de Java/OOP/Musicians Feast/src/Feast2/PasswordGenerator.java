package Feast2;

import java.util.Arrays;

public class PasswordGenerator {

    public static void main(String[] args) {
        generatePassword("Peter Gabriel"); // G@br!el
        generatePassword("Brian Adams"); // @d@ms
    }
    public static void generatePassword(String musicianName){
        String[] musician = musicianName.split(" ");
        String musSurname = musician[1];
        String result1 = musSurname.replaceAll("[Aa]", "@").replaceAll("[Ii]", "!");
        System.out.println(result1);
        }
    }


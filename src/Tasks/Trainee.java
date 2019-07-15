package Tasks;

import java.util.*;

public class Trainee {

    public static void main(String[] args) {


        String name;
        int stamina = 5;
        int strength = 7;

        Boolean exercice = false;


        while (exercice) {
            System.out.println("incepem exercitiul");
            stamina--;
            strength++;
        }

        System.out.println("stamina : " + stamina + "Strength" +  strength);

        List<String> familyMembers = new ArrayList<>();

        familyMembers.add("John");
        familyMembers.add("Suzy");

        for (String names : familyMembers) {
            System.out.println(names);
        }


    }
}
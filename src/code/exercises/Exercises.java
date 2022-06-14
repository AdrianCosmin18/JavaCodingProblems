package code.exercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercises {

    public String readAString(){

        System.out.print("cuv = ");
        Scanner read = new Scanner(System.in);
        return read.nextLine();
    }

    //Counting duplicate characters: Write a program that counts duplicate characters from a given string.
    public void ex1(){//O(n)

        String cuv = readAString();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<cuv.length();i++){

            char c = cuv.charAt(i);
            if(map.containsKey(c)){

                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c, 1);
            }
        }

        for(Map.Entry<Character , Integer> entry : map.entrySet()){

            System.out.println("{" + entry.getKey() + ":" + entry.getValue() + "}");
        }
    }

    //Finding the first non-repeated character: Write a program that returns the first non-repeated character from a given string.
    public void ex2(){

        String cuv = readAString();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0;i<cuv.length();i++){//parcurgere O(n)

            char c = cuv.charAt(i);
            if(map.containsKey(c)){

                map.put(c, map.get(c) + 1);//adaugare in O(n)
            }
            else{
                map.put(c, 1);//adaugare in O(n)
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){//parcurgere in O(n)

            if(entry.getValue() == 1){
                System.out.println("first non-repeted character from a string : " + entry.getKey());
                break;
            }
        }
    }

    //Reversing letters and words: Write a program that reverses the letters of each word and a program that reverses the letters of each word and the words themselves.
}

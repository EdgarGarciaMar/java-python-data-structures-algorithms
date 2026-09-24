
/*
Check Permutation: Given two strings, write a method to decide if one is a permutation of the
other
*/

import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

public class stringPermutation {

    /**
     * Optimal method

    private static boolean checkPermuation(String a, String b) {
    if (a.length() != b.length()) return false;

    HashMap<Character, Integer> map = new HashMap<>();

    for (char c : a.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

    for (char c : b.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) - 1);
    }

    for (int count : map.values()) {
        if (count != 0) return false;
    }

    return true;
    }
     */

    private static boolean checkPermuation (String a, String b){
        HashMap <Character, Integer> mapA = new HashMap<>();
        HashMap <Character, Integer> mapB = new HashMap<>();
        char [] lettersA = a.toCharArray();
        char [] lettersB = b.toCharArray();

        if (lettersA.length != lettersB.length) return false;

        for(int i = 0; i<lettersA.length; i++){
            mapA.put(lettersA[i],mapA.getOrDefault(lettersA[i], 0) + 1);
            mapB.put(lettersB[i],mapB.getOrDefault(lettersB[i], 0) + 1);
        }

        for(char c : mapA.keySet()){
            if(!mapA.get(c).equals(mapB.get(c))) return false;
        }

        return true;
    }
    
    public static void main(String[] args) {
        List <String> palabra1 = Arrays.asList("mama","carro","lorena","papaya");
        List <String> palabra2 = Arrays.asList("mama","papa","lorena","hola");
        for(int i = 0; i<palabra1.size();i++ ){
            System.out.println("Es permutation:"+ checkPermuation(palabra1.get(i), palabra2.get(i)));
        }
    }
}

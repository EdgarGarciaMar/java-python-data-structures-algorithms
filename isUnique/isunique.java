
/*
Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures? what about my solution?
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class isunique {
    private static boolean unique(String s){
         Set<Character> map =  new HashSet<>();
         char [] letters = s.toCharArray();

         for (char c : letters){
            boolean seen = map.add(c);
            if(!seen) return false;
         }

         return true;
    }
    public static void main(String[] args) {
     List<String> tests = Arrays.asList("Red", "Green", "Blue");
       for(String s: tests){
        System.out.println(s +", Is unique :"+ unique(s));
       }

    }
}

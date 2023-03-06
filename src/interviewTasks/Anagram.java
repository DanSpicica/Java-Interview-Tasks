package interviewTasks;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("sameLetters(\"Abs\",\"Sba\") = " + sameLetters("Abs", "Sba"));

        System.out.println("sameLetters2(\"abs\",\"BSA\") = " + sameLetters2("abs", "BSA"));
    }


/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */
    public static boolean sameLetters(String str1, String str2){
        char[] ch1 =str1.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        char[] ch2 =str2.toLowerCase().toCharArray();
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }

    public static boolean sameLetters2(String str1, String str2){
        boolean sameLetters = false;
        if (Arrays.asList(str1.toLowerCase().split("")).stream().sorted().collect(Collectors.toList()).
                equals(Arrays.asList(str2.toLowerCase().split("")).stream().sorted().collect(Collectors.toList()))){
            sameLetters=true;
        }
        return sameLetters;

    }
}

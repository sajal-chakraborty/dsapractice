package com.example.algorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {
        String str1 = "ate";
        String str2 = "eta";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        List<String> words = List.of("listen", "silent", "enlist", "inlets", "google", "gooogle");
        Map<String, List<String>> anagramGroups = new HashMap<>();
        for (String word : words) {
            String sortedWord = sortString(word);
            anagramGroups.computeIfAbsent(sortedWord, k -> new java.util.ArrayList<>()).add(word);

        }
        System.out.println("Anagram Groups: " + anagramGroups.values());

    }

    private static String sortString(String word) {
        char[] charArray = word.toCharArray();
        java.util.Arrays.sort(charArray);
        return new String(charArray);
    }

    private static boolean areAnagrams(String str1, String str2) {
        boolean result = false;
        if (str1.length() != str2.length()) {
            return result;
        }
        int[] charCount = new int[26]; // Assuming only lowercase letters a-z
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
            charCount[str2.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return result;
            }
        }

        return true;
    }
}

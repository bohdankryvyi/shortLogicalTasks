package main.interestingMethods;

import java.util.HashSet;

public class PrintDuplicateSymbols {
    public static void printDuplicateSymbols(String text) {
        HashSet<Character> charSet = new HashSet<>();
        char[] symbols = text.toCharArray();

        for (int i = 0; i < symbols.length; i++) {
            for (int j = i + 1; j < symbols.length; j++) {
                if (symbols[i] == symbols[j]) {
                    charSet.add(symbols[i]);
                }
            }
        }
        charSet.forEach(System.out::println);
    }
}

package main.interestingMethods;

public class PalindromeChecker {
    public static void printDuplicateSymbols(String palindromeText) {
        String normalized = palindromeText.toLowerCase();
        StringBuilder reversed = new StringBuilder();
        for (int i = normalized.length()-1; i>=0; i--){
            reversed.append(normalized.charAt(i));
        }

        if (normalized.equals(reversed.toString())) {
            System.out.println(palindromeText + " is a palindrome");
        } else {
            System.out.println(palindromeText + " is NOT a palindrome");
        }
    }
}

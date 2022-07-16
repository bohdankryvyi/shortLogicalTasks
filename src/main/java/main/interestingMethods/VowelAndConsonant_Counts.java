package main.interestingMethods;

public class VowelAndConsonant_Counts {
    public static void vowelAndConsonant_Counts(String text) {
        String normalized = text.toLowerCase();
        char[] symbols = normalized.toCharArray();
        int vowelsCount = 0;
        int consonantCount = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};

        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (symbols[i] == vowels[j]) {
                    vowelsCount += 1;
                }
            }
            for (int k = 0; k < consonants.length; k++) {
                if (symbols[i] == consonants[k]) {
                    consonantCount += 1;
                }
            }
        }

        System.out.println("Vowels count is = " + vowelsCount);
        System.out.println("Consonant count is = " + consonantCount);
    }
}

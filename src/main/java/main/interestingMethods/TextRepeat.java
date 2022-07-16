package main.interestingMethods;

import java.util.HashMap;
import java.util.Map;

public class TextRepeat {
    public static void textRepeat(String text) {
        String str1 = "Software testing is a process of executing a program or application with the intent of finding the software bugs";
        String str2 = "Testing is a process rather than a single activity";

        String[] str1List = str1.split(" ");
        String[] str2List = str2.split(" ");

        Map<String, Integer> results = new HashMap<>();


        for (int i = 0; i < str2List.length; i++) {
            int count = 0;
            for (int k = 0; k < str1List.length; k++) {
                if (str2List[i].equalsIgnoreCase(str1List[k])) {
                    count += 1;
                }
            }
            results.put(str2List[i], count);
        }
        System.out.println(results);
    }
}

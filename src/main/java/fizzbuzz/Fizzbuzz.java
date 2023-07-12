package fizzbuzz;

import java.util.HashMap;
import java.util.List;

public class Fizzbuzz {
    public HashMap<Integer, String> process(List<Integer> setOfNumbers) {
        HashMap<Integer, String> integerStringHashMap = new HashMap<Integer, String>();
        for (Integer setOfNumber : setOfNumbers) {
            if (setOfNumber % 15 == 0) {
                integerStringHashMap.put(setOfNumber, "FizzBuzz");
                continue;
            }
            if (setOfNumber % 3 == 0) {
                integerStringHashMap.put(setOfNumber, "Fizz");
                continue;
            }
            if (setOfNumber % 5 == 0) {
                integerStringHashMap.put(setOfNumber, "Buzz");
                continue;
            }
            integerStringHashMap.put(setOfNumber, setOfNumber.toString());
        }
        return integerStringHashMap;
    }
}

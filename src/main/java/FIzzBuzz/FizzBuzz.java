package FIzzBuzz;

import java.util.*;
import java.util.HashMap;


public class FizzBuzz {

    HashMap<Integer, String> commandMap = new HashMap<Integer, String>();

    public FizzBuzz() {
        commandMap.put(15, "FizzBuzz");
        commandMap.put(3, "Fizz");
        commandMap.put(5, "Buzz");
    }

    public ArrayList<String> play() {
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 1; i < 101; i++) {
            list.add(value(i));
        }
        return list;
    }

    private String value(int i) {
        String out = Integer.toString(i);
        
        for (Map.Entry<Integer, String> entry : commandMap.entrySet()) {
            if (i % entry.getKey() == 0) {
                out = entry.getValue();
            }
        }
        return out;
    }

}

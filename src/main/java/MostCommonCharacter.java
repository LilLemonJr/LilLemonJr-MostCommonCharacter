import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        
        // create HashMap and traverse through string to fill charFrequencies
	    Map<Character, Integer> charFrequencies = new HashMap<>();
	    for (char c : str.toCharArray()) {
		    charFrequencies.put(c, charFrequencies.getOrDefault(c, 0) + 1);
	    }

	    // Find the character with the highest frequency
	    char mostCommon = ' ';
	    int maxFrequency = 0;
	    for (Map.Entry<Character, Integer> entry : charFrequencies.entrySet()) {
		    if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostCommon = entry.getKey();
		    }
	    }
        return mostCommon;
    }
}

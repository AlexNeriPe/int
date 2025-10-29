import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        String s = "abcabcbb";
        lengthOfLongestSubstring(s);
    }

    static int lengthOfLongestSubstring(String s){
        Set<Character> charSet = new HashSet<>();
        int maxLength = 0; 
        int anchor = 0;

        for(int i = 0 ; i < s.length() ; i++) {
            while(charSet.contains(s.charAt(i))) {
                charSet.remove(s.charAt(anchor));
                anchor++;                
            } 
            charSet.add(s.charAt(i));
            maxLength = Math.max(maxLength, i - anchor + 1);
        }
        System.out.println(maxLength);
        return maxLength;
    }
}

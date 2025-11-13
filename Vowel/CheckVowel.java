import java.util.*;
class CheckVowel {
    String isVowel(char c) {
        c = Character.toLowerCase(c);
        if (c== 'a' ||c=='e' ||c=='i' ||c=='o' ||c=='u') {
            return "YES" ;
        } else {
            return "NO" ;
        }
        
    }
}

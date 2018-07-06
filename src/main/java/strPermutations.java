import java.util.*;

public class strPermutations {
    public static List<String> getPermutations(String in) {
        if (in.length() == 1 )
            return new ArrayList<>(Collections.singleton(in));
        String  inWithoutFirst = in.substring(1);

        List<String> permutationsWithoutFirst = getPermutations(inWithoutFirst);
        //mix with first char

        List<String> permutations = new ArrayList<>();
        char first = in.charAt(0);
        for (String perm:permutationsWithoutFirst) {
            for (int i = 0; i<= perm.length(); i++) {
                permutations.add(perm.substring(0,i)+first+perm.substring(i));
            }
        }
        return permutations;
    }
}

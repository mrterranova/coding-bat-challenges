import java.util.List;

public class Afternoon121420 {
    public static void main(String[] args) {

    }

    //elements is just a collection of substrings(possibly individual characters)
    //perms is the full list of all permutations which will be concatenated elements
    static void generatePermutations(String current, List<String> elements, List<String> perms){
        //"a", "b", "c"
        //"abc
        //"acb"
        //"bca"
        //"bac"
        //"cab"
        //"cba"

        if(elements.isEmpty()) {
            perms.add(current);
        } else {

        }

    }
}

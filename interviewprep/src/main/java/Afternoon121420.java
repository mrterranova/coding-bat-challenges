
import java.util.ArrayList;
import java.util.List;

public class Afternoon121420 {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("a");
        elements.add("b");
        elements.add("c");
        elements.add("d");
        elements.add("e");
        elements.add("f");

        List<String> permutations = new ArrayList<>();

        generatePermutations("", elements, permutations);
        for( String permutation : permutations){
            System.out.println(permutation);
        }
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
            for(int i=0; i < elements.size(); i++){
                String element = elements.get(i);
                elements.remove(i);
                generatePermutations(current+element, elements, perms );
                 elements.add(i, element);
            }
        }

    }
}

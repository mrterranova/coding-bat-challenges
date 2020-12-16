import java.util.List;
import java.util.stream.Collectors;

public class Functional2 {
    public static void main(String[] args) {
        //NO NEG
        //NO 9
        //NO TEEN
        //NO Z
        //NO LONG
        //NO 34
        //NO YY
        //TWO 2
        //SQUARE 56
    }

    //NO NEG
    public List<Integer> noNeg(List<Integer> nums) {
        nums = nums.stream()
                .filter(n -> n>=0)
                .collect(Collectors.toList());
        return nums;
    }

    //NO 9
    public List<Integer> no9(List<Integer> nums) {
        nums = nums.stream()
                .filter(n -> n%10 !=9)
                .collect(Collectors.toList());
        return nums;
    }

    //NO TEEN
    public List<Integer> noTeen(List<Integer> nums) {
        nums = nums.stream()
                .filter(n -> n >19 || n<13)
                .collect(Collectors.toList());
        return nums;
    }

    //NO Z
    public static List<String> noZ(List<String> strings) {
        strings = strings.stream()
                .filter(n -> !n.contains("z"))
                .collect(Collectors.toList());
        return strings;
    }

    //NO LONG
    public static List<String> noLong(List<String> strings) {
        strings = strings.stream()
                .filter(n -> n.length()<4)
                .collect(Collectors.toList());
        return strings;
    }

    //NO 34
    public static List<String> no34(List<String> strings34) {
        strings34 = strings34.stream()
                .filter(n -> n.length()!=3 && n.length()!=4)
                .collect(Collectors.toList());
        return strings34;
    }

    //NO YY
    public List<String> noYY(List<String> strings) {
        strings = strings.stream()
                .map(n -> n+"y")
                .filter(n -> !n.contains("yy"))
                .collect(Collectors.toList());
        return strings;
    }

    //TWO 2
    public List<Integer> two2(List<Integer> nums) {
        nums = nums.stream()
                .map(n -> n*2)
                .filter(n -> n%10 != 2)
                .collect(Collectors.toList());
        return nums;
    }

    //SQUARE 56
    public List<Integer> square56(List<Integer> nums) {
        nums = nums.stream()
                .map(n->n*n+10)
                .filter(n-> n%10!=5 && n%10!=6)
                .collect(Collectors.toList());
        return nums;
    }
}

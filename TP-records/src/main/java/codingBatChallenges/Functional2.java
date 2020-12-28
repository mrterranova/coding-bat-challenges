package codingBatChallenges;

import java.util.List;
import java.util.stream.Collectors;

public class Functional2 {
    public static void main(String[] args) {
        //NO NEG
        //Given a list of integers, return a list of the integers, omitting any that are less than 0.

        //NO 9
        //Given a list of non-negative integers, return a list of those numbers except omitting any
        //that end with 9. (Note: % by 10)

        //NO TEEN
        //Given a list of integers, return a list of those numbers, omitting any that are between 13
        //and 19 inclusive.

        //NO Z
        //Given a list of strings, return a list of the strings, omitting any string that contains a
        //"z". (Note: the str.contains(x) method returns a boolean)

        //NO LONG
        //Given a list of strings, return a list of the strings, omitting any string length 4 or more.

        //NO 34
        //Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

        //NO YY
        //Given a list of strings, return a list where each string has "y" added at its end,
        //omitting any resulting strings that contain "yy" as a substring anywhere.

        //TWO 2
        //Given a list of non-negative integers, return a list of those numbers multiplied by 2,
        //omitting any of the resulting numbers that end in 2.

        //SQUARE 56
        //Given a list of integers, return a list of those numbers squared and the product added to 10,
        //omitting any of the resulting numbers that end in 5 or 6.
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

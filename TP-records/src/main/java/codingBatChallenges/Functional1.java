package codingBatChallenges;

import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {
    public static void main(String[] args) {
        //DOUBLING
        //Given a list of integers, return a list where each integer is multiplied by 2.

        //SQUARE
        //Given a list of integers, return a list where each integer is multiplied with itself.

        //ADD STAR
        //Given a list of strings, return a list where each string has "*" added at its end.

        //COPIES 3
        //Given a list of strings, return a list where each string is replaced by 3 copies
        //of the string concatenated together.

        //MORE Y
        //Given a list of strings, return a list where each string has "y" added at its start
        //and end.

        //MATH 1
        //Given a list of integers, return a list where each integer is added to 1 and the
        //result is multiplied by 10.

        //RIGHT DIGIT
        //Given a list of non-negative integers, return an integer list of the rightmost digits.
        //(Note: use %)

        //LOWER
        //Given a list of strings, return a list where each string is converted to lower case
        //(Note: String toLowerCase() method).

        //NO X
        //Given a list of strings, return a list where each string has all its "x" removed.
    }

    //DOUBLING
    public List<Integer> doubling(List<Integer> nums) {
        nums = nums.stream().map(n -> n*2)
                .collect(Collectors.toList());
        return nums;
    }

    //SQUARE
    public List<Integer> square(List<Integer> nums) {
        nums = nums.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());
        return nums;
    }

    //ADD STAR
    public List<String> addStar(List<String> strings) {
        strings = strings.stream()
                .map(n -> n+"*")
                .collect(Collectors.toList());
        return strings;
    }

    //COPIES 3
    public List<String> copies3(List<String> strings) {
        strings = strings.stream()
                .map(n -> n+n+n)
                .collect(Collectors.toList());
        return strings;
    }

    //MORE Y
    public List<String> moreY(List<String> strings) {
        strings = strings.stream()
                .map(n -> "y"+n+"y")
                .collect(Collectors.toList());
        return strings;
    }

    //MATH 1
    public List<Integer> math1(List<Integer> nums) {
        nums = nums.stream()
                .map(n -> n*10+10)
                .collect(Collectors.toList());
        return nums;
    }

    //RIGHT DIGIT
    public List<Integer> rightDigit(List<Integer> nums) {
        nums = nums.stream()
                .map(n -> n%10)
                .collect(Collectors.toList());
        return nums;
    }

    //LOWER
    public List<String> lower(List<String> strings) {
        strings = strings.stream()
                .map(n -> n.toLowerCase())
                .collect(Collectors.toList());
        return strings;
    }

    //NO X
    public List<String> noX(List<String> strings) {
        strings.replaceAll(n -> n.replace("x", ""));
        return strings;
    }

}


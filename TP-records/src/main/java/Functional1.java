import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {
    public static void main(String[] args) {}
    public List<Integer> doubling(List<Integer> nums) {
        nums = nums.stream().map(n -> n*2)
                .collect(Collectors.toList());
        return nums;
    }
    public List<Integer> square(List<Integer> nums) {
        nums = nums.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());
        return nums;
    }
    public List<String> addStar(List<String> strings) {
        strings = strings.stream()
                .map(n -> n+"*")
                .collect(Collectors.toList());
        return strings;
    }
    public List<String> copies3(List<String> strings) {
        strings = strings.stream()
                .map(n -> n+n+n)
                .collect(Collectors.toList());
        return strings;
    }
    public List<String> moreY(List<String> strings) {
        strings = strings.stream()
                .map(n -> "y"+n+"y")
                .collect(Collectors.toList());
        return strings;
    }
    public List<Integer> math1(List<Integer> nums) {
        nums = nums.stream()
                .map(n -> n*10+10)
                .collect(Collectors.toList());
        return nums;
    }
    public List<Integer> rightDigit(List<Integer> nums) {
        nums = nums.stream()
                .map(n -> n%10)
                .collect(Collectors.toList());
        return nums;
    }
    public List<String> lower(List<String> strings) {
        strings = strings.stream()
                .map(n -> n.toLowerCase())
                .collect(Collectors.toList());
        return strings;
    }
    public List<String> noX(List<String> strings) {
        strings.replaceAll(n -> n.replace("x", ""));
        return strings;
    }

}


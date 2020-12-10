import java.util.HashMap;
import java.util.Map;

public class Afternoon121020 {

    public static void main(String[] args) {
        System.out.println(collatz(1000000));
        int temp =0;
        int ans = 0;
        for(int i = 1; i < 1000000; i++){
            temp = collatz(i);
            ans = i;
        }
    }


//static int factorial(int n){
//    if(n == 1) return 1;
//
//}
static Map<Long, Integer> lengths = new HashMap<>();

    static int collatz(long num) {
//        System.out.print(num + " -> ");
        if (num == 1) return 1;

        if(lengths.containsKey(num)){
            return lengths.get(num);
        }

        if (num % 2 == 0) {
            int temp = 1 + collatz(num / 2);
            lengths.put(num, temp);
            return temp;
        }
        else {
            int temp = 1 + collatz(3 * num + 1);
            lengths.put(num, temp);
            return temp;
        }
    }

}

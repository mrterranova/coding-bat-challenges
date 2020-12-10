public class Morning12820 {
    public static void main(String[] args) {
        System.out.println(reverseDigits(1234));
        System.out.println(reverseDigits(1000));
        System.out.println(reverseDigits(7));
        int[] nums = new int[]{ 1, 1, 2, 1, 1};
        int[] numss = new int[]{ 1, 1, 2, 2, 2, 1};
        int[] numsss = new int[]{ 1, 1};
        int[] numssss = new int[]{1,1, 2,3,2,4};
        System.out.println(noTriples(nums));
        System.out.println(noTriples(numss));
        System.out.println(noTriples(numsss));
        System.out.println(noTriples(numssss));
    }
//    static int reverseDigits(int x){
//        StringBuilder str = new StringBuilder(x+"").reverse();
//        String res = String.valueOf(str);
//        return Integer.parseInt(res);
//    }

    static int reverseDigits(int x){
        int res = 0;
        if(x < 10){
            return x;
        }
        while(x != 0){
            int one = x %10;
            x /= 10;
            res *= 10;
            res = res + one;
        }
        return res;
    }

//    static boolean noTriples(int[] n){
//
//        for (int i = 0; i < n.length-2; i++) {
//            if (n[i] == n[i + 1] && n[i] == n[i + 2]) return true;
//        }
//        return false;
//    }
    static boolean noTriples(int[] n){
        boolean isTriple = false;
        for (int i=0; i< n.length; i++) {
            int count = 0;
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] == n[j]) {
                    count++;
                }
                if (count == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}

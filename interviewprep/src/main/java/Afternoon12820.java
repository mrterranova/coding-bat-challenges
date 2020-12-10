public class Afternoon12820 {
    public static void main(String[] args) {
//        System.out.println(isPrime(2));
//        System.out.println(isPrime(6));
//        System.out.println(isPrime(7));
//        System.out.println(isPrime(12100181));
//        System.out.println(isPrime(12100183));
        System.out.println(LPF(14));//7
        System.out.println(LPF(31));//31
        System.out.println(LPF(42));//7
        System.out.println(LPF(39));//13
        System.out.println(LPF(12));//3
        System.out.println(LPF(35));//7
        System.out.println(LPF(5512));
        System.out.println(LPF(12100181));//12100181
    }

//    static boolean isPrime(int x){
//        for(int i=3; i < x/2; i++){
//            if( x%i == 0) return false;
//        }
//        return true;
//    }

    static boolean isPrime(int x){
        for(int i=2; i*i <= x; i++){
            if(x % i == 0) return false;
        }
        return true;
    }

    static int LPF(int x){
        //need to figure out the lowest prime factor
        int biggest = 0;
        for (int i = 1; i <= x ; i++) {
            if (x % i == 0 && isPrime(i)) {
                biggest = i;
            }
        }
        return biggest;
    }

}

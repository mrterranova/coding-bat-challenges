public class Recursion1 {
    public static void main(String[] args) {

        System.out.println(factorial(1));//1
        System.out.println(factorial(2));//2
        System.out.println(factorial(3));//6

        System.out.println(bunnyEars(0));//0
        System.out.println(bunnyEars(1));//2
        System.out.println(bunnyEars(2));//4

        System.out.println(fibonacci(0));//0
        System.out.println(fibonacci(1));//1
        System.out.println(fibonacci(2));//1

        System.out.println(bunnyEars2(0));//0
        System.out.println(bunnyEars2(1));//2
        System.out.println(bunnyEars2(2));//5

        System.out.println(triangle(0));//0
        System.out.println(triangle(1));//1
        System.out.println(triangle(2));//3

        System.out.println(sumDigits(126));//9
        System.out.println(sumDigits(49));//13
        System.out.println(sumDigits(12));//3

        System.out.println(count7(717));//2
        System.out.println(count7(7));//1
        System.out.println(count7(123));//0

        System.out.println(count8(8));//1
        System.out.println(count8(818));//2
        System.out.println(count8(8818));//4

        System.out.println(powerN(3,1));//3
        System.out.println(powerN(3,2));//9
        System.out.println(powerN(3, 3));//27

        System.out.println(countX("xxhixx"));//4
        System.out.println(countX("xhixhix"));//3
        System.out.println(countX("hi"));//0

        System.out.println(changeXY("codex"));//codey
        System.out.println(changeXY("xxhixx"));//yyhiyy
        System.out.println(changeXY("xhixhix"));//yhiyhiy

        System.out.println(changePi("xpix"));//x3.14x
        System.out.println(changePi("pipi"));//3.143.14
        System.out.println(changePi("pip"));//3.14p

        System.out.println();
        System.out.println();
        System.out.println();


    }

    public static int factorial(int n) {
        int result = n;
        if (n == 1) return n;
        return n * factorial(n-1);
    }

    public static int bunnyEars(int n) {
        if (n==0) return 0;
        return bunnyEars(n-1)+2;
    }

    public static int fibonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int bunnyEars2(int n) {
        if(n==0) return 0;
        if(n%2==0) return bunnyEars2(n-1)+3;
        else return bunnyEars2(n-1)+2;
    }

    public static int triangle(int rows) {
        if (rows == 0) return 0;
        if (rows == 1) return 1;

        return triangle(rows-1) + rows;
    }

    public static int sumDigits(int n) {
        if(n<10) return n;
        return (n%10) + sumDigits(n/10);
    }

    public static int count7(int n) {
        if(n < 10 && n ==7) return 1;
        if(n < 10 && n !=7) return 0;
        int count = 0;
        if(n%10==7) count++;
        return count + count7(n/10);

    }

    public static int count8(int n) {
        if(n < 10 && n ==8) return 1;
        if(n < 10 && n !=8) return 0;
        int count = 0;
        if(n%100==88) count = count+2;
        else if(n%10==8) count++;
        return count + count8(n/10);
    }

    public static int powerN(int base, int n) {
        if(n==0) return 1;
        return base*powerN(base, n-1);
    }


    public static int countX(String str) {
        if(str.length() == 0){
            return 0;
        }
        int count = 0;
        if(str.charAt(0)=='x') count++;
        return count + countX(str.substring(1, str.length()));
    }


    public static int countHi(String str) {
        if(str.length() < 2) return 0;
        int count = 0;
        if(str.charAt(0)=='h' && str.charAt(1)=='i') count++;
        return count + countHi(str.substring(1, str.length()));
    }


    public static String changeXY(String str) {
        if(str.length() ==0) return str;
        String res = "";
        if(str.charAt(0)=='x') res += "y";
        else res += str.charAt(0);
        return  res += changeXY(str.substring(1, str.length()));
    }

    public static String changePi(String str) {
        if(str.length()< 2) return str;

        String sub = str.substring(0, 2);
        String res = "";
        if(sub.compareTo("pi")==0) {
            res += "3.14";
            return res+= changePi(str.substring(2, str.length()));
        }
        else res+= str.charAt(0);
        return res += changePi(str.substring(1, str.length()));
    }

    public static String noX(String str) {
        if(str.length()==0) return str;
        String res = "";
        if(str.charAt(0) == 'x') res += "";
        else res += str.charAt(0);
        return res += noX(str.substring(1, str.length()));
    }

    public static boolean array6(int[] nums, int index) {
        if (index == nums.length) return false;
        if(nums[index]==6) return true;

        return array6(nums, index+1);
    }
    public int array11(int[] nums, int index) {
        if(index >= nums.length ) return 0;
        int count = 0;
        if(nums[index]==11) count ++;
        return count + array11(nums, index+1);
    }
    public String stringClean(String str) {
        if(str.length()<2) return str;
        String res = str.charAt(0)+"";
        int temp = 0;
        for(int i=1; i < str.length(); i++){
            if(str.charAt(0) != str.charAt(i)){
                temp = i;
                break;
            }
        }

        if(temp == 0 ) return res;
        return res + stringClean(str.substring(temp));
    }


}

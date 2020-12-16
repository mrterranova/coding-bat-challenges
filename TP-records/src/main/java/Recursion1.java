public class Recursion1 {
    public static void main(String[] args) {

        // FACTORIAL
        //Given n of 1 or more, return the factorial of n, which is
        // n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
        System.out.println(factorial(1));//1
        System.out.println(factorial(2));//2
        System.out.println(factorial(3));//6

        //BUNNY EARS
        //We have a number of bunnies and each bunny has two big floppy ears.
        // We want to compute the total number of ears across all the bunnies
        // recursively (without loops or multiplication).
        System.out.println(bunnyEars(0));//0
        System.out.println(bunnyEars(1));//2
        System.out.println(bunnyEars(2));//4

        //FIBONACCI
        //The fibonacci sequence is a famous bit of mathematics, and it happens to
        // have a recursive definition. The first two values in the sequence are 0 and 1
        // (essentially 2 base cases). Each subsequent value is the sum of the previous
        // two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
        // Define a recursive fibonacci(n) method that returns the nth fibonacci number,
        // with n=0 representing the start of the sequence.
        System.out.println(fibonacci(0));//0
        System.out.println(fibonacci(1));//1
        System.out.println(fibonacci(2));//1

        //BUNNY EARS 2
        //We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
        // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..)
        // we'll say have 3 ears, because they each have a raised foot. Recursively
        // return the number of "ears" in the bunny line 1, 2, ... n (without loops or
        // multiplication).
        System.out.println(bunnyEars2(0));//0
        System.out.println(bunnyEars2(1));//2
        System.out.println(bunnyEars2(2));//5

        //TRIANGLE
        //We have triangle made of blocks. The topmost row has 1 block, the next row
        // down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively
        // (no loops or multiplication) the total number of blocks in such a triangle
        // with the given number of rows.
        System.out.println(triangle(0));//0
        System.out.println(triangle(1));//1
        System.out.println(triangle(2));//3

        //SUM DIGITS
        //Given a non-negative int n, return the sum of its digits recursively (no loops).
        // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
        // while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
        System.out.println(sumDigits(126));//9
        System.out.println(sumDigits(49));//13
        System.out.println(sumDigits(12));//3

        //COUNT 7
        //Given a non-negative int n, return the count of the occurrences of 7 as a
        // digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields
        // the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the
        // rightmost digit (126 / 10 is 12).
        System.out.println(count7(717));//2
        System.out.println(count7(7));//1
        System.out.println(count7(123));//0

        //COUNT 8
        //Given a non-negative int n, compute recursively (no loops) the count of
        // the occurrences of 8 as a digit, except that an 8 with another 8 immediately
        // to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields
        // the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the
        // rightmost digit (126 / 10 is 12).
        System.out.println(count8(8));//1
        System.out.println(count8(818));//2
        System.out.println(count8(8818));//4

        //POWER N
        //Given base and n that are both 1 or more, compute recursively
        // (no loops) the value of base to the n power, so powerN(3, 2) is 9
        // (3 squared).
        System.out.println(powerN(3, 1));//3
        System.out.println(powerN(3, 2));//9
        System.out.println(powerN(3, 3));//27

        //COUNT X
        //Given a string, compute recursively (no loops) the number of lowercase
        //'x' chars in the string.
        System.out.println(countX("xxhixx"));//4
        System.out.println(countX("xhixhix"));//3
        System.out.println(countX("hi"));//0

        //COUNT HI
        //Given a string, compute recursively (no loops) the number of times
        // lowercase "hi" appears in the string.
        System.out.println(countHi("xxhixx"));//1
        System.out.println("xhixhix");//2
        System.out.println("hi");//1

        //CHANGE XY
        //Given a string, compute recursively (no loops) a new string where
        // all the lowercase 'x' chars have been changed to 'y' chars.
        System.out.println(changeXY("codex"));//codey
        System.out.println(changeXY("xxhixx"));//yyhiyy
        System.out.println(changeXY("xhixhix"));//yhiyhiy

        //CHANGE PI
        //Given a string, compute recursively (no loops) a new string where all
        //appearances of "pi" have been replaced by "3.14".
        System.out.println(changePi("xpix"));//x3.14x
        System.out.println(changePi("pipi"));//3.143.14
        System.out.println(changePi("pip"));//3.14p

        //NO X
        //Given a string, compute recursively a new string where all the 'x'
        // chars have been removed.
        System.out.println(noX("xaxb"));//"ab"
        System.out.println(noX("abc"));//"abc"
        System.out.println(noX(""));// ""

        //ARRAY 6
        //Given an array of ints, compute recursively if the array contains a 6.
        // We'll use the convention of considering only the part of the array that
        // begins at the given index. In this way, a recursive call can pass index+1
        // to move down the array. The initial call will pass in index as 0.
        int[] arr = {1, 6, 4};
        int[] arr1 = {1, 4};
        int[] arr2 = {6};
        System.out.println(array6(arr, 0));//true
        System.out.println(array6(arr1, 0));//false
        System.out.println(array6(arr2, 0));//true

        //ARRAY 11
        //Given an array of ints, compute recursively the number of times that the
        // value 11 appears in the array. We'll use the convention of considering
        // only the part of the array that begins at the given index. In this way,
        // a recursive call can pass index+1 to move down the array. The initial call
        // will pass in index as 0.
        int[] arr3 = {1, 2, 11};
        int[] arr4 = {11, 11};
        int[] arr5 = {1, 2, 3, 4};
        System.out.println(array11(arr3, 0));//1
        System.out.println(array11(arr4, 0));//2
        System.out.println(array11(arr5, 0));//0

        //ARRAY 220
        //Given an array of ints, compute recursively if the array contains somewhere
        // a value followed in the array by that value times 10. We'll use the convention
        // of considering only the part of the array that begins at the given index. In
        // this way, a recursive call can pass index+1 to move down the array. The initial
        // call will pass in index as 0.
        int[] arr6 = {1, 2, 20};
        int[] arr7 = {3, 30};
        int[] arr8 = {3};
        System.out.println(array220(arr6, 0));//true
        System.out.println(array220(arr7, 0));//true
        System.out.println(array220(arr8, 0));//false

        //ALL STAR
        //Given a string, compute recursively a new string where all the adjacent chars
        // are now separated by a "*".
        System.out.println(allStar("hello"));//h*e*l*l*o
        System.out.println(allStar("abc"));//a*b*c
        System.out.println(allStar("ab"));//a*b

        //PAIR STAR
        //Given a string, compute recursively a new string where identical chars that
        // are adjacent in the original string are separated from each other by a "*".
        System.out.println(pairStar("hello"));//hel*lo
        System.out.println(pairStar("xxyy"));//x*xy*y
        System.out.println(pairStar("aaaa"));//a*a*a*a

        //END X
        //Given a string, compute recursively a new string where all the lowercase
        // 'x' chars have been moved to the end of the string.
        System.out.println(endX("xxre"));//rexx
        System.out.println(endX("xxhixx"));//hixxxx
        System.out.println(endX("xhixhix"));//hihixxx

        //COUNT PAIRS
        //We'll say that a "pair" in a string is two instances of a char separated
        // by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA"
        // contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number
        // of pairs in the given string.
        System.out.println(countPairs("axa"));//1
        System.out.println(countPairs("axax"));//2
        System.out.println(countPairs("axbx"));//1

        //COUNT ABC
        //Count recursively the total number of "abc" and "aba" substrings that appear
        // in the given string.
        System.out.println(countAbc("abc"));//1
        System.out.println(countAbc("abcxxabc"));//2
        System.out.println(countAbc("abaxxaba"));//2


        //COUNT 11
        //Given a string, compute recursively (no loops) the number of "11" substrings
        // in the string. The "11" substrings should not overlap.
        System.out.println(count11("11abc11"));//2
        System.out.println(count11("abc11x11x11"));//3
        System.out.println(count11("111"));//1

        //STRING CLEAN
        //Given a string, return recursively a "cleaned" string where adjacent chars
        // that are the same have been reduced to a single char. So "yyzzza" yields "yza".
        System.out.println(stringClean("yyzzza"));//yza
        System.out.println(stringClean("abbbcdd"));//abcd
        System.out.println(stringClean("Hello"));//Helo

        //COUNT HI 2
        //Given a string, compute recursively the number of times lowercase "hi"
        // appears in the string, however do not count "hi" that have an 'x' immediately
        // before them.
        System.out.println(countHi2("ahixhi"));//1
        System.out.println(countHi2("ahibhi"));//2
        System.out.println(countHi2("xhixhi"));//0

        //PARENBIT
        //Given a string that contains a single pair of parenthesis, compute
        // recursively a new string made of only of the parenthesis and their contents,
        // so "xyz(abc)123" yields "(abc)".
        System.out.println(parenBit("xyz(abc)123"));//(abc)
        System.out.println(parenBit("x(hello)"));//(hello)
        System.out.println(parenBit("(xy)1"));//(xy)

        //NESTPAREN
        //Given a string, return true if it is a nesting of zero or more pairs of
        //parenthesis, like "(())" or "((()))". Suggestion: check the first and last chars,
        //and then recur on what's inside them.
        System.out.println(nestParen("(())"));//true
        System.out.println(nestParen("((()))"));//true
        System.out.println(nestParen("(((x))"));//false

        //STR COUNT
        //Given a string and a non-empty substring sub, compute recursively the number
        //of times that sub appears in the string, without the sub strings overlapping.
        System.out.println(strCount("catcowcat", "cat"));//2
        System.out.println(strCount("catcowcat", "cow"));//1
        System.out.println(strCount("catcowcat", "dog"));//0

        //STR COPIES
        //Given a string and a non-empty substring sub, compute recursively if at least
        // n copies of sub appear in the string somewhere, possibly with overlapping. N
        // will be non-negative.
        System.out.println(strCopies("catcowcat", "cat", 2));//true
        System.out.println(strCopies("catcowcat", "cow", 2));//false
        System.out.println(strCopies("catcowcat", "cow", 1));//true

        //STR DIST
        //Given a string and a non-empty substring sub, compute recursively the largest
        // substring which starts and ends with sub and return its length.
        System.out.println(strDist("catcowcat", "cat"));//9
        System.out.println(strDist("catcowcat", "cow"));//3
        System.out.println(strDist("cccatcowcatxx", "cat"));//9

    }
    public static int factorial(int n) {
        int result = n;
        if (n == 1) return n;
        return n * factorial(n-1);
    }

    //BUNNY EARS
    public static int bunnyEars(int n) {
        if (n==0) return 0;
        return bunnyEars(n-1)+2;
    }

    //FIBONACCI
    public static int fibonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    //BUNNY EARS 2
    public static int bunnyEars2(int n) {
        if(n==0) return 0;
        if(n%2==0) return bunnyEars2(n-1)+3;
        else return bunnyEars2(n-1)+2;
    }

    //TRIANGLE
    public static int triangle(int rows) {
        if (rows == 0) return 0;
        if (rows == 1) return 1;

        return triangle(rows-1) + rows;
    }

    //SUM DIGITS
    public static int sumDigits(int n) {
        if(n<10) return n;
        return (n%10) + sumDigits(n/10);
    }

    //COUNT 7
    public static int count7(int n) {
        if(n < 10 && n ==7) return 1;
        if(n < 10 && n !=7) return 0;
        int count = 0;
        if(n%10==7) count++;
        return count + count7(n/10);

    }

    //COUNT 8
    public static int count8(int n) {
        if(n < 10 && n ==8) return 1;
        if(n < 10 && n !=8) return 0;
        int count = 0;
        if(n%100==88) count = count+2;
        else if(n%10==8) count++;
        return count + count8(n/10);
    }

    //POWER N
    public static int powerN(int base, int n) {
        if(n==0) return 1;
        return base*powerN(base, n-1);
    }

    //COUNT X
    public static int countX(String str) {
        if(str.length() == 0){
            return 0;
        }
        int count = 0;
        if(str.charAt(0)=='x') count++;
        return count + countX(str.substring(1, str.length()));
    }

    //COUNT PAIRS
    public static int countPairs(String str) {
        if(str.length() <= 2) return 0;
        int count = 0;
        if(str.charAt(0)==str.charAt(1) || str.charAt(0)==str.charAt(2)) count++;
        return count + countPairs(str.substring(1));
    }

    //COUNT HI
    public static int countHi(String str) {
        if(str.length() < 2) return 0;
        int count = 0;
        if(str.charAt(0)=='h' && str.charAt(1)=='i') count++;
        return count + countHi(str.substring(1, str.length()));
    }

    //CHANGE XY
    public static String changeXY(String str) {
        if(str.length() ==0) return str;
        String res = "";
        if(str.charAt(0)=='x') res += "y";
        else res += str.charAt(0);
        return  res += changeXY(str.substring(1, str.length()));
    }

    //CHANGE PI
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

    //NO X
    public static String noX(String str) {
        if(str.length()==0) return str;
        String res = "";
        if(str.charAt(0) == 'x') res += "";
        else res += str.charAt(0);
        return res += noX(str.substring(1, str.length()));
    }

    //ARRAY 6
    public static boolean array6(int[] nums, int index) {
        if (index == nums.length) return false;
        if(nums[index]==6) return true;

        return array6(nums, index+1);
    }

    //ARRAY 11
    public static int array11(int[] nums, int index) {
        if(index >= nums.length ) return 0;
        int count = 0;
        if(nums[index]==11) count ++;
        return count + array11(nums, index+1);
    }

    //STRING CLEAN
    public static String stringClean(String str) {
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

    //ARRAY  220
    public static boolean array220(int[] nums, int index) {
        if(index >= nums.length-1) return false;
        if(nums[index]*10 == nums[index+1]) return true;
        return array220(nums, index+1);
    }

    //ALL STAR
    public static String allStar(String str) {
        if(str.length() <=1) return str;
        String res = str.charAt(0)+"*";
        return res + allStar( str.substring(1));
    }

    //PAIR STAR
    public static String pairStar(String str) {
        if(str.length() <=1) return str;

        String res = str.charAt(0)+"";
        if(str.charAt(0) == str.charAt(1)){ res += "*";}
        return res + pairStar(str.substring(1));
    }

    //END X
    public static String endX(String str) {
        if(str.length()<=1) return str;
        char res = str.charAt(0);
        if(res == 'x') return endX(str.substring(1))+"x";
        return res + endX(str.substring(1));
    }

    //COUNT ABC
    public static int countAbc(String str) {
        if(str.length()<=2) return 0;
        String compareStr = str.substring(0, 3);
        int count = 0;
        if(compareStr.compareTo("abc")==0 || compareStr.compareTo("aba")==0) count++;
        return count + countAbc(str.substring(1));
    }

    //COUNT 11
    public static int count11(String str) {
        if(str.length() <= 1) return 0;
        int count = 0, index = 1;
        String check = str.substring(0, 2);
        if(check.compareTo("11")==0) {
            count++;
            index++;
        }
        return count + count11(str.substring(index));
    }

    //COUNT HI 2
    public static int countHi2(String str) {
        if(str.length()<2) return 0;

        int count = 0, index = 1;
        String sub = str.substring(0,2);

        if(str.charAt(0)=='x'){
            for(int i=1; i < str.length(); i++){
                if(str.charAt(i) == 'x'){
                    index++;
                } else{
                    break;
                }
            }
            index++;
        } else {
            if(sub.equals("hi")){
                count++;
            }
        }
        if (index >= str.length()) return count;
        return count + countHi2(str.substring(index));
    }

    //PARENBIT
    public static String parenBit(String str) {
        if(str.equals("")) return str;
        if(str.charAt(0)=='('){
            if(str.charAt(str.length()-1)==')') return str;
            else return parenBit(str.substring(0, str.length()-1));
        } else return parenBit(str.substring(1));
    }

    //NEST PAREN
    public static boolean nestParen(String str) {
        if (str.equals("")) return true;
        int end = str.length();
        if (str.charAt(0) == '(' && str.charAt(end-1) == ')')
            return nestParen(str.substring(1,end-1));
        else
            return false;
    }

    //STR COUNT
    public static int strCount(String str, String sub) {
        if(str.length()<sub.length()) return 0;

        String temp = str.substring(0, sub.length());
        int count = 0;

        if(temp.equals(sub)){
            count++;
            return count + strCount(str.substring(sub.length()), sub);
        }
        else return strCount(str.substring(1), sub);

    }

    //STR COPIES
    public static boolean strCopies(String str, String sub, int n) {
        if(str.length() < sub.length() && n != 0) return false;
        if(n==0) return true;
        String temp = str.substring(0, sub.length());
        if(temp.equals(sub)) return strCopies(str.substring(1), sub, n-1);
        return strCopies(str.substring(1), sub, n);
    }

    //STR DIST
    public static int strDist(String str, String sub) {
        if(str.length() < sub.length()) return 0;
        if(str.equals(sub)) return sub.length();
        if(str.substring(0, sub.length()).equals(sub)
                && str.substring(str.length()-sub.length()).equals(sub))
            return str.length();
        else if (str.substring(0, sub.length()).equals(sub))
            return strDist(str.substring(0, str.length()-1), sub);
        else
            return strDist(str.substring(1), sub);
    }


}

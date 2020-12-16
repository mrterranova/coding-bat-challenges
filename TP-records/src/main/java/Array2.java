import java.util.ArrayList;
import java.util.List;

public class Array2 {
    public static void main(String[] args) {

        //COUNT EVENS
        //Return the number of even ints in the given array. Note: the % "mod" operator
        // computes the remainder, e.g. 5 % 2 is 1.
        int[] a1 = {1, 3, 5};
        int[] a2 = {2, 2, 0};
        int[] a3 = {1, 3, 5};
        System.out.println(countEvens(a1));//3
        System.out.println(countEvens(a2));//3
        System.out.println(countEvens(a3));//0


        //BIG DIFF
        //Given an array length 1 or more of ints, return the difference between the largest
        //and smallest values in the array. Note: the built-in Math.min(v1, v2) and
        //Math.max(v1, v2) methods return the smaller or larger of two values.
        int[] b1 = {10, 3, 5, 6};
        int[] b2 = {7, 2, 10, 9};
        int[] b3 = {2, 10, 7, 2};
        System.out.println(bigDiff(b1));//7
        System.out.println(bigDiff(b2));//8
        System.out.println(bigDiff(b3));//8

        //CENTERED AVERAGE
        //Return the "centered" average of an array of ints, which we'll say is the mean
        //average of the values, except ignoring the largest and smallest values in the array.
        // If there are multiple copies of the smallest value, ignore just one copy, and
        // likewise for the largest value. Use int division to produce the final average.
        // You may assume that the array is length 3 or more.
        int[] c1 = {1, 2, 3, 4, 100};
        int[] c2 = {1, 1, 5, 5, 10, 8, 7};
        int[] c3 = {-10, -4, -2, -4, -2, 0};
        System.out.println(centeredAverage(c1));//3
        System.out.println(centeredAverage(c2));//5
        System.out.println(centeredAverage(c3));//-3

        //SUM 13
        //Return the sum of the numbers in the array, returning 0 for an empty array.
        // Except the number 13 is very unlucky, so it does not count and numbers that come
        // immediately after a 13 also do not count.
        int[] d1 = {1, 2, 2, 1};
        int[] d2 = {1, 1};
        int[] d3 = {1, 2, 2, 1, 13};
        System.out.println(sum13(d1));//6
        System.out.println(sum13(d2));//2
        System.out.println(sum13(d3));//6

        //SUM 67
        //Return the sum of the numbers in the array, except ignore sections of numbers
        // starting with a 6 and extending to the next 7 (every 6 will be followed by at
        // least one 7). Return 0 for no numbers.
        int[] e1 = {1, 2, 2};
        int[] e2 = {1, 2, 2, 6, 99, 99, 7};
        int[] e3 ={1, 1, 6, 7, 2};
        System.out.println(sum67(e1));//5
        System.out.println(sum67(e2));//5
        System.out.println(sum67(e3));//5

        //HAS 22
        //Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
        int[] f1 = {1, 2, 2};
        int[] f2 = {1, 2, 1, 2};
        int[] f3 = {2, 1, 2};
        System.out.println(has22(f1));//true
        System.out.println(has22(f2));//false
        System.out.println(has22(f3));//false

        //LUCKY 13
        //Given an array of ints, return true if the array contains no 1's and no 3's.
        int[] g1 = {0, 2, 4};
        int[] g2 = {1, 2, 3};
        int[] g3 = {1, 2, 4};
        System.out.println(lucky13(g1));//
        System.out.println(lucky13(g2));//
        System.out.println(lucky13(g3));//

        //SUM 28
        //Given an array of ints, return true if the sum of all the 2's in the array
        // is exactly 8.
        int[] h1 = {2, 3, 2, 2, 4, 2};
        int[] h2 = {2, 3, 2, 2, 4, 2, 2};
        int[] h3 = {1, 2, 3, 4};
        System.out.println(sum28(h1));
        System.out.println(sum28(h2));
        System.out.println(sum28(h3));

        //MORE 14
        //Given an array of ints, return true if the number of 1's is greater than the number
        // of 4's
        int[] i1 = {1, 4, 1};
        int[] i2 = {1,4,1,4};
        int[] i3 = {1,1};
        System.out.println(more14(i1));
        System.out.println(more14(i2));
        System.out.println(more14(i3));

        //FIZZ ARRAY
        //Given a number n, create and return a new int array of length n, containing the
        // numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return a length
        // 0 array. You do not need a separate if-statement for the length-0 case; the for-loop
        // should naturally execute 0 times in that case, so it just works. The syntax to make a
        // new int array is: new int[desired_length]   (See also: FizzBuzz Code)
        System.out.println(fizzArray(4));
        System.out.println(fizzArray(0));
        System.out.println(fizzArray(10));

        //ONLY 14
        //Given an array of ints, return true if every element is a 1 or a 4.


        //FIZZ ARRAY 2
        //Given a number n, create and return a new string array of length n, containing the
        //strings "0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0
        //array. Note: String.valueOf(xxx) will make the String form of most types. The syntax
        //to make a new string array is: new String[desired_length]  (See also: FizzBuzz Code)
        System.out.println(fizzArray2(4));
        System.out.println(fizzArray2(10));
        System.out.println(fizzArray2(2));

        //NO 14
        //Given an array of ints, return true if it contains no 1's or it contains no 4's.


        //EITHER 24
        int[] j1 = {1,2,2}; //true
        int[] j2 = {4,4,1}; //true
        int[] j3 = {4,4,1,2,2};//false
        System.out.println(either24(j1));
        System.out.println(either24(j2));
        System.out.println(either24(j3));

        //FIZZ ARRAY 3
        int[] k1 = fizzArray3(5,10); //5,6,7,8,9
        int[] k2 = fizzArray3(11,18); //11,12,13,14,15,16,17
        int[] k3 = fizzArray3(1,3); //1,2

        for(int i =0; i < k1.length; i++){
            System.out.println(k1[i]);
        }
        for(int i =0; i < k2.length; i++){
            System.out.println(k2[i]);
        }
        for(int i =0; i < k3.length; i++){
            System.out.println(k3[i]);
        }

        //PRE 4
        int[]l1 = {1, 2, 4, 1};//1,2
        int[]l2 = {3, 1, 4};//3,1
        int[]l3 = {1,4,4};//1
        int[]l1a = pre4(l1);
        int[]l2a = pre4(l2);
        int[]l3a = pre4(l3);
        for(int i =0; i < l1a.length; i++){
            System.out.println(l1a[i]);
        }
        for(int i =0; i < l2a.length; i++){
            System.out.println(l2a[i]);
        }
        for(int i =0; i < l3a.length; i++){
            System.out.println(l3a[i]);
        }

        //POST 4
        int[]m1 = {2,4,1,2};
        int[]m2 = {4,1,4,2};
        int[]m3 = {4,4,1,2,3};

        //WITHOUT TEN
        //Return a version of the given array where all the 10's have been removed.
        // The remaining elements should shift left towards the start of the array as needed,
        // and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2}
        // yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.

        //EVEN ODD
        //Return an array that contains the exact same numbers as the given array,
        // but rearranged so that all the even numbers come before all the odd numbers.
        // Other than that, the numbers can be in any order. You may modify and return
        // the given array, or make a new array.

        //FIZZ BUZZ
        //This is slightly more difficult version of the famous FizzBuzz problem
        // which is sometimes given as a first problem for job interviews. (See also:
        // FizzBuzz Code.) Consider the series of numbers beginning at start and
        // running up to but not including end, so for example start=1 and end=5
        // gives the series 1, 2, 3, 4. Return a new String[] array containing the string
        // form of these numbers, except for multiples of 3, use "Fizz" instead of the
        // number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use
        // "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of an int
        // or other type. This version is a little more complicated than the usual
        // version since you have to allocate and index into an array instead of just
        // printing, and we vary the start/end instead of just always doing 1..100.

    }

    //COUNT EVENS
    static int countEvens(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 0){
                count++;
            }
        }
        return count;
    }

    //BIG DIFF
    static int bigDiff(int[] nums) {
        int biggest = 0, smallest= nums[0], res = 0;
        for(int i=0; i < nums.length; i++){
            biggest = Math.max(biggest, nums[i]);
            smallest = Math.min(smallest, nums[i]);

            if(biggest - smallest > res) res = biggest - smallest;
        }
        return res;
    }

    //CENTERED AVERAGE
    static int centeredAverage(int[] nums) {
        int largest = nums[0], smallest = nums[0], ave = 0;
        for(int i = 0; i < nums.length; i++){
            largest = Math.max(largest, nums[i]);
            smallest = Math.min(smallest, nums[i]);
        }
        int lcount = 0, scount = 0;
        for (int j=0; j<nums.length; j++){
            if(nums[j] == largest && lcount <1 ) lcount++;
            else if(nums[j] == smallest && scount < 1 ) scount++;
            else ave += nums[j];
        }
        return ave/(nums.length-2);
    }

    //SUM 13
    public static int sum13(int[] nums) {
        int res = 0;
        for(int i =0; i < nums.length; i++){
            if(nums[i] ==13){
                i++;
            } else {
                res +=nums[i];
            }
        }
        return res;
    }

    //SUM 67
    static int sum67(int[] nums) {
        if (nums.length ==0) return 0;
        int res = 0, total = 0;
        for(int i = 0; i < nums.length; i++){
            res += nums[i];
            //if nums is 6 skip over everything until nums is 7 and then continue adding...
            if(nums[i] == 6) {
                for(int j =i; nums[j] != 7; j++){
                    nums[j] = 0;
                    res = j;
                }
                nums[res+1] = 0;
            } else total += nums[i];
        }
        return total;
    }

    //HAS 22
    static boolean has22(int[] nums) {
        for(int i=0; i < nums.length-1; i++){
            if(nums[i] == 2 && nums[i+1]==2){
                return true;
            }
        }
        return false;
    }

    //LUCKY 13
    static boolean lucky13(int[] nums) {
        for(int i =0; i < nums.length; i++){
            if(nums[i] == 1 || nums[i] == 3) return false;
        }
        return true;
    }

    //SUM 28
    static boolean sum28(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 2) count +=2;
        }
        if(count == 8) return true;
        return false;
    }

    //MORE 14
    static boolean more14(int[] nums) {
        int ones = 0, fours = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 1) ones++;
            if (nums[i] == 4) fours++;
        }
        if(ones > fours) return true;
        return false;
    }

    //FIZZ ARRAY
    static int[] fizzArray(int n) {
        int[] fizz = new int[n];
        for(int i=0; i < n; i ++){
            fizz[i] = i;
        }
        return fizz;
    }

    //ONLY 14
    public boolean only14(int[] nums) {
        boolean num = true;
        for(int i= 0; i < nums.length; i++){
            if(nums[i] ==1 || nums[i]==4 ) num = true;
            else {num = false; break;}
        }
        return num;
    }

    //FIZZ ARRAY 2
    static String[] fizzArray2(int n) {
        String[] fizz = new String[n];
        for(int i = 0; i < n; i++){
            fizz[i] = i +"";
        }
        return fizz;
    }

    //NO 14
    public boolean no14(int[] nums) {
        boolean ones = false, fours = false;
        for(int i =0; i < nums.length; i++){
            if(nums[i]== 1) ones = true;
            if(nums[i] ==4) fours = true;
        }
        if(ones && fours) return false;
        else return true;
    }

    //EITHER 24
    public static boolean either24(int[] nums) {
        boolean twos = false, fours = false;
        for(int i=0; i < nums.length-1; i++){
            if(nums[i]== 2 && nums[i+1] ==2){
                twos = true;
            } else if (nums[i]==4 && nums[i+1]==4){
                fours = true;
            }
        }
        if(twos == true && fours == false) return true;
        else if(fours == true && twos == false) return true;
        else if(fours == true && twos == true) return false;
        else return false;
    }

    //FIZZ ARRAY 3
    public static int[] fizzArray3(int start, int end) {
        List<Integer> resList = new ArrayList<Integer>();
        for(int i=start; i <end; i++){
            resList.add(i);
        }
        int[] res = new int[resList.size()];
        for(int j=0; j < resList.size(); j++){
            res[j] = resList.get(j);
        }
        return res;
    }

    //PRE 4
    public static int[] pre4(int[] nums) {
        List<Integer> resList = new ArrayList<Integer>();
        for(int i=0; i < nums.length; i++){
            if(nums[i]==4) break;
            resList.add(nums[i]);
        }
        int[] res = new int[resList.size()];
        for (int i =0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }

    // POST 4
    public static int[] post4(int[] nums) {
        List<Integer> resList = new ArrayList<Integer>();
        for(int i=0; i< nums.length; i++){
            if(nums[i]==4) {
                resList.clear();
                for(int j=i+1; j < nums.length; j++ ){
                    resList.add(nums[j]);
                }
            }
        }
        int[] res = new int[resList.size()];
        int count = 0;
        for(int k =0; k< resList.size(); k++){
            res[count] = resList.get(k);
            count++;
        }
        return res;
    }

    //MATCH UP
    public int matchUp(int[] nums1, int[] nums2) {
        int count =0;
        for(int i=0; i< nums1.length; i++){
            int match = Math.abs(nums1[i]-nums2[i]);
            if(match <= 2 && match !=0) count++;
        }
        return count;
    }

    //HAS 77
    public static boolean has77(int[] nums) {
        for(int i=1; i<nums.length-1; i++){
            if((nums[i]==7 && nums[i-1]==7) ||
                    (nums[i-1]==7 && nums[i+1]==7) ||
                    (nums[i]==7 && nums[i+1]==7)){
                return true;
            }
        }
        return false;
    }

    //SAME ENDS
    public static boolean sameEnds(int[] nums, int len) {
        if(nums.length ==0 && len==0) return true;
        if(len == 0 && nums[0] == nums[nums.length-1]) return true;
        if (nums[len-1] == nums[nums.length-1]) return true;
        return false;
    }

    //HAS 12
    public static boolean has12(int[] nums) {
        int one = -1, two = -1;
        for(int i=0; i< nums.length; i++){
            if(nums[i]==1) one = i;
            if(nums[i]==2) two = i;
        }
        if(one != -1 && one < two ) return true;
        else return false;
    }

    //TRIPLE UP
    public static boolean tripleUp(int[] nums) {
        boolean triple = false;
        for(int i=1; i< nums.length-1; i++){
            if(nums[i]-nums[i-1]==1 && nums[i+1]-nums[i]==1 ) {
                triple = true;
                break;
            }
        }
        return triple;
    }

    //WITHOUT TEN
    public static int[] withoutTen(int[] nums) {
        int start = 0, end = nums.length-1;
        int[] res = new int[end+1];
        for(int i=0; i<nums.length; i++){
            if(nums[i]==10){
                res[end]=0;
                end--;
            } else {
                res[start]=nums[i];
                start++;
            }
        }
        return res;
    }


    //EVEN ODD
    public static int[] evenOdd(int[] nums) {
        int[] res = new int[nums.length];
        int start = 0;
        int end = nums.length-1;
        for(int i=0; i< nums.length; i++){
            if(nums[i]%2==0){
                res[start]=nums[i];
                start++;
            } else {
                res[end] = nums[i];
                end--;
            }
        }
        return res;
    }

    //FIZZ BUZZ
    public static String[] fizzBuzz(int start, int end) {
        int num = end-start, count = 0;
        String[] fizzBuzz = new String[num];
        for(int i =start; i < end; i++){
            if(i%3 == 0 && i%5 == 0 ) fizzBuzz[count] = "FizzBuzz";
            else if(i%3 == 0) fizzBuzz[count] = "Fizz";
            else if(i%5 == 0) fizzBuzz[count] = "Buzz";
            else fizzBuzz[count] = i+"";
            count++;
        }
        return fizzBuzz;
    }
}

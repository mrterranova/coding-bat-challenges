package codingBatChallenges;

public class Array1 {
    public static void main(String[] args) {
        //FIRST LAST 6
        //Given an array of ints, return true if 6 appears as either the first or last element in
        // the array. The array will be length 1 or more.

        //SAME FIRST LAST
        //Given an array of ints, return true if the array is length 1 or more, and the first
        // element and the last element are equal.

        //MAKE PI
        //Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

        //COMMON END
        //Given 2 arrays of ints, a and b, return true if they have the same first element or they
        // have the same last element. Both arrays will be length 1 or more.

        //SUM 3
        //Given an array of ints length 3, return the sum of all the elements.

        //ROTATE LEFT
        //Given an array of ints length 3, return an array with the elements "rotated left" so
        // {1, 2, 3} yields {2, 3, 1}.

        //REVERSE 3
        //Given an array of ints length 3, return a new array with the elements in reverse order,
        // so {1, 2, 3} becomes {3, 2, 1}.

        //MAX END 3
        //Given an array of ints length 3, figure out which is larger, the first or last element
        //in the array, and set all the other elements to be that value. Return the changed
        //array.

        //SUM 2
        //Given an array of ints, return the sum of the first 2 elements in the array. If the array
        //length is less than 2, just sum up the elements that exist, returning 0 if the array is
        //length 0.

        //MIDDLE WAY
        //Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their
        // middle elements.

        //MAKE ENDS
        //Given an array of ints, return a new array length 2 containing the first and last elements
        // from the original array. The original array will be length 1 or more.

        //HAS 23
        //Given an int array length 2, return true if it contains a 2 or a 3.

        //NO 23
        //Given an int array length 2, return true if it does not contain a 2 or 3.

        //MAKE LAST
        //Given an int array, return a new array with double the length where its last element is the
        // same as the original array, and all the other elements are 0. The original array will be
        // length 1 or more. Note: by default, a new int array contains all 0's.

        //DOUBLE 23
        //Given an int array, return true if the array contains 2 twice, or 3 twice. The array will
        // be length 0, 1, or 2.

        //FIX 23
        //Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set
        //the 3 element to 0. Return the changed array.

        //START 1
        //Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their
        //first element.

        //BIGGER TWO
        //Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
        //Return the array which has the largest sum. In event of a tie, return a.

        //MAKE MIDDLE
        //Given an array of ints of even length, return a new array length 2 containing the middle
        //two elements from the original array. The original array will be length 2 or more.

        //PLUS TWO
        //Given 2 int arrays, each length 2, return a new array length 4 containing all their
        //elements.

        //SWAP ENDS
        //Given an array of ints, swap the first and last elements in the array. Return the
        //modified array. The array length will be at least 1.

        //MID THREE
        //Given an array of ints of odd length, return a new array length 3 containing the
        //elements from the middle of the array. The array length will be at least 3.

        //MAX TRIPLE
        //Given an array of ints of odd length, look at the first, last, and middle values in
        //the array and return the largest. The array length will be a least 1.

        //FRONT PIECE
        //Given an int array of any length, return a new array of its first 2 elements.
        //If the array is smaller than length 2, use whatever elements are present.

        //UNLUCKY 1
        //We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return
        //true if the given array contains an unlucky 1 in the first 2 or last 2 positions
        //in the array.

        //MAKE 2
        //Given 2 int arrays, a and b, return a new array length 2 containing, as much as will
        //fit, the elements from a followed by the elements from b. The arrays may be any length,
        //including 0, but there will be 2 or more elements available between the 2 arrays.

        //FRONT 11
        //Given 2 int arrays, a and b, of any length, return a new array with the first element
        //of each array. If either array is length 0, ignore that array.

    }
    //FIRST LAST 6
    public boolean firstLast6(int[] nums) {
        boolean res = false;
        if( nums[0] == 6 || nums[nums.length-1] == 6) res = true;
        return res;
    }

    //SAME FIRST LAST
    public boolean sameFirstLast(int[] nums) {
        boolean res = false;
        if(nums.length == 0) return false;
        if(nums[0]==nums[nums.length-1]) res = true;
        return res;
    }

    //MAKE PI
    public int[] makePi() {
        int[] pi = {3, 1, 4};
        return pi;
    }

    //COMMON END
    public boolean commonEnd(int[] a, int[] b) {
        boolean res = false;
        if(a[0] == b[0] || a[a.length-1] == b[b.length-1]) res = true;
        return res;
    }

    //SUM 3
    public int sum3(int[] nums) {
        int res = 0;
        for(int i =0; i < nums.length; i++){
            res += nums[i];
        }
        return res;
    }

    //ROTATE LEFT
    public int[] rotateLeft3(int[] nums) {
        int firstInt = nums[0];
        for(int i = 0; i < nums.length-1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = firstInt;
        return nums;
    }

    //REVERSE 3
    public int[] reverse3(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;
        return nums;
    }

    //MAX END 3
    public int[] maxEnd3(int[] nums) {
        int max = (nums[0] > nums[nums.length-1]) ? nums[0] : nums[nums.length-1];
        for(int i = 0; i < nums.length; i++){
            nums[i] = max;
        }
        return nums;
    }

    //SUM 2
    public int sum2(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length < 2) return nums[0];
        else return nums[0]+nums[1];
    }

    //MIDDLE WAY
    public int[] middleWay(int[] a, int[] b) {
        int[] mid = new int[2];
        mid[0]= a[1];
        mid[1]=b[1];
        return mid;
    }

    //MAKE ENDS
    public int[] makeEnds(int[] nums) {
        int[] end = new int[2];
        int count = 0;
        for(int i=0; i< nums.length; i++){
            if(i == 0 || i == nums.length-1){
                end[count]=nums[i];
                count++;
            }
            if(nums.length ==1){
                end[count]=nums[0];
            }
        }
        return end;
    }

    //HAS 23
    public boolean has23(int[] nums) {
        for(int i=0; i< nums.length; i++){
            if(nums[i] == 2 || nums[i] == 3) return true;
        }
        return false;
    }

    //NO 23
    public boolean no23(int[] nums) {
        for(int i=0; i< nums.length; i++){
            if(nums[i] == 2 || nums[i] == 3) return false;
        }
        return true;
    }

    //MAKE LAST
    public int[] makeLast(int[] nums) {
        int[] last = new int[nums.length*2];
        for(int i=0; i<last.length; i++){
            if(i != last.length-1)
                last[i] = 0;
            else last[i] = nums[nums.length-1];
        }
        return last;
    }

    //DOUBLE 23
    public boolean double23(int[] nums) {
        for(int i=0; i< nums.length-1; i++){
            if((nums[i]==2 && nums[i+1]==2)|| (nums[i]==3 && nums[i+1]==3))return true;

        }
        return false;
    }

    //FIX 23
    public int[] fix23(int[] nums) {
        for(int i=0; i< nums.length-1; i++){
            if(nums[i]==2 && nums[i+1]==3 ){
                nums[i+1] = 0;
            }
        }
        return nums;
    }

    //START 1
    public int start1(int[] a, int[] b) {
        int count =0, i =0;
        do{
            if(a.length != 0 && a[0]==1) count++;
            if(b.length !=0 && b[0]==1) count++;
            i++;
        } while(i < 1);
        return count;
    }

    //BIGGER TWO
    public int[] biggerTwo(int[] a, int[] b) {
        int sum1=0, sum2=0;
        for(int i=0; i<2; i++){
            sum1 +=a[i];
            sum2 +=b[i];
        }
        if(sum1>=sum2) return a;
        return b;
    }

    //MAKE MIDDLE
    public int[] makeMiddle(int[] nums) {
        if(nums.length<3) return nums;

        int[] middle = new int[2];
        for(int i=0; i< nums.length; i++){
            if(nums.length%2==0 && i == nums.length/2){
                middle[0] = nums[i-1];
                middle[1] = nums[i];
            }
            if(nums.length%2==1 && i == Math.floor(nums.length/2)){
                middle[0] = nums[i];
                middle[1] = nums[i+1];
            }
        }
        return middle;
    }

    //PLUS TWO
    public int[] plusTwo(int[] a, int[] b) {
        int[] res = new int[4];
        int count = 0;
        for(int i=0; i<res.length; i++){
            if(i<2){
                res[i] = a[count];
                count++;
                if(count==2)count=0;
            } else {
                res[i] = b[count];
                count++;
            }
        }
        return res;
    }

    //SWAP ENDS
    public int[] swapEnds(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int temp = nums[0];
            if(i == nums.length-1){
                nums[0] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }

    //MID THREE
    public int[] midThree(int[] nums) {
        int[] res = new int[3];
        if(nums.length< 4) return nums;
        for(int i=0; i< nums.length; i++){
            if(i == nums.length/2){
                res[0] = nums[i-1];
                res[1] = nums[i];
                res[2] = nums[i+1];
            }
        }
        return res;
    }

    //MAX TRIPLE
    public int maxTriple(int[] nums) {
        if(nums.length==1)return nums[0];
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            if((i== (nums.length-1)/2 || i == nums.length-1) && max < nums[i]){
                max = nums[i];

            }
        }
        return max;
    }

    //FRONT PIECE
    public int[] frontPiece(int[] nums) {
        if(nums.length==0 || nums.length==1) return nums;
        int[] res = new int[2];
        for(int i=0; i< 2; i++){
            res[i] = nums[i];
        }
        return res;
    }

    //UNLUCKY 1
    public boolean unlucky1(int[] nums) {
        for(int i=0; i< nums.length-1; i++){
            if(i<2 || i > nums.length-3){
                if(nums[i]==1 && nums[i+1]==3)
                    return true;
            }
        }
        return false;
    }

    //MAKE 2
    public int[] make2(int[] a, int[] b) {
        int[] c = new int[2];
        int count = 0;
        for(int i=0; i<2; i++){
            if(a.length==0){
                c[count] = b[i];
                count++;
            }
            if(a.length>1){
                c[count] = a[i];
                count++;
            }
            if(a.length==1){
                c[count] = a[0];
                c[count+1] = b[0];
                break;
            }
        }
        return c;
    }

    //FRONT 11
    public int[] front11(int[] a, int[] b) {
        if(a.length==0&& b.length==0) return a;
        if(a.length==0||b.length==0){
            int[] res=new int[1];
            if(a.length==0){
                res[0] = b[0]; return res;
            } else{
                res[0] = a[0]; return res;
            }
        }
        int[] res= new int[2];
        for(int i=0; i< 1; i++){
            res[0] = a[i];
            res[1] = b[i];
        }
        return res;
    }
}

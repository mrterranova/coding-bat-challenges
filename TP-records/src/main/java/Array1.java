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

}

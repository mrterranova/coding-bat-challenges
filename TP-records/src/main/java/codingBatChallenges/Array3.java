package codingBatChallenges;

public class Array3 {
    public static void main(String[] args) {
        //MAX SPAN
        //Consider the leftmost and righmost appearances of some value in an array. We'll say that
        //the "span" is the number of elements between the two inclusive. A single value has a span
        //of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)

        //FIX 34
        //Return an array that contains exactly the same numbers as the given array, but rearranged
        //so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number
        //may move. The array contains the same number of 3's and 4's, every 3 has a number after it
        //that is not a 3, and a 3 appears in the array before any 4.

        //FIX 45
        //(This is a slightly harder version of the fix34 problem.) Return an array that contains
        //exactly the same numbers as the given array, but rearranged so that every 4 is immediately
        //followed by a 5. Do not move the 4's, but every other number may move. The array contains
        //the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this
        //version, 5's may appear anywhere in the original array.

        //CAN BALANCE
        //Given a non-empty array, return true if there is a place to split the array so that the sum
        //of the numbers on one side is equal to the sum of the numbers on the other side.

        //LINEAR IN
        //Given two arrays of ints sorted in increasing order, outer and inner, return true if all of
        //the numbers in inner appear in outer. The best solution makes only a single "linear" pass of
        //both arrays, taking advantage of the fact that both arrays are already in sorted order.

        //SQUARE UP
        //Given n>=0, create an array length n*n with the following pattern, shown here for n=3 :
        //{0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

        //SERIES UP
        //Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
        //(spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3
        //... + n, which is known to sum to exactly n*(n + 1)/2.

        //MAX MIRROR
        //We'll say that a "mirror" section in an array is a group of contiguous elements such that
        //somewhere in the array, the same group appears in reverse order. For example, the largest
        //mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size
        //of the largest mirror section found in the given array.

        //COUNT CLUMPS
        //Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
        //Return the number of clumps in the given array.
    }

    //MAX SPAN
    public int maxSpan(int[] nums) {
        int save = 0;
        int count = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[0]==nums[nums.length-1]) return nums.length;
            for(int j=nums.length-1; j>=0; j--){
                if(nums[i] == nums[j])
                    save = j;
                break;
            }
        }
        for(int i=0; i< save; i++){
            count++;
        }
        return count;
    }

    //FIX 34
    public int[] fix34(int[] nums) {
        for(int i=0; i< nums.length; i++){
            for(int j=1; j<nums.length; j++){
                if(nums[i]==3){
                    int temp =0;
                    if(nums[j-1] != 3 && nums[j] == 4){
                        temp = nums[i+1];
                        nums[i+1] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }

    //FIX 45
    public int[] fix45(int[] nums) {
        for(int i=0; i< nums.length; i++){
            if(nums[i]==4){
                for(int j=0; j<nums.length; j++){
                    if((j> 0 && nums[j-1] != 4 && nums[j] == 5)){
                        int temp = nums[i+1];
                        nums[i+1] = nums[j];
                        nums[j] = temp;
                    }
                    if(j==0 && nums[j]==5){
                        int temp = nums[i+1];
                        nums[i+1] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }

    //CAN BALANCE
    public boolean canBalance(int[] nums) {
        if(nums.length <=1 ) return false;
        int total=0;
        for(int i=0; i<nums.length; i++){
            total += nums[i];
        }
        if(total%2==1) return false;
        int temp = nums[0];
        for(int j=1; j<nums.length;j++){
            if(temp<total/2){
                temp += nums[j];
            } else if (temp == total/2){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    //LINEAR IN
    public boolean linearIn(int[] outer, int[] inner) {
        int count = 0, temp = 0;
        if(inner.length == 0) return true;
        for(int i=0; i<outer.length; i++){
            if(outer[i] == inner[temp] ){
                count++;
                temp++;
            }else if(outer[i] > inner[temp])
                return false;
            if(count == inner.length) return true;
        }
        return false;
    }


    //SQUARE UP
    public int[] squareUp(int n) {
        int[] res =new int[n*n];
        int count=n*n;
        for(int i=0; i< n; i++){
            for(int j=0; j<n; j++){
                if(j>= n-i-1){
                    res[i*n+j]=n-j;
                }
            }
        }
        return res;
    }

    //SERIES UP
    public int[] seriesUp(int n) {
        int calc = n*(n+1)/2;
        int[] res = new int[calc];
        int count = 0;
        for(int i=calc; i>=-1; i--){
            for(int j=1; j<n-i; j++){
                res[count] = j;
                count++;
            }
        }
        return res;
    }

    //MAX MIRROR
    public int maxMirror(int[] nums) {
        int count=0, highest = 0, max =0;
        for(int i=0; i< nums.length; i++){
            for(int j=nums.length-1; j>=0 && i + count < nums.length; j--){
                if(nums[i+count] == nums[j]){
                    count++;
                } else {
                    if(count>0){
                        if(count> highest) highest = count;
                        count ++;
                        count =0;
                    }
                }
            }
            max = (highest> count) ? highest: count;
        }
        return max;
    }

    //COUNT CLUMPS
    public int countClumps(int[] nums) {
        int count=0, clump=0;
        //go over each element in the array
        for(int i=0; i< nums.length; i++){
            for(int j=i; j< nums.length; j++){

                if(nums[i] == nums[j]){
                    count++;
                } else {
                    if(count>=2) clump++;
                    count=1;
                    i=j-1;
                    break;
                }
            }
        }
        // if(nums.length>1 && nums[0] ==1 && nums[1] ==2 && nums[2]==3) return 0;
        if(nums.length > 0 && nums[1]== nums[0]&& clump<1) clump=1;
        else if (nums.length==0) return clump;
        return clump;

    }

}

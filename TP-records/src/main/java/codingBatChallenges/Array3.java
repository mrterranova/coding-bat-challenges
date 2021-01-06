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

    //COUNT CLUMPS

}

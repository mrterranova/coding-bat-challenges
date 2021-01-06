package codingBatChallenges;

public class Recursion2 {
        //GROUP SUM
        //Given an array of ints, is it possible to choose a group of some of the ints, such that the group
        //sums to the given target? This is a classic backtracking recursion problem. Once you understand
        //the recursive backtracking strategy in this problem, you can use the same pattern for many
        //problems to search a space of choices. Rather than looking at the whole array, our convention
        //is to consider the part of the array starting at index start and continuing to the end of the array.
        //The caller can specify the whole array simply by passing start as 0. No loops are needed -- the
        //recursive calls progress down the array.

        //GROUP SUM 6
        //Given an array of ints, is it possible to choose a group of some of the ints, beginning at the start
        //index, such that the group sums to the given target? However, with the additional constraint that all
        //6's must be chosen. (No loops needed.)

        //GROUP NO ADJ
        //Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums
        //to the given target with this additional constraint: If a value in the array is chosen to be in the
        //group, the value immediately following it in the array must not be chosen. (No loops needed.)


    //GROUP SUM
    public boolean groupSum(int start, int[] nums, int target) {
        if(start >= nums.length){
            return target == 0;
        }
        if(groupSum(start+1, nums, target-nums[start])) return true;
        if(groupSum(start+1, nums, target)) return true;
        return false;
    }

    //GROUP SUM 6
    public boolean groupSum6(int start, int[] nums, int target) {
        if(start >= nums.length){
            return target == 0;
        }
        if(nums[start] == 6){
            return groupSum6(start+1, nums, target-nums[start]);
        }
        if(groupSum6(start+1, nums, target-nums[start])) return true;
        if(groupSum6(start+1, nums, target)) return true;
        return false;
    }

    //GROUP NO ADJ
    public boolean groupNoAdj(int start, int[] nums, int target) {
        if(start >= nums.length){
            return target == 0;
        }
        if(groupNoAdj(start+2, nums, target-nums[start])) return true;
        if(groupNoAdj(start+1, nums, target)) return true;
        return false;
    }

    //GROUP SUM 5
    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;
        if (nums[start] % 5 == 0) {
            if((start+1)< nums.length && nums[start+1]==1){
                return groupSum5(start+2, nums, target-nums[start]);
            } else {
                return groupSum5(start+1, nums, target-nums[start]);
            }
        }
        return groupSum5(start + 1, nums, target - nums[start])
                || groupSum5(start + 1, nums, target);
    }

    //GROUP SUM CLUMP
    public boolean groupSumClump(int start, int[] nums, int target) {
        if(target==0) return true;
        if(start >= nums.length) return false;
        if(nums[start] > target){
            return groupSumClump(start+1, nums, target);
        } else if(nums[start] == target){
            return true;
        } else {
            if(start < nums.length-1 && nums[start] == nums[start+1]){
                int count =1;
                for(int i = start; i < nums.length; i++){
                    if(nums[i] == nums[i+1]) count++;
                    else break;
                }
                return groupSumClump(start+count, nums, target) || groupSumClump(start+count, nums, target-(nums[start]*count));
            }
        }
        return groupSumClump(start+1, nums, target) || groupSumClump(start+1, nums, target-nums[start]);
    }

    //SPLIT ARRAY
    public boolean splitArray(int[] nums) {
        return recursion(0,0,0, nums);

    }
    public boolean recursion(int index, int a, int b, int nums[]){
        if(index >= nums.length) return a==b;
        return recursion(index+1, a+nums[index], b, nums) || recursion(index+1, a, b+nums[index], nums);
    }

    //SPLIT ODD 10
    public boolean splitOdd10(int[] nums) {
        return recursion2(0, 0, 0, nums);
    }

    private boolean recursion2(int index, int a, int b, int[] nums) {
        if (index >= nums.length)
            return a % 10 == 0 && b % 2 == 1 || a % 2 == 1
                    && b % 10 == 0;
        return recursion2(index + 1, a + nums[index], b, nums)
                || recursion2(index + 1, a, b + nums[index], nums);
    }
    //SPLIT 53
    public boolean split53(int[] nums) {
        return recursion3(0,0,0, nums);
    }
    private boolean recursion3(int index, int a, int b, int[] nums) {
        if(index>= nums.length)
            return a==b ;
        if(nums[index]%5 == 0) return recursion3(index + 1, a + nums[index], b, nums);
        else if (nums[index]%3 == 0) return  recursion3(index + 1, a, b + nums[index], nums);
        else return recursion3(index + 1, a + nums[index], b, nums) || recursion3(index + 1, a, b + nums[index], nums);
    }
}

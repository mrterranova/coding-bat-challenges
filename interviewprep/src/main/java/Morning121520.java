public class Morning121520 {
    public static void main(String[] args) {
        System.out.println(groupSumClump(0, new int[]{2,4,4,8}, 14));
    }

    //Question and solution for today's session...
    public static boolean groupSumClump(int start, int[] nums, int target){
        if(target==0) return true;
        if(start >= nums.length) return false;

        if(nums[start] > target){
            return groupSumClump(start+1, nums, target);
        } else if(nums[start]==target){
            return true;
        } else {
            if(start < nums.length-1 && nums[start] == nums[start+1]){
                int count = 1;
                for (int i = start; i < nums.length ; i++) {
                    if(nums[i] == nums[i+1]) count++;
                    else break;
                }
                return groupSumClump(start+count, nums, target)|| groupSumClump(start+count, nums, target-(nums[start]*count));
            }
        }
        return groupSumClump(start+1, nums, target) || groupSumClump(start+1, nums, target-nums[start]);
    }
}

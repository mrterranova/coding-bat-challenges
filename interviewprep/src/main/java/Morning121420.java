public class Morning121420 {
    public static void main(String[] args) {
        int[] a = {2, 4, 8};
        System.out.println(groupSum(0, a, 10)); //true
        System.out.println(groupSum(0, a, 14)); //true
        System.out.println(groupSum(0, a,9)); //false
    }
    static boolean groupSum(int startIndex, int[] nums, int target){
//        if(startIndex >= nums.length){
//            return target == 0;
//        }
//        if(groupSum(startIndex+1, nums, target-nums[startIndex])) return true;
//        if(groupSum(startIndex+1, nums, target)) return true;
//        return false;
        if(startIndex >= nums.length){
            return target == 0;
        }
        if(nums[startIndex] > target){
            groupSum(startIndex+1, nums, target);
        } else if(nums[startIndex] == target) {
            return true;
        } else {
            return groupSum(startIndex+1, nums, target-nums[startIndex]) || groupSum(startIndex+1, nums, target);
        }
        return false;
    }
}

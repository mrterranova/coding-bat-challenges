public class Morning12920 {
    public static void main(String[] args) {
//        int[] nums = {1,1,1,1,1,2,3};//true
//        int[] nums1 = { 2,2};//true
//        int[] nums2 = { 2,2, 32};//false
//        int[] nums3 = { 2,3,5,5,5};//true
//        int[] nums4 = { 2,3,5,2,5,7};//true
        int[] nums5 = { 2,5,3};//false
        int[] nums6 = { 2,3,5};//true
//        System.out.println(canBalance(nums));
//        System.out.println(canBalance(nums1));
//        System.out.println(canBalance(nums2));
//        System.out.println(canBalance(nums3));
        System.out.println(canBalance(nums5));
        System.out.println(canBalance(nums6));
    }

    static boolean canBalance(int[] nums){
        //split array into 2 where sum is equal in both arrays?
        //must remove index once place - can't use over again

        if( nums.length <= 1) return false;
        int total = 0;
        for(int i =0; i < nums.length; i++){
            total += nums[i];

        }
        if(total%2==1) return false;
        int temp = nums[0];
        for(int j=1; j < nums.length; j++){
            if( temp < total/2 ){
                temp += nums[j];
            } else if (temp == total/2){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

}

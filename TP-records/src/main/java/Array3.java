public class Array3 {
    public static void main(String[] args) {

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

    //LINEAR IN

    //SQUARE UP

    //SERIES UP

    //MAX MIRROR

    //COUNT CLUMPS

}

public class Array2 {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 5};
        int[] a2 = {2, 2, 0};
        int[] a3 = {1, 3, 5};
        System.out.println(countEvens(a1));//
        System.out.println(countEvens(a2));//
        System.out.println(countEvens(a3));//

        int[] b1 = {10, 3, 5, 6};
        int[] b2 = {7, 2, 10, 9};
        int[] b3 = {2, 10, 7, 2};
        System.out.println(bigDiff(b1));//
        System.out.println(bigDiff(b2));//
        System.out.println(bigDiff(b3));//

        int[] c1 = {1, 2, 3, 4, 100};
        int[] c2 = {1, 1, 5, 5, 10, 8, 7};
        int[] c3 = {-10, -4, -2, -4, -2, 0};
        System.out.println(centeredAverage(c1));//
        System.out.println(centeredAverage(c2));//
        System.out.println(centeredAverage(c3));//

        int[] d1 = {1, 2, 2, 1};
        int[] d2 = {1, 1};
        int[] d3 = {1, 2, 2, 1, 13};
        System.out.println(sum13(d1));//6
        System.out.println(sum13(d2));//2
        System.out.println(sum13(d3));//6

        int[] e1 = {1, 2, 2};
        int[] e2 = {1, 2, 2, 6, 99, 99, 7};
        int[] e3 ={1, 1, 6, 7, 2};
        System.out.println(sum67(e1));//5
        System.out.println(sum67(e2));//5
        System.out.println(sum67(e3));//5

        int[] f1 = {1, 2, 2};
        int[] f2 = {1, 2, 1, 2};
        int[] f3 = {2, 1, 2};
        System.out.println(has22(f1));//true
        System.out.println(has22(f2));//false
        System.out.println(has22(f3));//false

        int[] g1 = {};
        int[] g2 = {};
        int[] g3 = {};
        System.out.println();//
        System.out.println();//
        System.out.println();//

    }
    static int countEvens(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 0){
                count++;
            }
        }
        return count;
    }

    static int bigDiff(int[] nums) {
        int biggest = 0, smallest= nums[0], res = 0;
        for(int i=0; i < nums.length; i++){
            biggest = Math.max(biggest, nums[i]);
            smallest = Math.min(smallest, nums[i]);

            if(biggest - smallest > res) res = biggest - smallest;
        }
        return res;
    }

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

    static int sum13(int[] nums) {
        int count = 0;
        if(nums.length<1) return 0;
        if(nums[0] == 13) return 0;
        for(int i=0; i < nums.length; i++){
            if(nums[i] == 13) break;
            count += nums[i];
        }
        return count;
    }

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

    static boolean has22(int[] nums) {
        for(int i=0; i < nums.length-1; i++){
            if(nums[i] == 2 && nums[i+1]==2){
                return true;
            }
        }
        return false;
    }
}

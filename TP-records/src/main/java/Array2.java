import java.util.ArrayList;
import java.util.List;

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

        int[] g1 = {0, 2, 4};
        int[] g2 = {1, 2, 3};
        int[] g3 = {1, 2, 4};
        System.out.println(lucky13(g1));//
        System.out.println(lucky13(g2));//
        System.out.println(lucky13(g3));//

        int[] h1 = {2, 3, 2, 2, 4, 2};
        int[] h2 = {2, 3, 2, 2, 4, 2, 2};
        int[] h3 = {1, 2, 3, 4};
        System.out.println(sum28(h1));
        System.out.println(sum28(h2));
        System.out.println(sum28(h3));

        int[] i1 = {1, 4, 1};
        int[] i2 = {1,4,1,4};
        int[] i3 = {1,1};
        System.out.println(more14(i1));
        System.out.println(more14(i2));
        System.out.println(more14(i3));

        System.out.println(fizzArray(4));
        System.out.println(fizzArray(0));
        System.out.println(fizzArray(10));

        System.out.println(fizzArray2(4));
        System.out.println(fizzArray2(10));
        System.out.println(fizzArray2(2));

        int[] j1 = {1,2,2}; //true
        int[] j2 = {4,4,1}; //true
        int[] j3 = {4,4,1,2,2};//false
        System.out.println(either24(j1));
        System.out.println(either24(j2));
        System.out.println(either24(j3));

        int[] k1 = fizzArray3(5,10); //5,6,7,8,9
        int[] k2 = fizzArray3(11,18); //11,12,13,14,15,16,17
        int[] k3 = fizzArray3(1,3); //1,2

        for(int i =0; i < k1.length; i++){
            System.out.println(k1[i]);
        }
        for(int i =0; i < k2.length; i++){
            System.out.println(k2[i]);
        }
        for(int i =0; i < k3.length; i++){
            System.out.println(k3[i]);
        }
        int[]l1 = {1, 2, 4, 1};//1,2
        int[]l2 = {3, 1, 4};//3,1
        int[]l3 = {1,4,4};//1
        int[]l1a = pre4(l1);
        int[]l2a = pre4(l2);
        int[]l3a = pre4(l3);
        for(int i =0; i < l1a.length; i++){
            System.out.println(l1a[i]);
        }
        for(int i =0; i < l2a.length; i++){
            System.out.println(l2a[i]);
        }
        for(int i =0; i < l3a.length; i++){
            System.out.println(l3a[i]);
        }

        int[]m1 = {2,4,1,2};
        int[]m2 = {4,1,4,2};
        int[]m3 = {4,4,1,2,3};



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

    static boolean lucky13(int[] nums) {
        for(int i =0; i < nums.length; i++){
            if(nums[i] == 1 || nums[i] == 3) return false;
        }
        return true;
    }

    static boolean sum28(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 2) count +=2;
        }
        if(count == 8) return true;
        return false;
    }

    static boolean more14(int[] nums) {
        int ones = 0, fours = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 1) ones++;
            if (nums[i] == 4) fours++;
        }
        if(ones > fours) return true;
        return false;
    }
    static int[] fizzArray(int n) {
        int[] fizz = new int[n];
        for(int i=0; i < n; i ++){
            fizz[i] = i;
        }
        return fizz;
    }

    static String[] fizzArray2(int n) {
        String[] fizz = new String[n];
        for(int i = 0; i < n; i++){
            fizz[i] = i +"";
        }
        return fizz;
    }

    public static boolean either24(int[] nums) {
        boolean twos = false, fours = false;
        for(int i=0; i < nums.length-1; i++){
            if(nums[i]== 2 && nums[i+1] ==2){
                twos = true;
            } else if (nums[i]==4 && nums[i+1]==4){
                fours = true;
            }
        }
        if(twos == true && fours == false) return true;
        else if(fours == true && twos == false) return true;
        else if(fours == true && twos == true) return false;
        else return false;
    }

    public static int[] fizzArray3(int start, int end) {
        List<Integer> resList = new ArrayList<Integer>();
        for(int i=start; i <end; i++){
            resList.add(i);
        }
        int[] res = new int[resList.size()];
        for(int j=0; j < resList.size(); j++){
            res[j] = resList.get(j);
        }
        return res;
    }

    public static int[] pre4(int[] nums) {
        List<Integer> resList = new ArrayList<Integer>();
        for(int i=0; i < nums.length; i++){
            if(nums[i]==4) break;
            resList.add(nums[i]);
        }
        int[] res = new int[resList.size()];
        for (int i =0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }

    public static int[] post4(int[] nums) {
        List<Integer> resList = new ArrayList<Integer>();
        for(int i=0; i< nums.length; i++){
            if(nums[i]==4) {
                resList.clear();
                for(int j=i+1; j < nums.length; j++ ){
                    resList.add(nums[j]);
                }
            }
        }
        int[] res = new int[resList.size()];
        int count = 0;
        for(int k =0; k< resList.size(); k++){
            res[count] = resList.get(k);
            count++;
        }
        return res;
    }

}
